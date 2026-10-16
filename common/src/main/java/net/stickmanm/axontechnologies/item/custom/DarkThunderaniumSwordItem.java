package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class DarkThunderaniumSwordItem extends SwordItem {
    public DarkThunderaniumSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {



        if (attacker.hasStatusEffect(ModEffects.GLITCHSTERIII) ||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERIV) ||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERV)) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER, 900));



        } else if (attacker.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER) ||
                attacker.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERII) ||
                attacker.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERIII)) {
            attacker.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER, 900, 0));
        }

        return true;
    }




}
