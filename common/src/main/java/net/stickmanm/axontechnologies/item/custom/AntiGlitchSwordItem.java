package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class AntiGlitchSwordItem extends SwordItem {
    public AntiGlitchSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        if (target.hasStatusEffect(ModEffects.GLITCHSTER) ||
                target.hasStatusEffect(ModEffects.GLITCHSTERII)||
                target.hasStatusEffect(ModEffects.GLITCHSTERIII)||
                target.hasStatusEffect(ModEffects.GLITCHSTERIV) ||
                target.hasStatusEffect(ModEffects.GLITCHSTERV)) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, 900, 0));
        } else if (target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER) ||
                target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERII) ||
                target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERIII)) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER, 900, 0));
        }



        return true;
    }



}
