package net.stickmanm.axontechnologies.event;

import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.BlockEvent;
import dev.architectury.event.events.common.TickEvent;
import net.minecraft.advancement.criterion.Criteria;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockPattern;
import net.minecraft.block.pattern.BlockPatternBuilder;
import net.minecraft.block.pattern.CachedBlockPosition;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.entity.custom.ThunderaniumGolemEntity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Build a Thunderanium Golem like an iron golem: a T of four Thunderanium blocks (three across the top,
 * one below the middle) with a carved pumpkin or jack o'lantern placed on top last.
 *
 * Architectury's BlockEvent.PLACE fires BEFORE the block exists, so placed pumpkins are queued and the pattern
 * is checked at the end of that world's tick, once the pumpkin is really there.
 */
public class ThunderaniumGolemBuilder {
    private static final Map<RegistryKey<World>, Set<BlockPos>> PENDING = new HashMap<>();
    private static BlockPattern pattern;

    public static void register() {
        BlockEvent.PLACE.register((world, pos, state, placer) -> {
            if (!world.isClient && isHead(state)) {
                PENDING.computeIfAbsent(world.getRegistryKey(), k -> new LinkedHashSet<>()).add(pos.toImmutable());
            }
            return EventResult.pass();
        });

        TickEvent.SERVER_LEVEL_POST.register(world -> {
            Set<BlockPos> queued = PENDING.get(world.getRegistryKey());
            if (queued == null || queued.isEmpty()) return;
            List<BlockPos> toCheck = new ArrayList<>(queued);
            queued.clear();
            for (BlockPos pos : toCheck) trySpawn(world, pos);
        });
    }

    private static boolean isHead(BlockState state) {
        return state.isOf(Blocks.CARVED_PUMPKIN) || state.isOf(Blocks.JACK_O_LANTERN);
        // only plain carved pumpkins? use: return state.isOf(Blocks.CARVED_PUMPKIN);
    }

    /** Same shape as the vanilla iron golem pattern; "~" cells must be air. Works along either horizontal axis. */
    private static BlockPattern getPattern() {
        if (pattern == null) {
            pattern = BlockPatternBuilder.start()
                    .aisle("~^~", "###", "~#~")
                    .where('^', CachedBlockPosition.matchesBlockState(ThunderaniumGolemBuilder::isHead))
                    .where('#', CachedBlockPosition.matchesBlockState(s -> s.isOf(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get())))
                    .where('~', CachedBlockPosition.matchesBlockState(AbstractBlock.AbstractBlockState::isAir))
                    .build();
        }
        return pattern;
    }

    private static void trySpawn(ServerWorld world, BlockPos pos) {
        if (!isHead(world.getBlockState(pos))) return;                   // pumpkin was removed/replaced already

        BlockPattern.Result result = getPattern().searchAround(world, pos);
        if (result == null) return;

        ThunderaniumGolemEntity golem = ModEntities.THUNDERANIUM_GOLEM.get().create(world);
        if (golem == null) return;
        golem.setPlayerCreated(true);                                    // friendly to the player who built it

        // remove the pattern blocks (with the block-break effect, like the vanilla golem)
        for (int x = 0; x < getPattern().getWidth(); x++) {
            for (int y = 0; y < getPattern().getHeight(); y++) {
                CachedBlockPosition cached = result.translate(x, y, 0);
                world.setBlockState(cached.getBlockPos(), Blocks.AIR.getDefaultState(), Block.NOTIFY_LISTENERS);
                world.syncWorldEvent(2001, cached.getBlockPos(), Block.getRawIdFromState(cached.getBlockState()));
            }
        }

        BlockPos spawn = result.translate(1, 2, 0).getBlockPos();       // bottom-centre block
        golem.refreshPositionAndAngles(spawn.getX() + 0.5, spawn.getY() + 0.05, spawn.getZ() + 0.5, 0.0F, 0.0F);
        world.spawnEntity(golem);

        for (ServerPlayerEntity player : world.getNonSpectatingEntities(ServerPlayerEntity.class, golem.getBoundingBox().expand(5.0))) {
            Criteria.SUMMONED_ENTITY.trigger(player, golem);
        }
        for (int x = 0; x < getPattern().getWidth(); x++) {
            for (int y = 0; y < getPattern().getHeight(); y++) {
                world.updateNeighbors(result.translate(x, y, 0).getBlockPos(), Blocks.AIR);
            }
        }
    }
}