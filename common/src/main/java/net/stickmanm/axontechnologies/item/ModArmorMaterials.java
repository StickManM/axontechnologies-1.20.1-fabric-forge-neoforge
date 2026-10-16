package net.stickmanm.axontechnologies.item;

import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Lazy;
import net.minecraft.util.StringIdentifiable;
import net.minecraft.util.Util;

import java.util.EnumMap;
import java.util.function.Supplier;

public enum ModArmorMaterials implements ArmorMaterial {

    THUNDERANIUM("thunderanium", 400, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 10);
        map.put(ArmorItem.Type.LEGGINGS, 15);
        map.put(ArmorItem.Type.CHESTPLATE, 17);
        map.put(ArmorItem.Type.HELMET, 13);
    }), 19, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.0F, 0.1F, () -> {
        return Ingredient.ofItems(new Item[]{ModItems.THUNDERANIUM_INGOT});
    }),

    RED_THUNDERANIUM("red_thunderanium", 0, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 13);
        map.put(ArmorItem.Type.LEGGINGS, 20);
        map.put(ArmorItem.Type.CHESTPLATE, 23);
        map.put(ArmorItem.Type.HELMET, 16);
    }), 35, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 2.5F, 0.25F, () -> {
        return Ingredient.ofItems(new Item[]{ModItems.RED_THUNDERANIUM_INGOT});
    }),

    DARK_THUNDERANIUM("dark_thunderanium", 0, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 19);
        map.put(ArmorItem.Type.LEGGINGS, 26);
        map.put(ArmorItem.Type.CHESTPLATE, 28);
        map.put(ArmorItem.Type.HELMET, 21);
    }), 50, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.5F, () -> {
        return Ingredient.ofItems(new Item[]{ModItems.DARK_THUNDERANIUM_INGOT});
    }),

    CORRUPTINITE("corruptinite", 0, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 17);
        map.put(ArmorItem.Type.LEGGINGS, 25);
        map.put(ArmorItem.Type.CHESTPLATE, 27);
        map.put(ArmorItem.Type.HELMET, 20);
    }), 55, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.5F, () -> {
        return Ingredient.ofItems(new Item[]{ModItems.CORRUPTINITE});
    }),

    CORRUPTINITE_AXON_ALLOY_ARMOR("corruptinite_axon_alloy_armor", 0, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 27);
        map.put(ArmorItem.Type.LEGGINGS, 35);
        map.put(ArmorItem.Type.CHESTPLATE, 37);
        map.put(ArmorItem.Type.HELMET, 30);
    }), 100, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 1, () -> {
        return Ingredient.ofItems(new Item[]{ModItems.CORRUPTINITE});
    }),

    DARK_THUNDERANIUM_AXON_ALLOY_ARMOR("dark_thunderanium_axon_alloy_armor", 0, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 29);
        map.put(ArmorItem.Type.LEGGINGS, 36);
        map.put(ArmorItem.Type.CHESTPLATE, 38);
        map.put(ArmorItem.Type.HELMET, 31);
    }), 115, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 1F, () -> {
        return Ingredient.ofItems(new Item[]{ModItems.DARK_THUNDERANIUM_INGOT});
    }),

    AXON_ALLOY_ARMOR("axon_alloy_armor", 0, Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 25);
        map.put(ArmorItem.Type.LEGGINGS, 33);
        map.put(ArmorItem.Type.CHESTPLATE, 35);
        map.put(ArmorItem.Type.HELMET, 28);
    }), 90, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 5.0F, 1F, () -> {
        return Ingredient.ofItems(new Item[]{ModItems.AXON_ALLOY});
    });

    public static final StringIdentifiable.Codec<ArmorMaterials> CODEC = StringIdentifiable.createCodec(ArmorMaterials::values);
    private static final EnumMap<ArmorItem.Type, Integer> BASE_DURABILITY = Util.make(new EnumMap(ArmorItem.Type.class), (map) -> {
        map.put(ArmorItem.Type.BOOTS, 13);
        map.put(ArmorItem.Type.LEGGINGS, 15);
        map.put(ArmorItem.Type.CHESTPLATE, 16);
        map.put(ArmorItem.Type.HELMET, 11);
    });
    private final String name;
    private final int durabilityMultiplier;
    private final EnumMap<ArmorItem.Type, Integer> protectionAmounts;
    private final int enchantability;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackResistance;
    private final Lazy<Ingredient> repairIngredientSupplier;

    private ModArmorMaterials(String name, int durabilityMultiplier, EnumMap protectionAmounts, int enchantability, SoundEvent equipSound, float toughness, float knockbackResistance, Supplier repairIngredientSupplier) {
        this.name = name;
        this.durabilityMultiplier = durabilityMultiplier;
        this.protectionAmounts = protectionAmounts;
        this.enchantability = enchantability;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairIngredientSupplier = new Lazy(repairIngredientSupplier);
    }

    public int getDurability(ArmorItem.Type type) {
        return (Integer)BASE_DURABILITY.get(type) * this.durabilityMultiplier;
    }

    public int getProtection(ArmorItem.Type type) {
        return (Integer)this.protectionAmounts.get(type);
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredientSupplier.get();
    }

    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }

    public String asString() {
        return this.name;
    }
}