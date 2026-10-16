package net.stickmanm.axontechnologies.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;

import net.minecraft.recipe.Ingredient;

import net.minecraft.util.Lazy;
import java.util.function.Supplier;

public enum ModToolMaterials implements ToolMaterial {
    THUNDERANIUM(5, 3031, 13.0f, 10.0f, 25, () -> Ingredient.ofItems(ModItems.THUNDERANIUM_INGOT)),
    RED_THUNDERANIUM(6, 0, 20.0f, 12.5f, 35, () -> Ingredient.ofItems(ModItems.RED_THUNDERANIUM_INGOT)),
    DARK_THUNDERANIUM(7, 0, 30.0f, 13.9f, 55, () -> Ingredient.ofItems(ModItems.DARK_THUNDERANIUM_INGOT)),
    CORRUPTINITE(7, 0, 25.0f, 13.25f, 50, () -> Ingredient.ofItems(ModItems.CORRUPTINITE)),
    CORRUPTINITE_AXON_ALLOY(10, 0, 45.0f, 22.5f, 100, () -> Ingredient.ofItems(ModItems.CORRUPTINITE)),
    DARK_THUNDERANIUM_AXON_ALLOY(10, 0, 50.0f, 25.0f, 115, () -> Ingredient.ofItems(ModItems.DARK_THUNDERANIUM_INGOT)),
    AXON_ALLOY(10, 0, 40.0f, 21.5f, 90, () -> Ingredient.ofItems(ModItems.AXON_ALLOY)),

    RAZZORIUM(Integer.MAX_VALUE, 0, Float.MAX_VALUE, 14, Integer.MAX_VALUE, () -> Ingredient.ofItems(ModItems.RAZZORIUM));

    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ModToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy<Ingredient>(repairIngredient);
    }

    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
