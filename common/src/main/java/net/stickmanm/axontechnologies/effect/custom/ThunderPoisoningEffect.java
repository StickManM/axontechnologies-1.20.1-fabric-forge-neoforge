package net.stickmanm.axontechnologies.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;

public class ThunderPoisoningEffect extends StatusEffect {
    public ThunderPoisoningEffect() {
        super(StatusEffectCategory.HARMFUL, // whether beneficial or harmful for entities
                0xA8A9AD); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {
        if (!entity.getWorld().isClient()) {
            entity.damage(entity.getDamageSources().lightningBolt(), 2F);
                    addAttributeModifier(EntityAttributes.GENERIC_ATTACK_DAMAGE, "22653B89-116E-49DC-9B6B-9971489B5BE5", -1, EntityAttributeModifier.Operation.ADDITION)
                            .addAttributeModifier(EntityAttributes.GENERIC_MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.16, EntityAttributeModifier.Operation.MULTIPLY_TOTAL)
                            .addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "55FCED67-E92A-486E-9800-B47F202C4386", -10, EntityAttributeModifier.Operation.ADDITION)
                            .addAttributeModifier(EntityAttributes.GENERIC_LUCK, "CC5AF142-2BD2-4215-B636-2605AED11727", -10, EntityAttributeModifier.Operation.ADDITION);


        }


        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}