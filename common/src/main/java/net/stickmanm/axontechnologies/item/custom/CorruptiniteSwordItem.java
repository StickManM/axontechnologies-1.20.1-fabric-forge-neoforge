package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class CorruptiniteSwordItem extends SwordItem {
    public CorruptiniteSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        if(attacker.hasStatusEffect(ModEffects.CORRUPTED_GLITCHSTER)) {
            target.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, 1200));


        }
        else if (attacker.hasStatusEffect(ModEffects.GLITCHSTER) ||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERII)||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERIII)||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERIV) ||
                attacker.hasStatusEffect(ModEffects.GLITCHSTERV)) {
            attacker.addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, 900, 2));
        }

        return true;
    }

    @Override
    public boolean isEnchantable(ItemStack stack) {
        return super.isEnchantable(stack);
    }


}
