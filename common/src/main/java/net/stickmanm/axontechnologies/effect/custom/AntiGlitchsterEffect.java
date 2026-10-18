package net.stickmanm.axontechnologies.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class AntiGlitchsterEffect extends StatusEffect {
    public AntiGlitchsterEffect() {
        super(StatusEffectCategory.HARMFUL, // whether beneficial or harmful for entities
                0x8B0000); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {
        if (!entity.getWorld().isClient()) {

            if (entity.hasStatusEffect(ModEffects.GLITCHSTER.get())) {
                entity.removeStatusEffect(ModEffects.GLITCHSTER.get());
            } else if (entity.hasStatusEffect(ModEffects.GLITCHSTERII.get())) {
                entity.removeStatusEffect(ModEffects.GLITCHSTERII.get());
            } else if (entity.hasStatusEffect(ModEffects.GLITCHSTERIII.get())) {
                entity.removeStatusEffect(ModEffects.GLITCHSTERIII.get());
                entity.addStatusEffect(new StatusEffectInstance(ModEffects.NEUTRALIZED_GLITCHSTER.get(), 40));
            } else if (entity.hasStatusEffect(ModEffects.GLITCHSTERIV.get())) {
                entity.removeStatusEffect(ModEffects.GLITCHSTERIV.get());
                entity.addStatusEffect(new StatusEffectInstance(ModEffects.NEUTRALIZED_GLITCHSTER.get(), 40));
            } else if (entity.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER.get())) {
                entity.removeStatusEffect(ModEffects.ANTIGLITCHSTER.get());
            } else if (entity.hasStatusEffect(ModEffects.GLITCHSTERIV.get())) {
                entity.removeStatusEffect(ModEffects.GLITCHSTERIV.get());
            } else if (entity.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERII.get())) {
                entity.removeStatusEffect(ModEffects.ANTIGLITCHSTER.get());
            } else if (entity.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERIII.get())) {
                entity.removeStatusEffect(ModEffects.ANTIGLITCHSTER.get());
            }
        }


        entity.damage(entity.getDamageSources().lightningBolt(), 0.75f);



        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}