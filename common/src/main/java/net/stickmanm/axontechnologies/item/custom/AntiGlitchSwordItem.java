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

        if (target.hasStatusEffect(ModEffects.GLITCHSTER.get()) ||
                target.hasStatusEffect(ModEffects.GLITCHSTERII.get())||
                target.hasStatusEffect(ModEffects.GLITCHSTERIII.get())||
                target.hasStatusEffect(ModEffects.GLITCHSTERIV.get()) ||
                target.hasStatusEffect(ModEffects.GLITCHSTERV.get())) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER.get(), 900, 0));
        } else if (target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER.get()) ||
                target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERII.get()) ||
                target.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERIII.get())) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER.get(), 900, 0));
        }



        return true;
    }



}
