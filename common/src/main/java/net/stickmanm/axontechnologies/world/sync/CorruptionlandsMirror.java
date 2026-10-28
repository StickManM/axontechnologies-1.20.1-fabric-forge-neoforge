package net.stickmanm.axontechnologies.world.sync;

import dev.architectury.event.CompoundEventResult;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.BlockEvent;
import dev.architectury.event.events.common.ExplosionEvent;
import dev.architectury.event.events.common.InteractionEvent;
import dev.architectury.event.events.common.TickEvent;
import net.fabricmc.api.ModInitializer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.FluidBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.registry.Registries;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.block.custom.CustomPortalBlock;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.world.dimension.ModDimensions;
import net.minecraft.state.property.Properties;
import net.minecraft.state.property.Property;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class CorruptionlandsMirror {
    private static final int POSITIONS_PER_TICK = 2048;

    private static final Set<Long> DIRTY = new LinkedHashSet<>();

    private static Set<Block> keepAsIs;            // blocks that are already "corrupted" and are copied unchanged

    public static void register() {
        // Player breaks a block
        BlockEvent.BREAK.register((world, pos, state, player, xp) -> {
            mark(world, pos, 0);
            return EventResult.pass();
        });

        // Player places a block
        BlockEvent.PLACE.register((world, pos, state, placer) -> {
            mark(world, pos, 1);
            return EventResult.pass();
        });

        // Right clicking a block (covers placing/scooping fluids next to the clicked block)
        InteractionEvent.RIGHT_CLICK_BLOCK.register((player, hand, pos, face) -> {
            mark(player.getWorld(), pos, 1);
            return EventResult.pass();
        });

        // Right clicking with an item, e.g. buckets that target a fluid block
        InteractionEvent.RIGHT_CLICK_ITEM.register((player, hand) -> {
            if (player instanceof ServerPlayerEntity && CorruptionlandsMirror.isThunderlands(player.getWorld())) {
                HitResult hit = player.raycast(5.0, 1.0f, true);
                if (hit instanceof BlockHitResult blockHit && hit.getType() == HitResult.Type.BLOCK) {
                    mark(player.getWorld(), blockHit.getBlockPos(), 1);
                }
            }
            return CompoundEventResult.pass();
        });

        // Explosions: every block the explosion destroys
        ExplosionEvent.DETONATE.register((world, explosion, affectedEntities) -> {
            if (isThunderlands(world)) {
                for (BlockPos pos : explosion.getAffectedBlocks()) {
                    mark(world, pos, 0);
                }
            }
        });

        // Copy the dirty positions at the end of the Thunderlands' tick
        TickEvent.SERVER_LEVEL_POST.register(world -> {
            if (DIRTY.isEmpty() || !world.getRegistryKey().equals(ModDimensions.THUNDERLANDS_DIMENSION_KEY)) return;

            ServerWorld target = world.getServer().getWorld(ModDimensions.CORRUPTIONLANDS_DIMENSION_KEY);
            if (target == null) {
                DIRTY.clear();
                return;
            }

            Iterator<Long> it = DIRTY.iterator();
            int processed = 0;
            while (it.hasNext() && processed++ < POSITIONS_PER_TICK) {
                BlockPos pos = BlockPos.fromLong(it.next());
                it.remove();
                copy(world, target, pos);
            }
        });
    }

    private static boolean isThunderlands(World world) {
        return !world.isClient && world.getRegistryKey().equals(ModDimensions.THUNDERLANDS_DIMENSION_KEY);
    }

    /** Marks pos (and everything within `radius` blocks of it) to be copied at the end of the tick. */
    private static void mark(World world, BlockPos pos, int radius) {
        if (!isThunderlands(world)) return;
        for (int dx = -radius; dx <= radius; dx++) {
            for (int dy = -radius; dy <= radius; dy++) {
                for (int dz = -radius; dz <= radius; dz++) {
                    DIRTY.add(pos.add(dx, dy, dz).asLong());
                }
            }
        }
    }

    private static void copy(ServerWorld source, ServerWorld target, BlockPos pos) {
        if (target.isOutOfHeightLimit(pos)) return;

        BlockState mapped = convert(source, pos, source.getBlockState(pos));
        if (mapped == null) return; // nothing to copy for this position

        if (target.getBlockState(pos) != mapped) {
            target.setBlockState(pos, mapped, Block.NOTIFY_LISTENERS | Block.FORCE_STATE);
        }
    }

    //Default state of `target`, with every property that both blocks share copied from `from`.
    private static BlockState withSharedProperties(BlockState from, Block target) {
        BlockState out = target.getDefaultState();
        for (Property<?> p : from.getProperties()) {
            out = copyProperty(from, out, p);
        }
        return out;
    }

    private static <T extends Comparable<T>> BlockState copyProperty(BlockState from, BlockState to, Property<T> p) {
        if (p == Properties.WATERLOGGED) return to; // don't carry water into the Corruptionlands
        return to.contains(p) ? to.with(p, from.get(p)) : to;
    }

    /**
     * Converts a Thunderlands block into what should exist at the same spot in the Corruptionlands.
     * Returns null when the position should be left alone.
     */
    private static BlockState convert(ServerWorld source, BlockPos pos, BlockState state) {
        Block block = state.getBlock();
        BlockState air = Blocks.AIR.getDefaultState();

        if (state.isAir()) return air;

        // Portals: only Corruptionlands portals are mirrored (copied exactly), every other portal becomes air
        if (isPortalBlock(block)) {
            return isCorruptionPortal(source, pos, block) ? state : air;
        }

        // Fluids: any fluid source becomes liquid corruption. Flowing fluid is left alone, the
        // liquid corruption source flows by itself.
        if (block instanceof FluidBlock) {
            return state.getFluidState().isStill()
                    ? ModFluids.LIQUID_CORRUPTION_BLOCK.get().getDefaultState()
                    : null;
        }

        // Leaves of any wood set are not reflected
        if (state.isIn(BlockTags.LEAVES)) return air;

        // Dirt
        if (state.isOf(Blocks.DIRT) || state.isOf(ModBlocks.CHARGED_DIRT.get()) || state.isOf(ModBlocks.CORRUPTED_DIRT.get())) {
            return ModBlocks.CORRUPTED_DIRT.get().getDefaultState();
        }

        // Stone
        if (state.isOf(Blocks.STONE) || state.isOf(ModBlocks.THUNDERED_STONE.get()) || state.isOf(ModBlocks.CORRUPTED_STONE.get())) {
            return ModBlocks.CORRUPTED_STONE.get().getDefaultState();
        }

        // Portal frame
        if (state.isOf(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get())) {
            return ModBlocks.CORRUPTION_PORTAL_FRAME.get().getDefaultState();
        }

        // Every wood set (vanilla, modded, thundered, corrupted) -> the corrupted wood set
        BlockState wood = convertWood(state);
        if (wood != null) return wood;

        // Already-corrupted blocks are copied exactly
        if (keepAsIs().contains(block)) return state;


        // Everything else
        return ModBlocks.CORRUPTION_BLOCK.get().getDefaultState();
    }

    /** Logs, wood, stripped variants, planks and saplings of any wood type. Returns null for non-wood blocks. */
    private static BlockState convertWood(BlockState state) {
        if (state.isIn(BlockTags.LOGS)) {
            String path = Registries.BLOCK.getId(state.getBlock()).getPath();
            boolean stripped = path.startsWith("stripped_");
            boolean bark = path.endsWith("_wood") || path.endsWith("_hyphae");

            Block result;
            if (stripped) result = bark ? ModBlocks.STRIPPED_CORRUPTED_WOOD.get() : ModBlocks.STRIPPED_CORRUPTED_LOG.get();
            else          result = bark ? ModBlocks.CORRUPTED_WOOD.get()          : ModBlocks.CORRUPTED_LOG.get();
            return withSharedProperties(state, result);
        }
        if (state.isIn(BlockTags.PLANKS))                 return withSharedProperties(state, ModBlocks.CORRUPTED_PLANKS.get());
        if (state.isIn(BlockTags.SAPLINGS))               return withSharedProperties(state, ModBlocks.CORRUPTED_SAPLING.get());
        if (state.isIn(BlockTags.WOODEN_BUTTONS))         return withSharedProperties(state, ModBlocks.CORRUPTED_BUTTON.get());
        if (state.isIn(BlockTags.WOODEN_PRESSURE_PLATES)) return withSharedProperties(state, ModBlocks.CORRUPTED_PRESSURE_PLATE.get());
        if (state.isIn(BlockTags.WOODEN_SLABS))           return withSharedProperties(state, ModBlocks.CORRUPTED_SLAB.get());
        if (state.isIn(BlockTags.WOODEN_STAIRS))          return withSharedProperties(state, ModBlocks.CORRUPTED_STAIRS.get());
        if (state.isIn(BlockTags.WOODEN_FENCES))          return withSharedProperties(state, ModBlocks.CORRUPTED_FENCE.get());
        if (state.isIn(BlockTags.FENCE_GATES))            return withSharedProperties(state, ModBlocks.CORRUPTED_FENCE_GATE.get());
        if (state.isIn(BlockTags.WOODEN_DOORS))           return withSharedProperties(state, ModBlocks.CORRUPTED_DOOR.get());
        if (state.isIn(BlockTags.WOODEN_TRAPDOORS))       return withSharedProperties(state, ModBlocks.CORRUPTED_TRAPDOOR.get());
        return null;
    }



    private static boolean isPortalBlock(Block block) {
        if (block == Blocks.NETHER_PORTAL || block == Blocks.END_PORTAL || block == Blocks.END_GATEWAY) return true;
        if (block instanceof CustomPortalBlock) return true; // Forge custom portals (this mod)
        return Registries.BLOCK.getId(block).getNamespace().equals("customportalapi"); // Fabric Custom Portal API
    }

    /**
     * A portal is a Corruptionlands portal when the frame around it is the corruption portal frame.
     * Works for both loaders: walk away from the portal block in every direction until the first
     * non-portal block, and check whether that block is the corruption frame.
     */
    private static boolean isCorruptionPortal(ServerWorld world, BlockPos pos, Block portal) {
        Block frame = ModBlocks.CORRUPTION_PORTAL_FRAME.get();
        for (Direction dir : Direction.values()) {
            BlockPos.Mutable cursor = pos.mutableCopy();
            for (int i = 0; i < 24; i++) { // portals are at most 21 wide
                cursor.move(dir);
                Block b = world.getBlockState(cursor).getBlock();
                if (b == portal) continue;
                if (b == frame) return true;
                break;
            }
        }
        return false;
    }

    private static Set<Block> keepAsIs() {
        if (keepAsIs == null) {
            Set<Block> set = new HashSet<>();
            set.add(ModBlocks.CORRUPTION_BLOCK.get());
            set.add(ModBlocks.CORRUPTION_PORTAL_FRAME.get());
            keepAsIs = set;
        }
        return keepAsIs;
    }
}