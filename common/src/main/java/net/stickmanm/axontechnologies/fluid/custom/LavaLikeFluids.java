package net.stickmanm.axontechnologies.fluid.custom;

import net.minecraft.block.AbstractFireBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.*;

/** Lava-like behaviour (fire spreading, turning into stone when meeting water) shared by the mod's hot fluids. */
final class LavaLikeFluids {
    private LavaLikeFluids() {}

    static void randomTick(World world, BlockPos pos, Random random) {
        if (!world.getGameRules().getBoolean(GameRules.DO_FIRE_TICK)) {
            return;
        }
        int i = random.nextInt(3);
        if (i > 0) {
            BlockPos blockPos = pos;
            for (int j = 0; j < i; ++j) {
                if (!world.canSetBlock(blockPos = blockPos.add(random.nextInt(3) - 1, 1, random.nextInt(3) - 1))) {
                    return;
                }
                BlockState blockState = world.getBlockState(blockPos);
                if (blockState.isAir()) {
                    if (!canLightFire(world, blockPos)) continue;
                    world.setBlockState(blockPos, AbstractFireBlock.getState(world, blockPos));
                    return;
                }
                if (!blockState.blocksMovement()) continue;
                return;
            }
        } else {
            for (int k = 0; k < 3; ++k) {
                BlockPos blockPos2 = pos.add(random.nextInt(3) - 1, 0, random.nextInt(3) - 1);
                if (!world.canSetBlock(blockPos2)) {
                    return;
                }
                if (!world.isAir(blockPos2.up()) || !hasBurnableBlock(world, blockPos2)) continue;
                world.setBlockState(blockPos2.up(), AbstractFireBlock.getState(world, blockPos2));
            }
        }
    }

    private static boolean canLightFire(WorldView world, BlockPos pos) {
        for (Direction direction : Direction.values()) {
            if (!hasBurnableBlock(world, pos.offset(direction))) continue;
            return true;
        }
        return false;
    }

    private static boolean hasBurnableBlock(WorldView world, BlockPos pos) {
        if (pos.getY() >= world.getBottomY() && pos.getY() < world.getTopY() && !world.isChunkLoaded(pos)) {
            return false;
        }
        return world.getBlockState(pos).isBurnable();
    }

    /**
     * Fluid meeting water: turns into {@code stoneDown} when flowing down, {@code stoneUp} when flowing up.
     * @return true when the interaction happened (the normal flow should be skipped)
     */
    static boolean waterInteraction(Fluid self, WorldAccess world, BlockPos pos, BlockState state, Direction direction,
                                    Block stoneDown, Block stoneUp) {
        if (direction != Direction.DOWN && direction != Direction.UP)
            return false;
        FluidState fluidState = world.getFluidState(pos);
        if (self.isIn(FluidTags.LAVA) && fluidState.isIn(FluidTags.WATER)) {
            if (state.getBlock() instanceof FluidBlock) {
                Block result = direction == Direction.DOWN ? stoneDown : stoneUp;
                world.setBlockState(pos, result.getDefaultState(), Block.NOTIFY_ALL);
            }
            world.syncWorldEvent(WorldEvents.LAVA_EXTINGUISHED, pos, 0);
            return true;
        }
        return false;
    }
}
