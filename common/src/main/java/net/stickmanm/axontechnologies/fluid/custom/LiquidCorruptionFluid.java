package net.stickmanm.axontechnologies.fluid.custom;

import dev.architectury.core.fluid.ArchitecturyFlowingFluid;
import dev.architectury.core.fluid.ArchitecturyFluidAttributes;
import net.minecraft.block.BlockState;
import net.minecraft.fluid.FluidState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.stickmanm.axontechnologies.block.ModBlocks;

/** Fluid behaviour only. Everything else (textures, buckets, ...) is configured in ModFluids through Architectury. */
public class LiquidCorruptionFluid {
    public static class Source extends ArchitecturyFlowingFluid.Source {
        public Source(ArchitecturyFluidAttributes attributes) {
            super(attributes);
        }

        @Override
        public void onRandomTick(World world, BlockPos pos, FluidState state, Random random) {
            LavaLikeFluids.randomTick(world, pos, random);
        }

        @Override
        protected void flow(WorldAccess world, BlockPos pos, BlockState state, Direction direction, FluidState fluidState) {
            if (LavaLikeFluids.waterInteraction(this, world, pos, state, direction, ModBlocks.CORRUPTED_STONE.get(), ModBlocks.DREADSTONE.get()))
                return;
            super.flow(world, pos, state, direction, fluidState);
        }
    }

    public static class Flowing extends ArchitecturyFlowingFluid.Flowing {
        public Flowing(ArchitecturyFluidAttributes attributes) {
            super(attributes);
        }

        @Override
        public void onRandomTick(World world, BlockPos pos, FluidState state, Random random) {
            LavaLikeFluids.randomTick(world, pos, random);
        }

        @Override
        protected void flow(WorldAccess world, BlockPos pos, BlockState state, Direction direction, FluidState fluidState) {
            if (LavaLikeFluids.waterInteraction(this, world, pos, state, direction, ModBlocks.CORRUPTED_STONE.get(), ModBlocks.DREADSTONE.get()))
                return;
            super.flow(world, pos, state, direction, fluidState);
        }
    }
}
