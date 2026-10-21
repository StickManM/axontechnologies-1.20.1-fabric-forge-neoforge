package net.stickmanm.axontechnologies.world.portal;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.InteractionEvent;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.block.custom.CustomPortalBlock;
import net.stickmanm.axontechnologies.item.ModItems;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Supplier;

import static net.stickmanm.axontechnologies.world.dimension.ModDimensions.*;

/**
 * Loader-independent custom portals (Forge uses this; Fabric keeps using Custom Portal API).
 * Frame block + right clicking with the igniter item lights a portal; standing in it teleports to the target dimension,
 * a portal inside the target dimension leads back to the overworld.
 */
public class ModPortals {
    public static final DeferredRegister<Block> PORTAL_BLOCKS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.BLOCK);

    public static final List<PortalDef> PORTALS = new ArrayList<>();

    private static final int WAIT_TICKS = 80;       // 4 seconds in survival, like the nether portal
    private static final int SEARCH_RADIUS = 16;
    private static final int MAX_FRAME = 21;

    // player -> {first tick inside, last tick inside}
    private static final Map<UUID, long[]> IN_PORTAL = new ConcurrentHashMap<>();

    public static final PortalDef DREAD_CAVERNS = define("dreadcaverns", () -> ModBlocks.VOIDSTONE.get(),
            DCDIM_DIMENSION_KEY, 0x000000, () -> ModItems.DREADED_IGNITER.get(), true);
    public static final PortalDef MIMIC_WORLD = define("mimicworld", () -> ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get(),
            MIMDIM_DIMENSION_KEY, 0x90EE90, () -> ModItems.MIMICARIUM_IGNITER.get(), false);
    public static final PortalDef THUNDERLANDS = define("thunderlands", () -> ModBlocks.THUNDERANIUM_PORTAL_FRAME.get(),
            THUNDERLANDS_DIMENSION_KEY, 0xAAA9AD, () -> ModItems.THUNDERANIUM_KEY.get(), false);
    public static final PortalDef CORRUPTIONLANDS = define("corruptionlands", () -> ModBlocks.CORRUPTION_PORTAL_FRAME.get(),
            CORRUPTIONLANDS_DIMENSION_KEY, 0x8B0000, () -> ModItems.CORRUPTION_GATEWAY.get(), false);

    private static PortalDef define(String name, Supplier<Block> frame, net.minecraft.registry.RegistryKey<World> dest,
                                    int tint, Supplier<net.minecraft.item.Item> igniter, boolean flat) {
        PortalDef def = new PortalDef(name, frame, dest, tint, igniter, flat);
        def.portalBlock = PORTAL_BLOCKS.register(name + "_portal", () -> new CustomPortalBlock(def,
                AbstractBlock.Settings.copy(Blocks.NETHER_PORTAL)));
        PORTALS.add(def);
        return def;
    }

    /** Call once from the Forge mod constructor. */
    public static void init() {
        PORTAL_BLOCKS.register();
        InteractionEvent.RIGHT_CLICK_BLOCK.register(ModPortals::onRightClickBlock);
    }

    // ------------------------------------------------------------------ lighting

    private static EventResult onRightClickBlock(PlayerEntity player, Hand hand, BlockPos pos, Direction face) {
        World world = player.getWorld();
        if (world.isClient())
            return EventResult.pass();

        ItemStack held = player.getStackInHand(hand);
        if (held.isEmpty())
            return EventResult.pass();

        BlockState clicked = world.getBlockState(pos);
        for (PortalDef def : PORTALS) {
            if (!held.isOf(def.igniter.get()) || !clicked.isOf(def.frame.get()))
                continue;

            BlockPos start = pos.offset(face);
            boolean lit = false;
            if (def.flat) {
                lit = tryLight(world, start, Direction.Axis.Y, def);
            } else {
                lit = tryLight(world, start, Direction.Axis.X, def) || tryLight(world, start, Direction.Axis.Z, def);
            }
            if (lit) {
                world.playSound(null, start, SoundEvents.BLOCK_PORTAL_TRIGGER, SoundCategory.BLOCKS, 0.5f, 1.0f);
                return EventResult.interruptTrue();
            }
        }
        return EventResult.pass();
    }

    private static boolean tryLight(World world, BlockPos start, Direction.Axis axis, PortalDef def) {
        List<BlockPos> interior = findFrame(world, start, axis, def.frame.get());
        if (interior == null)
            return false;
        BlockState portal = def.portalBlock.get().getDefaultState().with(CustomPortalBlock.AXIS, axis);
        for (BlockPos p : interior)
            world.setBlockState(p, portal, Block.NOTIFY_LISTENERS | Block.FORCE_STATE);
        return true;
    }

    /**
     * Flood fills the air inside a frame in the plane of the given axis. Returns the interior positions if it is a
     * closed rectangle (at least 2 wide and 3 tall, or 2x2 for flat portals), otherwise null.
     */
    private static List<BlockPos> findFrame(World world, BlockPos start, Direction.Axis axis, Block frame) {
        if (!isReplaceable(world.getBlockState(start)))
            return null;

        Direction[] dirs = CustomPortalBlock.planeDirections(axis);
        Set<BlockPos> seen = new HashSet<>();
        Deque<BlockPos> queue = new ArrayDeque<>();
        queue.add(start);
        seen.add(start);

        while (!queue.isEmpty()) {
            BlockPos cur = queue.poll();
            for (Direction d : dirs) {
                BlockPos next = cur.offset(d);
                if (seen.contains(next))
                    continue;
                BlockState state = world.getBlockState(next);
                if (isReplaceable(state)) {
                    seen.add(next);
                    if (seen.size() > MAX_FRAME * MAX_FRAME)
                        return null;
                    queue.add(next);
                } else if (!state.isOf(frame)) {
                    return null; // leak: something that is neither air nor frame
                }
            }
        }

        int minX = Integer.MAX_VALUE, maxX = Integer.MIN_VALUE, minY = Integer.MAX_VALUE, maxY = Integer.MIN_VALUE,
                minZ = Integer.MAX_VALUE, maxZ = Integer.MIN_VALUE;
        for (BlockPos p : seen) {
            minX = Math.min(minX, p.getX()); maxX = Math.max(maxX, p.getX());
            minY = Math.min(minY, p.getY()); maxY = Math.max(maxY, p.getY());
            minZ = Math.min(minZ, p.getZ()); maxZ = Math.max(maxZ, p.getZ());
        }
        int sx = maxX - minX + 1, sy = maxY - minY + 1, sz = maxZ - minZ + 1;
        if (sx * sy * sz != seen.size())
            return null; // not a rectangle

        boolean ok;
        switch (axis) {
            case X -> ok = sx >= 2 && sy >= 3 && sz == 1;
            case Z -> ok = sz >= 2 && sy >= 3 && sx == 1;
            default -> ok = sx >= 2 && sz >= 2 && sy == 1;
        }
        if (!ok || seen.size() > MAX_FRAME * MAX_FRAME)
            return null;
        return new ArrayList<>(seen);
    }

    private static boolean isReplaceable(BlockState state) {
        return state.isAir() || state.isOf(Blocks.FIRE) || state.isOf(Blocks.SOUL_FIRE);
    }

    // ------------------------------------------------------------------ travelling

    /** Called every tick a player is inside one of our portal blocks. */
    public static void playerInPortal(ServerPlayerEntity player, PortalDef def) {
        if (player.hasPortalCooldown()) {
            player.resetPortalCooldown(); // keep the cooldown up while standing in the portal we arrived in
            IN_PORTAL.remove(player.getUuid());
            return;
        }

        long now = player.getServerWorld().getTime();
        long[] t = IN_PORTAL.get(player.getUuid());
        if (t == null || now - t[1] > 4) {
            t = new long[]{now, now};
            IN_PORTAL.put(player.getUuid(), t);
        }
        t[1] = now;

        int needed = player.isCreative() ? 1 : WAIT_TICKS;
        if (now - t[0] < needed)
            return;

        IN_PORTAL.remove(player.getUuid());
        travel(player, def);
    }

    private static void travel(ServerPlayerEntity player, PortalDef def) {
        MinecraftServer server = player.getServer();
        if (server == null)
            return;

        ServerWorld from = player.getServerWorld();
        ServerWorld to = from.getRegistryKey() == def.destination ? server.getOverworld() : server.getWorld(def.destination);
        if (to == null)
            return;

        BlockPos center = BlockPos.ofFloored(player.getX(), player.getY(), player.getZ());
        double[] exit = findOrCreate(to, center, def);
        if (exit == null)
            return;

        player.resetPortalCooldown();
        player.teleport(to, exit[0], exit[1], exit[2], player.getYaw(), player.getPitch());
        player.resetPortalCooldown();
    }

    /** @return {x, y, z} to place the player at */
    private static double[] findOrCreate(ServerWorld world, BlockPos center, PortalDef def) {
        Block portalBlock = def.portalBlock.get();

        // 1) look for an existing portal of ours nearby
        BlockPos best = null;
        double bestDist = Double.MAX_VALUE;
        int bottom = world.getBottomY();
        int top = world.getTopY();
        for (int x = center.getX() - SEARCH_RADIUS; x <= center.getX() + SEARCH_RADIUS; x++) {
            for (int z = center.getZ() - SEARCH_RADIUS; z <= center.getZ() + SEARCH_RADIUS; z++) {
                world.getChunk(x >> 4, z >> 4); // loads the chunk
                for (int y = bottom; y < top; y++) {
                    BlockPos p = new BlockPos(x, y, z);
                    if (world.getBlockState(p).isOf(portalBlock)) {
                        double d = p.getSquaredDistance(center);
                        if (d < bestDist) {
                            bestDist = d;
                            best = p;
                        }
                    }
                }
            }
        }
        if (best != null)
            return exitNextTo(world, best);

        // 2) build a new one
        return buildPortal(world, center, def);
    }

    private static double[] exitNextTo(ServerWorld world, BlockPos portalPos) {
        BlockState state = world.getBlockState(portalPos);
        Direction.Axis axis = state.get(CustomPortalBlock.AXIS);

        if (axis == Direction.Axis.Y) {
            // stand on top of a frame block next to the flat portal
            for (Direction d : Direction.Type.HORIZONTAL) {
                BlockPos side = portalPos.offset(d);
                if (!world.getBlockState(side).isOf(state.getBlock()) && isSafe(world, side.up()))
                    return new double[]{side.getX() + 0.5, side.getY() + 1, side.getZ() + 0.5};
            }
            return new double[]{portalPos.getX() + 0.5, portalPos.getY() + 1, portalPos.getZ() + 0.5};
        }

        BlockPos bottom = portalPos;
        while (world.getBlockState(bottom.down()).isOf(state.getBlock()))
            bottom = bottom.down();

        Direction normal = axis == Direction.Axis.X ? Direction.SOUTH : Direction.EAST;
        for (Direction d : new Direction[]{normal, normal.getOpposite()}) {
            BlockPos spot = bottom.offset(d);
            if (isSafe(world, spot))
                return new double[]{spot.getX() + 0.5, spot.getY(), spot.getZ() + 0.5};
        }
        return new double[]{bottom.getX() + 0.5, bottom.getY(), bottom.getZ() + 0.5};
    }

    private static boolean isSafe(ServerWorld world, BlockPos feet) {
        return world.getBlockState(feet).getCollisionShape(world, feet).isEmpty()
                && world.getBlockState(feet.up()).getCollisionShape(world, feet.up()).isEmpty()
                && !world.getBlockState(feet.down()).getCollisionShape(world, feet.down()).isEmpty();
    }

    private static double[] buildPortal(ServerWorld world, BlockPos center, PortalDef def) {
        int x = center.getX();
        int z = center.getZ();
        world.getChunk(x >> 4, z >> 4);

        int bottom = world.getBottomY() + 4;
        int top = world.getTopY() - 8;
        int y;
        if (world.getDimension().hasCeiling())
            y = Math.max(bottom, Math.min(top, center.getY()));
        else
            y = Math.max(bottom, Math.min(top, world.getTopY(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, x, z)));

        Block frame = def.frame.get();
        BlockState frameState = frame.getDefaultState();
        BlockState air = Blocks.AIR.getDefaultState();
        int flags = Block.NOTIFY_LISTENERS | Block.FORCE_STATE;

        if (def.flat) {
            // 4x4 frame ring (2x2 portal) lying flat at height y, with room above it
            for (int dx = -2; dx <= 3; dx++)
                for (int dz = -2; dz <= 3; dz++)
                    for (int dy = 1; dy <= 3; dy++)
                        world.setBlockState(new BlockPos(x + dx, y + dy, z + dz), air, flags);
            BlockState portal = def.portalBlock.get().getDefaultState().with(CustomPortalBlock.AXIS, Direction.Axis.Y);
            for (int dx = -1; dx <= 2; dx++) {
                for (int dz = -1; dz <= 2; dz++) {
                    boolean inner = dx >= 0 && dx <= 1 && dz >= 0 && dz <= 1;
                    world.setBlockState(new BlockPos(x + dx, y, z + dz), inner ? portal : frameState, flags);
                }
            }
            return new double[]{x - 0.5, y + 1, z + 0.5};
        }

        // vertical portal along X: frame 4 wide x 5 tall, portal 2x3, floor platform around it
        for (int dx = -1; dx <= 2; dx++)
            for (int dz = -1; dz <= 1; dz++) {
                world.setBlockState(new BlockPos(x + dx, y, z + dz), frameState, flags); // floor
                for (int dy = 1; dy <= 4; dy++)
                    world.setBlockState(new BlockPos(x + dx, y + dy, z + dz), air, flags);
            }
        for (int dx = -1; dx <= 2; dx++) {
            world.setBlockState(new BlockPos(x + dx, y + 4, z), frameState, flags); // top
        }
        for (int dy = 1; dy <= 3; dy++) {
            world.setBlockState(new BlockPos(x - 1, y + dy, z), frameState, flags);
            world.setBlockState(new BlockPos(x + 2, y + dy, z), frameState, flags);
        }
        BlockState portal = def.portalBlock.get().getDefaultState().with(CustomPortalBlock.AXIS, Direction.Axis.X);
        for (int dx = 0; dx <= 1; dx++)
            for (int dy = 1; dy <= 3; dy++)
                world.setBlockState(new BlockPos(x + dx, y + dy, z), portal, flags);

        return new double[]{x + 1.0, y + 1, z + 1.5};
    }
}
