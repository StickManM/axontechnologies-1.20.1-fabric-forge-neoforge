package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModItemGroup {
    public static ItemGroup AXONTECHNOLOGIES = Registry.register(Registries.ITEM_GROUP, new Identifier(AxonTechnologies.MOD_ID, "axontechnologiesgroup"),
            FabricItemGroup.builder()
                    .displayName(Text.literal("Axon T.e.c.h.n.o.l.o.g.i.e.s."))
                    .icon(() -> new ItemStack(ModItems.RED_THUNDERANIUM_INGOT)).entries((displayContext, entries) -> {
                        //ITEMS
                        entries.add(ModItems.MIMICARIUM);
                        entries.add(ModItems.RAW_NETHERITE);
                        entries.add(ModItems.RED_ESSENCE);
                        entries.add(ModItems.DARK_ESSENCE);
                        entries.add(ModItems.RENDERIUM);
                        entries.add(ModItems.DENDERIUM);
                        entries.add(ModItems.AXON_ALLOY);

                        entries.add(ModItems.VOID_COAL);
                        entries.add(ModItems.THUNDER_FUEL);

                        entries.add(ModItems.CORRUPTINITE);
                        entries.add(ModItems.UNSTABLE_CORRUPTINITE);


                        entries.add(ModItems.DARK_THUNDERANIUM_INGOT);
                        entries.add(ModItems.DARK_THUNDERANIUM_CLUSTER);

                        entries.add(ModItems.RAW_THUNDERANIUM);
                        entries.add(ModItems.THUNDERANIUM_CLUSTER);
                        entries.add(ModItems.REFINED_THUNDERANIUM);
                        entries.add(ModItems.THUNDERANIUM_INGOT);

                        entries.add(ModItems.RED_THUNDERANIUM_INGOT);
                        entries.add(ModItems.RED_THUNDERANIUM_CLUSTER);


                        entries.add(ModItems.RED_ESSENCE_ZOMBIE_SPAWN_EGG);
                        entries.add(ModItems.GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE_SPAWN_EGG);
                        entries.add(ModItems.DARK_ESSENCE_ZOMBIE_SPAWN_EGG);
                        entries.add(ModItems.LOST_MINER_SPAWN_EGG);

                        entries.add(ModItems.MIMICARIUM_IGNITER);
                        entries.add(ModItems.DREADED_IGNITER);
                        entries.add(ModItems.THUNDERANIUM_KEY);
                        entries.add(ModItems.CORRUPTION_GATEWAY);

                        entries.add(ModItems.THUNDERANIUM_HELMET);
                        entries.add(ModItems.THUNDERANIUM_CHESTPLATE);
                        entries.add(ModItems.THUNDERANIUM_LEGGINGS);
                        entries.add(ModItems.THUNDERANIUM_BOOTS);

                        entries.add(ModItems.THUNDERANIUM_SWORD);
                        entries.add(ModItems.THUNDERANIUM_PICKAXE);
                        entries.add(ModItems.THUNDERANIUM_AXE);
                        entries.add(ModItems.THUNDERANIUM_SHOVEL);
                        entries.add(ModItems.THUNDERANIUM_HOE);

                        entries.add(ModItems.RED_THUNDERANIUM_HELMET);
                        entries.add(ModItems.RED_THUNDERANIUM_CHESTPLATE);
                        entries.add(ModItems.RED_THUNDERANIUM_LEGGINGS);
                        entries.add(ModItems.RED_THUNDERANIUM_BOOTS);

                        entries.add(ModItems.RED_THUNDERANIUM_SWORD);
                        entries.add(ModItems.RED_THUNDERANIUM_PICKAXE);
                        entries.add(ModItems.RED_THUNDERANIUM_AXE);
                        entries.add(ModItems.RED_THUNDERANIUM_SHOVEL);
                        entries.add(ModItems.RED_THUNDERANIUM_HOE);

                        entries.add(ModItems.DARK_THUNDERANIUM_HELMET);
                        entries.add(ModItems.DARK_THUNDERANIUM_CHESTPLATE);
                        entries.add(ModItems.DARK_THUNDERANIUM_LEGGINGS);
                        entries.add(ModItems.DARK_THUNDERANIUM_BOOTS);

                        entries.add(ModItems.DARK_THUNDERANIUM_SWORD);
                        entries.add(ModItems.DARK_THUNDERANIUM_PICKAXE);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXE);
                        entries.add(ModItems.DARK_THUNDERANIUM_SHOVEL);
                        entries.add(ModItems.DARK_THUNDERANIUM_HOE);

                        entries.add(ModItems.CORRUPTINITE_HELMET);
                        entries.add(ModItems.CORRUPTINITE_CHESTPLATE);
                        entries.add(ModItems.CORRUPTINITE_LEGGINGS);
                        entries.add(ModItems.CORRUPTINITE_BOOTS);

                        entries.add(ModItems.CORRUPTINITE_SWORD);
                        entries.add(ModItems.CORRUPTINITE_PICKAXE);
                        entries.add(ModItems.CORRUPTINITE_AXE);
                        entries.add(ModItems.CORRUPTINITE_SHOVEL);
                        entries.add(ModItems.CORRUPTINITE_HOE);

                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET);
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE);
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS);
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS);

                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD);
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE);
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_AXE);
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL);
                        entries.add(ModItems.CORRUPTINITE_AXON_ALLOY_HOE);

                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS);

                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL);
                        entries.add(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE);

                        entries.add(ModItems.AXON_ALLOY_HELMET);
                        entries.add(ModItems.AXON_ALLOY_CHESTPLATE);
                        entries.add(ModItems.AXON_ALLOY_LEGGINGS);
                        entries.add(ModItems.AXON_ALLOY_BOOTS);

                        entries.add(ModItems.AXON_ALLOY_SWORD);
                        entries.add(ModItems.AXON_ALLOY_PICKAXE);
                        entries.add(ModItems.AXON_ALLOY_AXE);
                        entries.add(ModItems.AXON_ALLOY_SHOVEL);
                        entries.add(ModItems.AXON_ALLOY_HOE);


                        entries.add(ModItems.ANTIGLITCH_SWORD);
                        entries.add(ModItems.VANILLA_HOE);
                        entries.add(ModItems.ULTIMATE_HOE_TROPHY);
                        entries.add(ModItems.RAZZOR);
                        entries.add(ModItems.RAZZORIUM_MINER);
                        entries.add(ModItems.TICKLE_TRAVIS_TICKLER);

                        //COMPRESSED STICKS
                        entries.add(ModItems.COMPRESSED_STICK);
                        entries.add(ModItems.DOUBLE_COMPRESSED_STICK);
                        entries.add(ModItems.TRIPLE_COMPRESSED_STICK);
                        entries.add(ModItems.QUADRUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.QUINTUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.SEXTUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.SEPTUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.OCTUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.NONUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.DECUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.UNDECUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.DUODECUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.TREDECUPLE_COMPRESSED_STICK);
                        entries.add(ModItems.QUATTUORDECUPLE_COMPRESSED_STICK);


                        entries.add(ModItems.MWDC);
                        entries.add(ModItems.DCDC);
                        entries.add(ModItems.TLDC);
                        entries.add(ModItems.CLDC);



                        entries.add(ModItems.LIQUID_THUNDER_BUCKET);
                        entries.add(ModItems.LIQUID_CORRUPTION_BUCKET);
                        entries.add(ModItems.GX_BUCKET);


                        //BLOCKS
                        entries.add(ModBlocks.MIMICARIUM_ORE);
                        entries.add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE);
                        entries.add(ModBlocks.FAKESTONE_IRON_ORE);
                        entries.add(ModBlocks.FAKESTONE_GOLD_ORE);
                        entries.add(ModBlocks.FAKESLATE_IRON_ORE);
                        entries.add(ModBlocks.FAKESLATE_GOLD_ORE);


                        entries.add(ModBlocks.THUNDERED_LOG);
                        entries.add(ModBlocks.THUNDERED_WOOD);
                        entries.add(ModBlocks.STRIPPED_THUNDERED_LOG);
                        entries.add(ModBlocks.STRIPPED_THUNDERED_WOOD);
                        entries.add(ModBlocks.THUNDERED_PLANKS);
                        entries.add(ModBlocks.THUNDERED_LEAVES);
                        entries.add(ModBlocks.THUNDERED_SAPLING);

                        entries.add(ModBlocks.VOIDSTONE);
                        entries.add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME);
                        entries.add(ModBlocks.THUNDERANIUM_PORTAL_FRAME);
                        entries.add(ModBlocks.CORRUPTION_PORTAL_FRAME);

                        entries.add(ModBlocks.DREADSTONE);
                        entries.add(ModBlocks.REINFORCED_DREADSTONE);
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_SLAB);
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_STAIRS);
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_WALL);
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_DOOR);
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR);
                        entries.add(ModBlocks.REINFORCED_DREADSTONE_GLASS);
                        entries.add(ModBlocks.DREADSTONE_DIAMOND_ORE);
                        entries.add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE);
                        entries.add(ModBlocks.DREADSTONE_NETHERITE_ORE);
                        entries.add(ModBlocks.VOID_COAL_ORE);
                        entries.add(ModBlocks.VOID_COAL_BLOCK);

                        entries.add(ModBlocks.FAKESTONE);
                        entries.add(ModBlocks.FAKESLATE);


                        entries.add(ModBlocks.THUNDERANIUM_TNT);
                        entries.add(ModBlocks.RED_THUNDERANIUM_TNT);
                        entries.add(ModBlocks.AXON_ALLOY_TNT);

                        entries.add(ModBlocks.CHARGED_DIRT);
                        entries.add(ModBlocks.THUNDERED_STONE);
                        entries.add(ModBlocks.THUNDERANIUM_ORE);
                        entries.add(ModBlocks.RENDERIUM_ORE);

                        entries.add(ModBlocks.CORRUPTED_DIRT);
                        entries.add(ModBlocks.CORRUPTED_STONE);
                        entries.add(ModBlocks.CORRUPTION_BLOCK);
                        entries.add(ModBlocks.CORRUPTINITE_ORE);
                        entries.add(ModBlocks.DENDERIUM_ORE);

                        entries.add(ModBlocks.MWDC_ORE);
                        entries.add(ModBlocks.DCDC_ORE);
                        entries.add(ModBlocks.TLDC_ORE);
                        entries.add(ModBlocks.CLDC_ORE);


                    }).build());

    public static void registerItemGroups() {

    }
}
