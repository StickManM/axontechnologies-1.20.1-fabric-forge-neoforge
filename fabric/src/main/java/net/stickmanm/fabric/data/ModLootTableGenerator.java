package net.stickmanm.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.item.Items;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {

    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        //Ores
        addDrop(ModBlocks.MIMICARIUM_ORE.get(),oreDrops(ModBlocks.MIMICARIUM_ORE.get(), ModItems.MIMICARIUM.get()));
        addDrop(ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get(),oreDrops(ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get(), ModItems.MIMICARIUM.get()));
        addDrop(ModBlocks.FAKESTONE_IRON_ORE.get(),oreDrops(ModBlocks.FAKESTONE_IRON_ORE.get(), Items.RAW_IRON));
        addDrop(ModBlocks.FAKESTONE_GOLD_ORE.get(),oreDrops(ModBlocks.FAKESTONE_GOLD_ORE.get(), Items.RAW_GOLD));
        addDrop(ModBlocks.FAKESLATE_IRON_ORE.get(),oreDrops(ModBlocks.FAKESTONE_IRON_ORE.get(), Items.RAW_IRON));
        addDrop(ModBlocks.FAKESLATE_GOLD_ORE.get(),oreDrops(ModBlocks.FAKESTONE_GOLD_ORE.get(), Items.RAW_GOLD));
        addDrop(ModBlocks.THUNDERANIUM_ORE.get(),oreDrops(ModBlocks.THUNDERANIUM_ORE.get(), ModItems.REFINED_THUNDERANIUM.get()));
        addDrop(ModBlocks.RENDERIUM_ORE.get(),oreDrops(ModBlocks.RENDERIUM_ORE.get(), ModItems.RENDERIUM.get()));
        addDrop(ModBlocks.DENDERIUM_ORE.get(),oreDrops(ModBlocks.DENDERIUM_ORE.get(), ModItems.DENDERIUM.get()));
        addDrop(ModBlocks.CORRUPTINITE_ORE.get(),oreDrops(ModBlocks.CORRUPTINITE_ORE.get(), ModItems.UNSTABLE_CORRUPTINITE.get()));


        //Thundered Tree
        addDrop(ModBlocks.THUNDERED_LOG.get());
        addDrop(ModBlocks.THUNDERED_WOOD.get());
        addDrop(ModBlocks.THUNDERED_PLANKS.get());
        addDrop(ModBlocks.THUNDERED_SAPLING.get());
        addDrop(ModBlocks.STRIPPED_THUNDERED_LOG.get());
        addDrop(ModBlocks.STRIPPED_THUNDERED_WOOD.get());
        addVinePlantDrop(ModBlocks.THUNDERED_LEAVES.get(),ModBlocks.THUNDERED_LEAVES.get());

        //Dreadstone and Dreadstone Ores
        addDrop(ModBlocks.DREADSTONE.get());
        addDrop(ModBlocks.REINFORCED_DREADSTONE.get());
        addDrop(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get());
        addDrop(ModBlocks.REINFORCED_DREADSTONE_WALL.get());
        addDrop(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get());
        addDrop(ModBlocks.REINFORCED_DREADSTONE_GLASS.get());
        addDrop(ModBlocks.REINFORCED_DREADSTONE_DOOR.get(), doorDrops(ModBlocks.REINFORCED_DREADSTONE_DOOR.get()));
        addDrop(ModBlocks.DREADSTONE_DIAMOND_ORE.get(),oreDrops(ModBlocks.DREADSTONE_DIAMOND_ORE.get(), Items.DIAMOND));
        addDrop(ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get(),oreDrops(ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get(), ModItems.RAW_THUNDERANIUM.get()));
        addDrop(ModBlocks.DREADSTONE_NETHERITE_ORE.get(),oreDrops(ModBlocks.DREADSTONE_NETHERITE_ORE.get(), ModItems.RAW_NETHERITE.get()));
        addDrop(ModBlocks.VOID_COAL_ORE.get(),oreDrops(ModBlocks.VOID_COAL_ORE.get(), ModItems.VOID_COAL.get()));
        addDrop(ModBlocks.VOID_COAL_BLOCK.get());

        addDrop(ModBlocks.MWDC_ORE.get(),oreDrops(ModBlocks.MWDC_ORE.get(), ModItems.MWDC.get()));
        addDrop(ModBlocks.DCDC_ORE.get(),oreDrops(ModBlocks.DCDC_ORE.get(), ModItems.DCDC.get()));
        addDrop(ModBlocks.TLDC_ORE.get(),oreDrops(ModBlocks.TLDC_ORE.get(), ModItems.TLDC.get()));
        addDrop(ModBlocks.CLDC_ORE.get(),oreDrops(ModBlocks.CLDC_ORE.get(), ModItems.CLDC.get()));

        //MISC
        addDrop(ModBlocks.VOIDSTONE.get());
        addDrop(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get());
        addDrop(ModBlocks.FAKESTONE.get());
        addDrop(ModBlocks.FAKESLATE.get());
        addDrop(ModBlocks.CHARGED_DIRT.get());
        addDrop(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get());
        addDrop(ModBlocks.THUNDERED_STONE.get());
        addDrop(ModBlocks.CORRUPTED_DIRT.get());
        addDrop(ModBlocks.CORRUPTED_STONE.get());
        addDrop(ModBlocks.CORRUPTION_PORTAL_FRAME.get());
        addDrop(ModBlocks.CORRUPTION_BLOCK.get());

        //TNT
        addDrop(ModBlocks.THUNDERANIUM_TNT.get());
        addDrop(ModBlocks.RED_THUNDERANIUM_TNT.get());
        addDrop(ModBlocks.AXON_ALLOY_TNT.get());




    }
}
