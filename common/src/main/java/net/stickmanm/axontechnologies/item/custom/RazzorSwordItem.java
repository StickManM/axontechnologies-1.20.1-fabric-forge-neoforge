package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;
import net.stickmanm.axontechnologies.effect.ModEffects;

public class RazzorSwordItem extends SwordItem{
    public RazzorSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {

        target.setHealth(Float.MIN_EXPONENT);
        target.addStatusEffect(new StatusEffectInstance(ModEffects.OVERDOSE, -1, 255, false,true));
        return super.postHit(stack, target, attacker);
    }
}
