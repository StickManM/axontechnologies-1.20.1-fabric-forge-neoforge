package net.stickmanm.axontechnologies.data;

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
        addDrop(ModBlocks.MIMICARIUM_ORE,oreDrops(ModBlocks.MIMICARIUM_ORE, ModItems.MIMICARIUM));
        addDrop(ModBlocks.DEEPSLATE_MIMICARIUM_ORE,oreDrops(ModBlocks.DEEPSLATE_MIMICARIUM_ORE, ModItems.MIMICARIUM));
        addDrop(ModBlocks.FAKESTONE_IRON_ORE,oreDrops(ModBlocks.FAKESTONE_IRON_ORE, Items.RAW_IRON));
        addDrop(ModBlocks.FAKESTONE_GOLD_ORE,oreDrops(ModBlocks.FAKESTONE_GOLD_ORE, Items.RAW_GOLD));
        addDrop(ModBlocks.FAKESLATE_IRON_ORE,oreDrops(ModBlocks.FAKESTONE_IRON_ORE, Items.RAW_IRON));
        addDrop(ModBlocks.FAKESLATE_GOLD_ORE,oreDrops(ModBlocks.FAKESTONE_GOLD_ORE, Items.RAW_GOLD));
        addDrop(ModBlocks.THUNDERANIUM_ORE,oreDrops(ModBlocks.THUNDERANIUM_ORE, ModItems.REFINED_THUNDERANIUM));
        addDrop(ModBlocks.RENDERIUM_ORE,oreDrops(ModBlocks.RENDERIUM_ORE, ModItems.RENDERIUM));
        addDrop(ModBlocks.DENDERIUM_ORE,oreDrops(ModBlocks.DENDERIUM_ORE, ModItems.DENDERIUM));
        addDrop(ModBlocks.CORRUPTINITE_ORE,oreDrops(ModBlocks.CORRUPTINITE_ORE, ModItems.UNSTABLE_CORRUPTINITE));


        //Thundered Tree
        addDrop(ModBlocks.THUNDERED_LOG);
        addDrop(ModBlocks.THUNDERED_WOOD);
        addDrop(ModBlocks.THUNDERED_PLANKS);
        addDrop(ModBlocks.THUNDERED_SAPLING);
        addDrop(ModBlocks.STRIPPED_THUNDERED_LOG);
        addDrop(ModBlocks.STRIPPED_THUNDERED_WOOD);
        addVinePlantDrop(ModBlocks.THUNDERED_LEAVES,ModBlocks.THUNDERED_LEAVES);

        //Dreadstone and Dreadstone Ores
        addDrop(ModBlocks.DREADSTONE);
        addDrop(ModBlocks.REINFORCED_DREADSTONE);
        addDrop(ModBlocks.REINFORCED_DREADSTONE_STAIRS);
        addDrop(ModBlocks.REINFORCED_DREADSTONE_WALL);
        addDrop(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR);
        addDrop(ModBlocks.REINFORCED_DREADSTONE_GLASS);
        addDrop(ModBlocks.REINFORCED_DREADSTONE_DOOR, doorDrops(ModBlocks.REINFORCED_DREADSTONE_DOOR));
        addDrop(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR, slabDrops(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR));
        addDrop(ModBlocks.DREADSTONE_DIAMOND_ORE,oreDrops(ModBlocks.DREADSTONE_DIAMOND_ORE, Items.DIAMOND));
        addDrop(ModBlocks.DREADSTONE_THUNDERANIUM_ORE,oreDrops(ModBlocks.DREADSTONE_THUNDERANIUM_ORE, ModItems.RAW_THUNDERANIUM));
        addDrop(ModBlocks.DREADSTONE_NETHERITE_ORE,oreDrops(ModBlocks.DREADSTONE_NETHERITE_ORE, ModItems.RAW_NETHERITE));
        addDrop(ModBlocks.VOID_COAL_ORE,oreDrops(ModBlocks.VOID_COAL_ORE, ModItems.VOID_COAL));
        addDrop(ModBlocks.VOID_COAL_BLOCK);

        addDrop(ModBlocks.MWDC_ORE,oreDrops(ModBlocks.MWDC_ORE, ModItems.MWDC));
        addDrop(ModBlocks.DCDC_ORE,oreDrops(ModBlocks.DCDC_ORE, ModItems.DCDC));
        addDrop(ModBlocks.TLDC_ORE,oreDrops(ModBlocks.TLDC_ORE, ModItems.TLDC));
        addDrop(ModBlocks.CLDC_ORE,oreDrops(ModBlocks.CLDC_ORE, ModItems.CLDC));

        //MISC
        addDrop(ModBlocks.VOIDSTONE);
        addDrop(ModBlocks.MIMIMCARIUM_PORTAL_FRAME);
        addDrop(ModBlocks.FAKESTONE);
        addDrop(ModBlocks.FAKESLATE);
        addDrop(ModBlocks.CHARGED_DIRT);
        addDrop(ModBlocks.THUNDERANIUM_PORTAL_FRAME);
        addDrop(ModBlocks.THUNDERED_STONE);
        addDrop(ModBlocks.CORRUPTED_DIRT);
        addDrop(ModBlocks.CORRUPTED_STONE);
        addDrop(ModBlocks.CORRUPTION_PORTAL_FRAME);
        addDrop(ModBlocks.CORRUPTION_BLOCK);

        //TNT
        addDrop(ModBlocks.THUNDERANIUM_TNT);
        addDrop(ModBlocks.RED_THUNDERANIUM_TNT);
        addDrop(ModBlocks.AXON_ALLOY_TNT);




    }
}
