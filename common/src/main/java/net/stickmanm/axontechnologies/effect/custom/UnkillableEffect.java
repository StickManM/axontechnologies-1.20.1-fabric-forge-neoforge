package net.stickmanm.axontechnologies.effect.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.player.PlayerEntity;

public class UnkillableEffect extends StatusEffect {
    public UnkillableEffect() {
        super(StatusEffectCategory.BENEFICIAL, // whether beneficial or harmful for entities
                0xFFFFFF); // color in RGB
    }

    // This method is called every tick to check whether it should apply the status effect or not


    // This method is called when it applies the status effect. We implement custom functionality here.
    @Override
    public void applyUpdateEffect(LivingEntity entity, int Amplifier) {

            if (!entity.getWorld().isClient()) {
                entity.clearStatusEffects();
                entity.addStatusEffect(new StatusEffectInstance(this, 10, 0, false, true));


                if(entity.isPlayer()){
                    ((PlayerEntity) entity).getHungerManager().add(Amplifier + 100000, 10000f);
                }
                addAttributeModifier(EntityAttributes.GENERIC_MAX_HEALTH, "91AEAA56-376B-4498-935B-2F7F68070635", Float.MAX_VALUE, EntityAttributeModifier.Operation.ADDITION);
                entity.setHealth(Integer.MAX_VALUE);

            }



        super.applyUpdateEffect(entity, Amplifier);
    }
    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        // In our case, we just make it return true so that it applies the status effect every tick.
        return true;
    }
}