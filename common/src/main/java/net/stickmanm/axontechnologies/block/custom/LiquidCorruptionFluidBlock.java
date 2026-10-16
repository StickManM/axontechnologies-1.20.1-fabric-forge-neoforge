package net.stickmanm.axontechnologies.block.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.FluidBlock;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Difficulty;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class LiquidCorruptionFluidBlock extends FluidBlock {
    public LiquidCorruptionFluidBlock(FlowableFluid fluid, Settings settings) {
        super(fluid, settings);
    }

    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (!world.isClient && world.getDifficulty() != Difficulty.PEACEFUL) {
            if (entity instanceof LivingEntity livingEntity) {
                if (!livingEntity.isInvulnerableTo(world.getDamageSources().lightningBolt())) {
                    livingEntity.addStatusEffect(new StatusEffectInstance(ModEffects.THUNDER_POISONING, 4));
                    livingEntity.removeStatusEffect(ModEffects.ANTI_CORRUPTED_GLITCHSTER);
                }
            }

        }
    }
}