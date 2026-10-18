package net.stickmanm.axontechnologies.util;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.advancement.criterion.InventoryChangedCriterion;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.item.ModItems;

import java.util.function.Consumer;

public class ModAdvancements implements Consumer<Consumer<Advancement>> {
    @Override
    public void accept(Consumer<Advancement> consumer) {

        Advancement getMimicarium = Advancement.Builder.create()
                .display(
                        ModItems.MIMICARIUM.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_mimicarium.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_mimicarium.description"), // The description
                        new Identifier("textures/gui/advancements/backgrounds/adventure.png"), // Background image used
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_mimicarium", InventoryChangedCriterion.Conditions.items(ModItems.MIMICARIUM.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_mimicarium");

        Advancement getThunderaniumIngot = Advancement.Builder.create().parent(getMimicarium)
                .display(
                        ModItems.THUNDERANIUM_INGOT.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_thunderanium_ingot.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_thunderanium_ingot.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_thunderanium_ingot", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_INGOT.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_thunderanium_ingot");

        Advancement getThunderaniumArmor = Advancement.Builder.create().parent(getThunderaniumIngot)
                .display(
                        ModItems.THUNDERANIUM_CHESTPLATE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_thunderanium_armor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_thunderanium_armor.description"), // The description
                        null,
                        AdvancementFrame.GOAL, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_HELMET.get()))
                .criterion("got_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_CHESTPLATE.get()))
                .criterion("got_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_LEGGINGS.get()))
                .criterion("got_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.THUNDERANIUM_BOOTS.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/has_thunderanium_armor");

        Advancement getRedEssence = Advancement.Builder.create().parent(getThunderaniumArmor)
                .display(
                        ModItems.RED_ESSENCE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_red_essence.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_red_essence.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_red_essence", InventoryChangedCriterion.Conditions.items(ModItems.RED_ESSENCE.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_red_essence");

        Advancement getRedThunderaniumIngot = Advancement.Builder.create().parent(getRedEssence)
                .display(
                        ModItems.RED_THUNDERANIUM_INGOT.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_red_thunderanium_ingot.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_red_thunderanium_ingot.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_red_thunderanium_ingot", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_INGOT.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_red_thunderanium_ingot");

        Advancement getRedThunderaniumArmor = Advancement.Builder.create().parent(getRedThunderaniumIngot)
                .display(
                        ModItems.RED_THUNDERANIUM_CHESTPLATE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_red_thunderanium_armor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_red_thunderanium_armor.description"), // The description
                        null,
                        AdvancementFrame.GOAL, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_red_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_HELMET.get()))
                .criterion("got_red_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_CHESTPLATE.get()))
                .criterion("got_red_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_LEGGINGS.get()))
                .criterion("got_red_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.RED_THUNDERANIUM_BOOTS.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/has_red_thunderanium_armor");

        Advancement getDarkEssence = Advancement.Builder.create().parent(getRedThunderaniumArmor)
                .display(
                        ModItems.DARK_ESSENCE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_dark_essence.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_dark_essence.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_dark_essence", InventoryChangedCriterion.Conditions.items(ModItems.DARK_ESSENCE.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_dark_essence");

        Advancement getDarkThunderaniumIngot = Advancement.Builder.create().parent(getDarkEssence)
                .display(
                        ModItems.DARK_THUNDERANIUM_INGOT.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_dark_thunderanium_ingot.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_dark_thunderanium_ingot.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_dark_thunderanium_ingot", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_INGOT.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_dark_thunderanium_ingot");

        Advancement getCorruptinite = Advancement.Builder.create().parent(getDarkEssence)
                .display(
                        ModItems.CORRUPTINITE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_corruptinite.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_corruptinite.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_corruptinite", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_corruptinite");

        Advancement getDarkThunderaniumArmor = Advancement.Builder.create().parent(getDarkThunderaniumIngot)
                .display(
                        ModItems.DARK_THUNDERANIUM_CHESTPLATE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_dark_thunderanium_armor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_dark_thunderanium_armor.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_dark_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_HELMET.get()))
                .criterion("got_dark_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_CHESTPLATE.get()))
                .criterion("got_dark_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_LEGGINGS.get()))
                .criterion("got_dark_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_BOOTS.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/has_dark_thunderanium_armor");

        Advancement getCorruptiniteArmor = Advancement.Builder.create().parent(getCorruptinite)
                .display(
                        ModItems.CORRUPTINITE_CHESTPLATE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_corruptinite_armor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_corruptinite_armor.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_corruptinite_helmet", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_HELMET.get()))
                .criterion("got_corruptinite_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_CHESTPLATE.get()))
                .criterion("got_corruptinite_leggings", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_LEGGINGS.get()))
                .criterion("got_corruptinite_boots", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_BOOTS.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/has_corruptinite_armor");

        Advancement getAxonAlloy = Advancement.Builder.create().parent(getDarkEssence)
                .display(
                        ModItems.AXON_ALLOY.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_axon_alloy.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_axon_alloy.description"), // The description
                        null,
                        AdvancementFrame.TASK, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_axon_alloy", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_axon_alloy");

        Advancement getCorruptiniteAxonAlloyArmor = Advancement.Builder.create().parent(getAxonAlloy)
                .display(
                        ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_corruptinite_axon_alloy_armor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_corruptinite_axon_alloy_armor.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_axon_alloy_corruptinite_helmet", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET.get()))
                .criterion("got_axon_alloy_corruptinite_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE.get()))
                .criterion("got_axon_alloy_corruptinite_leggings", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS.get()))
                .criterion("got_axon_alloy_corruptinite_boots", InventoryChangedCriterion.Conditions.items(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/has_axon_alloy_corruptinite_armor");

        Advancement getDarkThunderaniumAxonAlloyArmor = Advancement.Builder.create().parent(getAxonAlloy)
                .display(
                        ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_dark_thunderanium_axon_alloy_armor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_dark_thunderanium_axon_alloy_armor.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_axon_alloy_dark_thunderanium_helmet", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET.get()))
                .criterion("got_axon_alloy_dark_thunderanium_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE.get()))
                .criterion("got_axon_alloy_dark_thunderanium_leggings", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS.get()))
                .criterion("got_axon_alloy_dark_thunderanium_boots", InventoryChangedCriterion.Conditions.items(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/has_axon_alloy_dark_thunderanium_armor");

        Advancement getAxonAlloyArmor = Advancement.Builder.create().parent(getAxonAlloy)
                .display(
                        ModItems.AXON_ALLOY_CHESTPLATE.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_axon_alloy_armor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_axon_alloy_armor.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_axon_alloy_helmet", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_HELMET.get()))
                .criterion("got_axon_alloy_chestplate", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_CHESTPLATE.get()))
                .criterion("got_axon_alloy_leggings", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_LEGGINGS.get()))
                .criterion("got_axon_alloy_boots", InventoryChangedCriterion.Conditions.items(ModItems.AXON_ALLOY_BOOTS.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/has_axon_alloy_armor");

        Advancement getUltimateHoeTrophy = Advancement.Builder.create().parent(getAxonAlloy)
                .display(
                        ModItems.ULTIMATE_HOE_TROPHY.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_ultimate_hoe_trophy.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_ultimate_hoe_trophy.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_ultimate_hoe_trophy", InventoryChangedCriterion.Conditions.items(ModItems.ULTIMATE_HOE_TROPHY.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_ultimate_hoe_trophy");

        Advancement getRazzorium = Advancement.Builder.create().parent(getAxonAlloy)
                .display(
                        ModItems.RAZZORIUM.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_razzorium.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_razzorium.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_razzorium", InventoryChangedCriterion.Conditions.items(ModItems.RAZZORIUM.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_razzorium");

        Advancement getRazzor = Advancement.Builder.create().parent(getAxonAlloy)
                .display(
                        ModItems.RAZZORIUM.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_razzor.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_razzor.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_razzor", InventoryChangedCriterion.Conditions.items(ModItems.RAZZOR.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_razzor");

        Advancement getRazzoriumMiner = Advancement.Builder.create().parent(getAxonAlloy)
                .display(
                        ModItems.RAZZORIUM_MINER.get(), // The display icon
                        Text.translatable("advancement.axontechnologies.get_razzorium_miner.title"), // The title
                        Text.translatable("advancement.axontechnologies.get_razzorium_miner.description"), // The description
                        null,
                        AdvancementFrame.CHALLENGE, // Options: TASK, CHALLENGE, GOAL
                        true, // Show toast top right
                        true, // Announce to chat
                        false // Hidden in the advancement tab
                )
                // The first string used in criterion is the name referenced by other advancements when they want to have 'requirements'
                .criterion("got_razzorium_miner", InventoryChangedCriterion.Conditions.items(ModItems.RAZZORIUM_MINER.get()))
                .build(consumer, AxonTechnologiesConstants.MOD_ID + "/got_razzorium_miner");





    }
}
