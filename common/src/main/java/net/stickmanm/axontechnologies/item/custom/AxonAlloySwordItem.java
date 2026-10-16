package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class AxonAlloySwordItem extends SwordItem {
    public AxonAlloySwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        if (target.hasStatusEffect(ModEffects.GLITCHSTERV)) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, 1200, 2));
        } else if (target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERIII)) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER, 1200, 2));
        }



        return true;
    }



}
