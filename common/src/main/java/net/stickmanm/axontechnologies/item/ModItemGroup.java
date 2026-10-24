package net.stickmanm.axontechnologies.item;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModItemGroup {
    public static final DeferredRegister<ItemGroup> TABS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.ITEM_GROUP);

    // The tab is built lazily, so the .get() calls inside the entries lambda are safe (it only runs once
    // the creative inventory is populated, long after every registry has been filled).
    public static final RegistrySupplier<ItemGroup> AXONTECHNOLOGIES = TABS.register("axontechnologies",
            () -> CreativeTabRegistry.create(builder -> builder
                    .displayName(Text.translatable("itemGroup." + AxonTechnologiesConstants.MOD_ID))
                    .icon(() -> new ItemStack(ModItems.RED_THUNDERANIUM_INGOT.get()))
                    .entries((context, entries) -> {
                        // ITEMS
                        entries.add(ModItems.MIMICARIUM.get());
                        entries.add(ModItems.RAW_NETHERITE.get());
                        entries.add(ModItems.RED_ESSENCE.get());
                        entries.add(ModItems.DARK_ESSENCE.get());
                        entries.add(ModItems.RENDERIUM.get());
                        entries.add(ModItems.DENDERIUM.get());
                        entries.add(ModItems.AXON_ALLOY.get());

                        entries.add(ModItems.VOID_COAL.get());
                        entries.add(ModItems.THUNDER_FUEL.get());

                        entries.add(ModItems.CORRUPTINITE.get());
                        entries.add(ModItems.UNSTABLE_CORRUPTINITE.get());

                        entries.add(ModItems.DARK_THUNDERANIUM_INGOT.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_CLUSTER.get());

                        entries.add(ModItems.RAW_THUNDERANIUM.get());
                        entries.add(ModItems.THUNDERANIUM_CLUSTER.get());
                        entries.add(ModItems.REFINED_THUNDERANIUM.get());
                        entries.add(ModItems.THUNDERANIUM_INGOT.get());

                        entries.add(ModItems.RED_THUNDERANIUM_INGOT.get());
                        entries.add(ModItems.RED_THUNDERANIUM_CLUSTER.get());

                        entries.add(ModItems.RED_ESSENCE_ZOMBIE_SPAWN_EGG.get());
                        entries.add(ModItems.GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE_SPAWN_EGG.get());
                        entries.add(ModItems.DARK_ESSENCE_ZOMBIE_SPAWN_EGG.get());
                        entries.add(ModItems.LOST_MINER_SPAWN_EGG.get());

                        entries.add(ModItems.MIMICARIUM_IGNITER.get());
                        entries.add(ModItems.DREADED_IGNITER.get());
                        entries.add(ModItems.THUNDERANIUM_KEY.get());
                        entries.add(ModItems.CORRUPTION_GATEWAY.get());

                        entries.add(ModItems.THUNDERANIUM_HELMET.get());
                        entries.add(ModItems.THUNDERANIUM_CHESTPLATE.get());
                        entries.add(ModItems.THUNDERANIUM_LEGGINGS.get());
                        entries.add(ModItems.THUNDERANIUM_BOOTS.get());

                        entries.add(ModItems.THUNDERANIUM_SWORD.get());
                        entries.add(ModItems.THUNDERANIUM_PICKAXE.get());
                        entries.add(ModItems.THUNDERANIUM_AXE.get());
                        entries.add(ModItems.THUNDERANIUM_SHOVEL.get());
                        entries.add(ModItems.THUNDERANIUM_HOE.get());

                        entries.add(ModItems.RED_THUNDERANIUM_HELMET.get());
                        entries.add(ModItems.RED_THUNDERANIUM_CHESTPLATE.get());
                        entries.add(ModItems.RED_THUNDERANIUM_LEGGINGS.get());
                        entries.add(ModItems.RED_THUNDERANIUM_BOOTS.get());

                        entries.add(ModItems.RED_THUNDERANIUM_SWORD.get());
                        entries.add(ModItems.RED_THUNDERANIUM_PICKAXE.get());
                        entries.add(ModItems.RED_THUNDERANIUM_AXE.get());
                        entries.add(ModItems.RED_THUNDERANIUM_SHOVEL.get());
                        entries.add(ModItems.RED_THUNDERANIUM_HOE.get());

                        entries.add(ModItems.DARK_THUNDERANIUM_HELMET.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_CHESTPLATE.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_LEGGINGS.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_BOOTS.get());

                        entries.add(ModItems.DARK_THUNDERANIUM_SWORD.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_PICKAXE.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXE.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_SHOVEL.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_HOE.get());

                        entries.add(ModItems.CORRUPTINITE_HELMET.get());
                        entries.add(ModItems.CORRUPTINITE_CHESTPLATE.get());
                        entries.add(ModItems.CORRUPTINITE_LEGGINGS.get());
                        entries.add(ModItems.CORRUPTINITE_BOOTS.get());

                        entries.add(ModItems.CORRUPTINITE_SWORD.get());
                        entries.add(ModItems.CORRUPTINITE_PICKAXE.get());
                        entries.add(ModItems.CORRUPTINITE_AXE.get());
                        entries.add(ModItems.CORRUPTINITE_SHOVEL.get());
                        entries.add(ModItems.CORRUPTINITE_HOE.get());

                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET.get());
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE.get());
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS.get());
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS.get());

                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD.get());
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE.get());
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_AXE.get());
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL.get());
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_HOE.get());

                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS.get());

                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL.get());
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE.get());

                        entries.add(ModItems.AXON_ALLOY_HELMET.get());
                        entries.add(ModItems.AXON_ALLOY_CHESTPLATE.get());
                        entries.add(ModItems.AXON_ALLOY_LEGGINGS.get());
                        entries.add(ModItems.AXON_ALLOY_BOOTS.get());

                        entries.add(ModItems.AXON_ALLOY_SWORD.get());
                        entries.add(ModItems.AXON_ALLOY_PICKAXE.get());
                        entries.add(ModItems.AXON_ALLOY_AXE.get());
                        entries.add(ModItems.AXON_ALLOY_SHOVEL.get());
                        entries.add(ModItems.AXON_ALLOY_HOE.get());

                        entries.add(ModItems.ANTIGLITCH_SWORD.get());
                        entries.add(ModItems.VANILLA_HOE.get());
                        entries.add(ModItems.ULTIMATE_HOE_TROPHY.get());
                        entries.add(ModItems.RAZZOR.get());
                        entries.add(ModItems.RAZZORIUM_MINER.get());
                        entries.add(ModItems.TICKLE_TRAVIS_TICKLER.get());

                        // COMPRESSED STICKS
                        entries.add(ModItems.COMPRESSED_STICK.get());
                        entries.add(ModItems.DOUBLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.TRIPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.QUADRUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.QUINTUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.SEXTUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.SEPTUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.OCTUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.NONUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.DECUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.UNDECUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.DUODECUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.TREDECUPLE_COMPRESSED_STICK.get());
                        entries.add(ModItems.QUATTUORDECUPLE_COMPRESSED_STICK.get());

                        entries.add(ModItems.MWDC.get());
                        entries.add(ModItems.DCDC.get());
                        entries.add(ModItems.TLDC.get());
                        entries.add(ModItems.CLDC.get());

                        entries.add(ModItems.LIQUID_THUNDER_BUCKET.get());
                        entries.add(ModItems.LIQUID_CORRUPTION_BUCKET.get());
                        entries.add(ModItems.GX_BUCKET.get());

                        // BLOCKS
                        entries.add(ModBlocks.MIMICARIUM_ORE.get());
                        entries.add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get());
                        entries.add(ModBlocks.FAKESTONE_IRON_ORE.get());
                        entries.add(ModBlocks.FAKESTONE_GOLD_ORE.get());
                        entries.add(ModBlocks.FAKESLATE_IRON_ORE.get());
                        entries.add(ModBlocks.FAKESLATE_GOLD_ORE.get());

                        entries.add(ModBlocks.THUNDERED_LOG.get());
                        entries.add(ModBlocks.THUNDERED_WOOD.get());
                        entries.add(ModBlocks.STRIPPED_THUNDERED_LOG.get());
                        entries.add(ModBlocks.STRIPPED_THUNDERED_WOOD.get());
                        entries.add(ModBlocks.THUNDERED_PLANKS.get());
                        entries.add(ModBlocks.THUNDERED_LEAVES.get());
                        entries.add(ModBlocks.THUNDERED_SAPLING.get());

                        entries.add(ModBlocks.CORRUPTED_LOG.get());
                        entries.add(ModBlocks.CORRUPTED_WOOD.get());
                        entries.add(ModBlocks.STRIPPED_CORRUPTED_LOG.get());
                        entries.add(ModBlocks.STRIPPED_CORRUPTED_WOOD.get());
                        entries.add(ModBlocks.CORRUPTED_PLANKS.get());
                        entries.add(ModBlocks.CORRUPTED_SAPLING.get());

                        entries.add(ModBlocks.VOIDSTONE.get());
                        entries.add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get());
                        entries.add(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get());
                        entries.add(ModBlocks.CORRUPTION_PORTAL_FRAME.get());

                        entries.add(ModBlocks.DREADSTONE.get());
                        entries.add(ModBlocks.REINFORCED_DREADSTONE.get());
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_SLAB.get());
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get());
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_WALL.get());
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_DOOR.get());
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get());
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_GLASS.get());
                        entries.add(ModBlocks.DREADSTONE_DIAMOND_ORE.get());
                        entries.add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get());
                        entries.add(ModBlocks.DREADSTONE_NETHERITE_ORE.get());
                        entries.add(ModBlocks.VOID_COAL_ORE.get());
                        entries.add(ModBlocks.VOID_COAL_BLOCK.get());

                        entries.add(ModBlocks.FAKESTONE.get());
                        entries.add(ModBlocks.FAKESLATE.get());

                        entries.add(ModBlocks.THUNDERANIUM_TNT.get());
                        entries.add(ModBlocks.RED_THUNDERANIUM_TNT.get());
                        entries.add(ModBlocks.AXON_ALLOY_TNT.get());

                        entries.add(ModBlocks.CHARGED_DIRT.get());
                        entries.add(ModBlocks.THUNDERED_STONE.get());
                        entries.add(ModBlocks.THUNDERANIUM_ORE.get());
                        entries.add(ModBlocks.RENDERIUM_ORE.get());

                        entries.add(ModBlocks.CORRUPTED_DIRT.get());
                        entries.add(ModBlocks.CORRUPTED_STONE.get());
                        entries.add(ModBlocks.CORRUPTION_BLOCK.get());
                        entries.add(ModBlocks.CORRUPTINITE_ORE.get());
                        entries.add(ModBlocks.DENDERIUM_ORE.get());

                        entries.add(ModBlocks.MWDC_ORE.get());
                        entries.add(ModBlocks.DCDC_ORE.get());
                        entries.add(ModBlocks.TLDC_ORE.get());
                        entries.add(ModBlocks.CLDC_ORE.get());
                    })));

    public static void initItemGroups() {
        TABS.register();
    }
}