package net.stickmanm.axontechnologies.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class OverdoseEffect extends StatusEffect {
    public OverdoseEffect() {
        super(StatusEffectCategory.HARMFUL, // whether beneficial or harmful for entities
                0x0); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {

            if (!entity.getWorld().isClient()) {

                if(entity.isPlayer()){
                    ((PlayerEntity) entity).getHungerManager().add(Amplifier - 1, 1.0f);
                }

                addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", -50f, EntityAttributeModifier.Operation.ADDITION)
                        .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "91AEAA56-376B-4498-935B-2F7F68070635", -50f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL)
                        .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "91AEAA56-376B-4498-935B-2F7F68070635", -1024f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL)
                        .addAttributeModifier(EntityAttributes.GENERIC_ATTACK_SPEED, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", -100f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL)
                        .addAttributeModifier(EntityAttributes.GENERIC_LUCK, "AF8B6E3F-3328-4C0A-AA36-5BA2BB9DBEF3", -255f, EntityAttributeModifier.Operation.MULTIPLY_TOTAL);
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1, 255, false, false, false));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.WITHER, -1, 255, false, false, false));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.POISON, -1, 255, false, false, false));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.DARKNESS, -1, 255, false, false, false));
                entity.addStatusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, -1, 255, false, false, false));
                entity.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, -1, 255, false, false, false));
                entity.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER, -1, 255, false, false, false));
                entity.damage(entity.getDamageSources().lightningBolt(), Float.MAX_VALUE);

            }



        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}