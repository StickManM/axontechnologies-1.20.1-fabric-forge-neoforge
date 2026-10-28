package net.stickmanm.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //Ores
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MIMICARIUM_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RENDERIUM_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DENDERIUM_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESTONE_IRON_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESTONE_GOLD_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESLATE_IRON_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESLATE_GOLD_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERANIUM_ORE.get());


        //Thundered Tree Blocks
        blockStateModelGenerator.registerLog(ModBlocks.THUNDERED_LOG.get()).log(ModBlocks.THUNDERED_LOG.get()).wood(ModBlocks.THUNDERED_WOOD.get());
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_THUNDERED_LOG.get()).log(ModBlocks.STRIPPED_THUNDERED_LOG.get()).wood(ModBlocks.STRIPPED_THUNDERED_WOOD.get());

        BlockStateModelGenerator.BlockTexturePool thunderedPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERED_PLANKS.get());
        blockStateModelGenerator.registerDoor(ModBlocks.THUNDERED_DOOR.get());
        blockStateModelGenerator.registerTrapdoor(ModBlocks.THUNDERED_TRAPDOOR.get());
        thunderedPlanksPool.fence(ModBlocks.THUNDERED_FENCE.get());
        thunderedPlanksPool.fenceGate(ModBlocks.THUNDERED_FENCE_GATE.get());
        thunderedPlanksPool.stairs(ModBlocks.THUNDERED_STAIRS.get());
        thunderedPlanksPool.slab(ModBlocks.THUNDERED_SLAB.get());
        thunderedPlanksPool.button(ModBlocks.THUNDERED_BUTTON.get());
        thunderedPlanksPool.pressurePlate(ModBlocks.THUNDERED_PRESSURE_PLATE.get());

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERED_LEAVES.get());
        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.THUNDERED_SAPLING.get(), BlockStateModelGenerator.TintType.NOT_TINTED);

        //Corrupted Tree Blocks
        blockStateModelGenerator.registerLog(ModBlocks.CORRUPTED_LOG.get()).log(ModBlocks.CORRUPTED_LOG.get()).wood(ModBlocks.CORRUPTED_WOOD.get());
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CORRUPTED_LOG.get()).log(ModBlocks.STRIPPED_CORRUPTED_LOG.get()).wood(ModBlocks.STRIPPED_CORRUPTED_WOOD.get());

        BlockStateModelGenerator.BlockTexturePool corruptedPlanksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTED_PLANKS.get());
        blockStateModelGenerator.registerDoor(ModBlocks.CORRUPTED_DOOR.get());
        blockStateModelGenerator.registerTrapdoor(ModBlocks.CORRUPTED_TRAPDOOR.get());
        corruptedPlanksPool.fence(ModBlocks.CORRUPTED_FENCE.get());
        corruptedPlanksPool.fenceGate(ModBlocks.CORRUPTED_FENCE_GATE.get());
        corruptedPlanksPool.stairs(ModBlocks.CORRUPTED_STAIRS.get());
        corruptedPlanksPool.slab(ModBlocks.CORRUPTED_SLAB.get());
        corruptedPlanksPool.button(ModBlocks.CORRUPTED_BUTTON.get());
        corruptedPlanksPool.pressurePlate(ModBlocks.CORRUPTED_PRESSURE_PLATE.get());

        blockStateModelGenerator.registerTintableCrossBlockState(ModBlocks.CORRUPTED_SAPLING.get(), BlockStateModelGenerator.TintType.NOT_TINTED);



        //Dreadstone and Dreadstone Ores
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE.get());
        BlockStateModelGenerator.BlockTexturePool reinforcedDreadstonePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REINFORCED_DREADSTONE.get());
        blockStateModelGenerator.registerDoor(ModBlocks.REINFORCED_DREADSTONE_DOOR.get());
        blockStateModelGenerator.registerTrapdoor(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.REINFORCED_DREADSTONE_GLASS.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE_DIAMOND_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DREADSTONE_NETHERITE_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_COAL_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOID_COAL_BLOCK.get());

        //Reinforced Dreadstone
        reinforcedDreadstonePool.wall(ModBlocks.REINFORCED_DREADSTONE_WALL.get());
        reinforcedDreadstonePool.stairs(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get());
        reinforcedDreadstonePool.slab(ModBlocks.REINFORCED_DREADSTONE_SLAB.get());

        //Dimension Core ore
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MWDC_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DCDC_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TLDC_ORE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CLDC_ORE.get());

        //MISC

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.VOIDSTONE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTION_PORTAL_FRAME.get());

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESTONE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.FAKESLATE.get());

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHARGED_DIRT.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.THUNDERED_STONE.get());

        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTED_STONE.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTED_DIRT.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTION_BLOCK.get());
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CORRUPTINITE_ORE.get());


        blockStateModelGenerator.registerSingleton(ModBlocks.THUNDERANIUM_TNT.get(), TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.RED_THUNDERANIUM_TNT.get(), TexturedModel.END_FOR_TOP_CUBE_COLUMN);
        blockStateModelGenerator.registerSingleton(ModBlocks.AXON_ALLOY_TNT.get(), TexturedModel.END_FOR_TOP_CUBE_COLUMN);



        //SPAWN EGGS
        blockStateModelGenerator.registerParentedItemModel(ModItems.RED_ESSENCE_ZOMBIE_SPAWN_EGG.get(), ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));
        blockStateModelGenerator.registerParentedItemModel(ModItems.GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE_SPAWN_EGG.get(), ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));
        blockStateModelGenerator.registerParentedItemModel(ModItems.DARK_ESSENCE_ZOMBIE_SPAWN_EGG.get(), ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));
        blockStateModelGenerator.registerParentedItemModel(ModItems.LOST_MINER_SPAWN_EGG.get(), ModelIds.getMinecraftNamespacedItem("template_spawn_egg"));

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {

        itemModelGenerator.register(ModItems.MIMICARIUM.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_NETHERITE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.AXON_ALLOY.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RAZZORIUM.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RENDERIUM.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DENDERIUM.get(), Models.GENERATED);

        //Buckests
        itemModelGenerator.register(ModItems.LIQUID_THUNDER_BUCKET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.LIQUID_CORRUPTION_BUCKET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.GX_BUCKET.get(), Models.GENERATED);

        //Fuels
        itemModelGenerator.register(ModItems.THUNDER_FUEL.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.VOID_COAL.get(), Models.GENERATED);

        //Igniters
        itemModelGenerator.register(ModItems.MIMICARIUM_IGNITER.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DREADED_IGNITER.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_KEY.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTION_GATEWAY.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.UNIVERSAL_IGNITER.get(), Models.GENERATED);

        //COMPRESSED STICKS
        itemModelGenerator.register(ModItems.COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUBLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.TRIPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.QUADRUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.QUINTUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.SEXTUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.SEPTUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.OCTUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.NONUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DECUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.UNDECUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DUODECUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.TREDECUPLE_COMPRESSED_STICK.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.QUATTUORDECUPLE_COMPRESSED_STICK.get(), Models.GENERATED);

        //Dimension Core
        itemModelGenerator.register(ModItems.MWDC.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DCDC.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.TLDC.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CLDC.get(), Models.GENERATED);

        //Thunderanium
        itemModelGenerator.register(ModItems.RAW_THUNDERANIUM.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.REFINED_THUNDERANIUM.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_CLUSTER.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_INGOT.get(), Models.GENERATED);

        //Red Thunderanium
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_INGOT.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_CLUSTER.get(), Models.GENERATED);

        //Essence
        itemModelGenerator.register(ModItems.RED_ESSENCE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_ESSENCE.get(), Models.GENERATED);

        //Dark Thunderanium
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_INGOT.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_CLUSTER.get(), Models.GENERATED);

        //Corruptinite
        itemModelGenerator.register(ModItems.CORRUPTINITE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.UNSTABLE_CORRUPTINITE.get(), Models.GENERATED);

        //Armors

        itemModelGenerator.register(ModItems.THUNDERANIUM_HELMET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_CHESTPLATE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_LEGGINGS.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.THUNDERANIUM_BOOTS.get(), Models.GENERATED);

        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_HELMET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_CHESTPLATE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_LEGGINGS.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_BOOTS.get(), Models.GENERATED);

        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_HELMET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_CHESTPLATE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_LEGGINGS.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_BOOTS.get(), Models.GENERATED);

        itemModelGenerator.register(ModItems.CORRUPTINITE_HELMET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_CHESTPLATE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_LEGGINGS.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_BOOTS.get(), Models.GENERATED);

        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS.get(), Models.GENERATED);

        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS.get(), Models.GENERATED);

        itemModelGenerator.register(ModItems.AXON_ALLOY_HELMET.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.AXON_ALLOY_CHESTPLATE.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.AXON_ALLOY_LEGGINGS.get(), Models.GENERATED);
        itemModelGenerator.register(ModItems.AXON_ALLOY_BOOTS.get(), Models.GENERATED);

        //Tools

        itemModelGenerator.register(ModItems.ANTIGLITCH_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.VANILLA_HOE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.ULTIMATE_HOE_TROPHY.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAZZOR.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.RAZZORIUM_MINER.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.TICKLE_TRAVIS_TICKLER.get(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.THUNDERANIUM_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_AXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_PICKAXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_SHOVEL.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.THUNDERANIUM_HOE.get(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_AXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_PICKAXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_SHOVEL.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.RED_THUNDERANIUM_HOE.get(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_PICKAXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_SHOVEL.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_HOE.get(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.CORRUPTINITE_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_PICKAXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_SHOVEL.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_HOE.get(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE.get(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_AXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.CORRUPTINITE_AXON_ALLOY_HOE.get(), Models.HANDHELD);

        itemModelGenerator.register(ModItems.AXON_ALLOY_SWORD.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.AXON_ALLOY_AXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.AXON_ALLOY_PICKAXE.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.AXON_ALLOY_SHOVEL.get(), Models.HANDHELD);
        itemModelGenerator.register(ModItems.AXON_ALLOY_HOE.get(), Models.HANDHELD);


    }
}
