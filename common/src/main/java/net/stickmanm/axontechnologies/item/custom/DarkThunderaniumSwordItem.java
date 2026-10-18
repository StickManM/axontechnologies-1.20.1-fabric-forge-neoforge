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



        if (attacker.hasStatusEffect(ModEffects.GLITCHSTERIII.get()) ||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERIV.get()) ||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERV.get())) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER.get(), 900));



        } else if (attacker.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER.get()) ||
                attacker.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERII.get()) ||
                attacker.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTERIII.get())) {
            attacker.addStatusEffect(new StatusEffectInstance(ModEffects.ANTI_CORRUPTED_GLITCHSTER.get(), 900, 0));
        }

        return true;
    }




}
