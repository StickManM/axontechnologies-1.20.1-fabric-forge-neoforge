package net.stickmanm.axontechnologies.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class AntiCorruptedGlitchsterEffect extends StatusEffect {
    public AntiCorruptedGlitchsterEffect() {
        super(StatusEffectCategory.NEUTRAL, // whether beneficial or harmful for entities
                0x98D982); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {


       if (!entity.getWorld().isClient()) {
           if(entity.hasStatusEffect(ModEffects.GLITCHSTER) ||
                   entity.hasStatusEffect(ModEffects.GLITCHSTERII) ||
                   entity.hasStatusEffect(ModEffects.GLITCHSTERIII) ||
                   entity.hasStatusEffect(ModEffects.GLITCHSTERIV) ||
                   entity.hasStatusEffect(ModEffects.GLITCHSTERV)) {
               entity.removeStatusEffect(this);
           }
           entity.damage(entity.getDamageSources().lightningBolt(), 0.5f);
        }



        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}