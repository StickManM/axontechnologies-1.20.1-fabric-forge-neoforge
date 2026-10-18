package net.stickmanm.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Blocks;
import net.minecraft.block.GlassBlock;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.SmeltingRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.util.ModTags;

import java.util.List;
import java.util.function.Consumer;

import static net.stickmanm.axontechnologies.util.ModTags.Items.TRIMS;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) { //cool comment



        //Merging

        //Ores
        offerSmelting(exporter, List.of(ModBlocks.MIMICARIUM_ORE.get()), RecipeCategory.MISC, ModItems.MIMICARIUM.get(),
                3f, 75, "mimicarium");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get()), RecipeCategory.MISC, ModItems.MIMICARIUM.get(),
                3f, 10, "mimicarium");


        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_DIAMOND_ORE.get()), RecipeCategory.MISC, Items.DIAMOND,
                3f, 75, "diamond");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_NETHERITE_ORE.get()), RecipeCategory.MISC, Items.NETHERITE_INGOT,
                3f, 75, "netherite");

        offerSmelting(exporter, List.of(ModBlocks.VOID_COAL_ORE.get()), RecipeCategory.MISC, ModItems.VOID_COAL.get(),
                3f, 75, "void_coal");

        offerBlasting(exporter, List.of(ModItems.RAW_NETHERITE.get()), RecipeCategory.MISC, Items.NETHERITE_INGOT,
                3f, 75, "netherite");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get()), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM.get(),
                5f, 75, "thunderanium");

        offerSmelting(exporter, List.of(ModBlocks.THUNDERANIUM_ORE.get()), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM.get(),
                5f, 75, "thunderanium");

        offerSmelting(exporter, List.of(ModBlocks.CORRUPTINITE_ORE.get()), RecipeCategory.MISC, ModItems.UNSTABLE_CORRUPTINITE.get(),
                5f, 75, "corruptinite");

        offerSmelting(exporter, List.of(ModBlocks.RENDERIUM_ORE.get()), RecipeCategory.MISC, ModItems.RENDERIUM.get(),
                5f, 75, "renderium");

        offerSmelting(exporter, List.of(ModBlocks.DENDERIUM_ORE.get()), RecipeCategory.MISC, ModItems.DENDERIUM.get(),
                5f, 75, "denderium");


        offerBlasting(exporter, List.of(ModItems.RAW_THUNDERANIUM.get()), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM.get(),
                5f, 75, "thunderanium");

        offerBlasting(exporter, List.of(ModItems.THUNDERANIUM_CLUSTER.get()), RecipeCategory.MISC, ModItems.THUNDERANIUM_INGOT.get(),
                5f, 75, "thunderanium");

        offerBlasting(exporter, List.of(ModItems.RED_THUNDERANIUM_CLUSTER.get()), RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_INGOT.get(),
                10f, 75, "red_thunderanium");

        offerBlasting(exporter, List.of(ModItems.DARK_THUNDERANIUM_CLUSTER.get()), RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_INGOT.get(),
                1000f, 100, "dark_thunderanium");

        offerBlasting(exporter, List.of(ModBlocks.MWDC_ORE.get()), RecipeCategory.MISC, ModItems.MWDC.get(),
                2000f, 250, "dimension_core");

        offerBlasting(exporter, List.of(ModBlocks.DCDC_ORE.get()), RecipeCategory.MISC, ModItems.DCDC.get(),
                2000f, 250, "dimension_core");

        offerBlasting(exporter, List.of(ModBlocks.TLDC_ORE.get()), RecipeCategory.MISC, ModItems.TLDC.get(),
                2000f, 250, "dimension_core");

        offerBlasting(exporter, List.of(ModBlocks.CLDC_ORE.get()), RecipeCategory.MISC, ModItems.CLDC.get(),
                2000f, 250, "dimension_core");

        //BLAST FURNACE +
        offerBlasting(exporter, List.of(Blocks.SAND), RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS,
                5f, 100, "glass");

        offerBlasting(exporter, List.of(Blocks.RED_SAND), RecipeCategory.BUILDING_BLOCKS, Blocks.GLASS,
                5f, 100, "glass");


        offerBlasting(exporter, List.of(Items.CLAY_BALL), RecipeCategory.BUILDING_BLOCKS, Items.BRICK,
                5f, 100, "brick");

        offerBlasting(exporter, List.of(Blocks.NETHERRACK), RecipeCategory.BUILDING_BLOCKS, Items.NETHER_BRICK,
                5f, 100, "brick");


        offerBlasting(exporter, List.of(Blocks.STONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_STONE_BRICKS,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.DEEPSLATE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_BRICKS,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.DEEPSLATE_TILES), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_DEEPSLATE_TILES,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.POLISHED_BLACKSTONE_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_POLISHED_BLACKSTONE_BRICKS,
                5f, 100, "cracked");

        offerBlasting(exporter, List.of(Blocks.NETHER_BRICKS), RecipeCategory.BUILDING_BLOCKS, Blocks.CRACKED_NETHER_BRICKS,
                5f, 100, "cracked");

        //Reinforced Dreadstone Recipes
        createDoorRecipe(ModBlocks.REINFORCED_DREADSTONE_DOOR.get(), Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE.get()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_DOOR.get()))
        .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_DOOR.get())));

        createTrapdoorRecipe(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get(), Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE.get()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get())));

        createStairsRecipe(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get(), Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE.get()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get())));


        createSlabRecipe(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE_SLAB.get(), Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE_SLAB.get()))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_SLAB.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_SLAB.get())));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE_WALL.get(), 6)
                .pattern("# #")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.REINFORCED_DREADSTONE.get())
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_WALL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_WALL.get())));


        //CRAFTING +
        ShapedRecipeJsonBuilder.create(RecipeCategory.REDSTONE, Items.HOPPER)
                .pattern("# #")
                .pattern("#B#")
                .pattern(" # ")
                .input('#', Items.IRON_INGOT)
                .input('B', Items.BARREL)
                .criterion(FabricRecipeProvider.hasItem(Items.BARREL),
                        FabricRecipeProvider.conditionsFromItem(Items.HOPPER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.HOPPER)));



        //TNT
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERANIUM_TNT.get())
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('T', Blocks.TNT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERANIUM_TNT.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERANIUM_TNT.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_THUNDERANIUM_TNT.get())
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('T', ModBlocks.THUNDERANIUM_TNT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.RED_THUNDERANIUM_TNT.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.RED_THUNDERANIUM_TNT.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AXON_ALLOY_TNT.get())
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModBlocks.RED_THUNDERANIUM_TNT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AXON_ALLOY_TNT.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.AXON_ALLOY_TNT.get())));


        //Thundered Wood

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERED_WOOD.get())
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.THUNDERED_LOG.get())
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.THUNDERED_LOG.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERED_WOOD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERED_WOOD.get())));

       //IGNITERS
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MIMICARIUM_IGNITER.get())
                .pattern(" F#")
                .pattern(" SF")
                .pattern("S  ")
                .input('#', ModItems.MIMICARIUM.get())
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MIMICARIUM.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MIMICARIUM_IGNITER.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MIMICARIUM_IGNITER.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DREADED_IGNITER.get())
                .pattern("FVF")
                .pattern("V#V")
                .pattern("FVF")
                .input('#', ModItems.MIMICARIUM_IGNITER.get())
                .input('V', ModBlocks.VOIDSTONE.get())
                .input('F', Items.FLINT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DREADED_IGNITER.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DREADED_IGNITER.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_KEY.get())
                .pattern("RGR")
                .pattern("#I#")
                .pattern("RGR")
                .input('I', ModItems.DREADED_IGNITER.get())
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('G', Items.GOLD_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_KEY.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_KEY.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTION_GATEWAY.get())
                .pattern("DRD")
                .pattern("#K#")
                .pattern("DRD")
                .input('K', ModItems.THUNDERANIUM_KEY.get())
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('D', ModBlocks.CORRUPTION_BLOCK.get())
                .input('R', ModItems.RED_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CORRUPTION_BLOCK.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTION_GATEWAY.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTION_GATEWAY.get())));

        //PORTAL FRAMES
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get())
                .pattern("I#I")
                .pattern("#C#")
                .pattern("I#I")
                .input('#', ModItems.MIMICARIUM.get())
                .input('I', Items.IRON_INGOT)
                .input('C', Items.COAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MIMICARIUM.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERANIUM_PORTAL_FRAME.get())
                .pattern("DVD")
                .pattern("#V#")
                .pattern("DVD")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('D', ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get())
                .input('V', ModBlocks.VOIDSTONE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPTION_PORTAL_FRAME.get())
                .pattern("DRD")
                .pattern("#F#")
                .pattern("DTD")
                .input('#', ModItems.RED_ESSENCE.get())
                .input('D', ModBlocks.CORRUPTION_BLOCK.get())
                .input('F', ModBlocks.THUNDERANIUM_PORTAL_FRAME.get())
                .input('T', ModItems.THUNDERANIUM_INGOT.get())
                .input('R', ModItems.RED_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CORRUPTION_BLOCK.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.CORRUPTION_PORTAL_FRAME.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.CORRUPTION_PORTAL_FRAME.get())));

        //MISC
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_CLUSTER.get())
                .pattern("###")
                .pattern("TTT")
                .pattern("###")
                .input('#', ModItems.RED_ESSENCE.get())
                .input('T', ModItems.THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_ESSENCE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_CLUSTER.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_CLUSTER.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_CLUSTER.get())
                .pattern("###")
                .input('#', ModItems.REFINED_THUNDERANIUM.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.REFINED_THUNDERANIUM.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CLUSTER.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CLUSTER.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_CLUSTER.get())
                .pattern(" ##")
                .pattern(" TT")
                .pattern(" ##")
                .input('#', ModItems.DARK_ESSENCE.get())
                .input('T', ModItems.RED_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_ESSENCE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_CLUSTER.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_CLUSTER.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE.get())
                .pattern("###")
                .pattern("UUU")
                .pattern("###")
                .input('#', ModItems.DARK_ESSENCE.get())
                .input('U', ModItems.UNSTABLE_CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.UNSTABLE_CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)
                .pattern("#I#")
                .pattern("#N#")
                .pattern("###")
                .input('I', TRIMS)
                .input('N', Blocks.NETHERRACK)
                .input('#', Blocks.NETHERITE_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_INGOT),
                        FabricRecipeProvider.conditionsFromItem(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(Items.NETHERITE_UPGRADE_SMITHING_TEMPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GX_BUCKET.get())
                .pattern("#D#")
                .pattern("#L#")
                .pattern("#R#")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('L', ModItems.LIQUID_THUNDER_BUCKET.get())
                .input('D', ModItems.AXON_ALLOY_HELMET.get())
                .input('R', ModItems.AXON_ALLOY_BOOTS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.LIQUID_THUNDER_BUCKET.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GX_BUCKET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GX_BUCKET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE.get())
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .input('#', ModBlocks.DREADSTONE.get())
                .input('G', Items.GLOWSTONE_DUST)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DREADSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE_GLASS.get())
                .pattern("G#G")
                .pattern("#G#")
                .pattern("G#G")
                .input('#', ModBlocks.REINFORCED_DREADSTONE.get())
                .input('G', Blocks.GLASS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_GLASS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_GLASS.get())));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY.get())
                .pattern("RES")
                .pattern("THN")
                .pattern("CDM")
                .input('E', ModItems.DARK_ESSENCE.get())
                .input('C', ModItems.CORRUPTINITE.get())
                .input('D', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('R', ModItems.RED_ESSENCE.get())
                .input('M', ModItems.MIMICARIUM.get())
                .input('T', ModItems.THUNDERANIUM_INGOT.get())
                .input('H', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('N', Items.NETHERITE_INGOT)
                .input('S', ModItems.QUADRUPLE_COMPRESSED_STICK.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY.get()))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAZZORIUM.get())
                .pattern("MAD")
                .pattern("GHG")
                .pattern("TAC")
                .input('M', ModItems.MWDC.get())
                .input('D', ModItems.DCDC.get())
                .input('T', ModItems.TLDC.get())
                .input('C', ModItems.CLDC.get())
                .input('H', ModItems.ULTIMATE_HOE_TROPHY.get())
                .input('G', ModItems.GX_BUCKET.get())
                .input('A', ModItems.AXON_ALLOY.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.GX_BUCKET.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAZZORIUM.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAZZORIUM.get())));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAZZOR.get())
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RSR")
                .input('R', ModItems.RAZZORIUM.get())
                .input('S', ModItems.QUATTUORDECUPLE_COMPRESSED_STICK.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAZZORIUM.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAZZOR.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAZZOR.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAZZORIUM_MINER.get())
                .pattern("RRR")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModItems.RAZZORIUM.get())
                .input('S', ModItems.QUATTUORDECUPLE_COMPRESSED_STICK.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAZZORIUM.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAZZORIUM_MINER.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAZZORIUM_MINER.get())));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TICKLE_TRAVIS_TICKLER.get())
                .input(ModItems.RAZZOR.get())
                .input(Items.FEATHER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAZZOR.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TICKLE_TRAVIS_TICKLER.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TICKLE_TRAVIS_TICKLER.get())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_ESSENCE.get(), 12)
                .input(ModItems.RENDERIUM.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RENDERIUM.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_ESSENCE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_ESSENCE.get())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_ESSENCE.get(), 12)
                .input(ModItems.DENDERIUM.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENDERIUM.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_ESSENCE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_ESSENCE.get())));

        //Fuels
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDER_FUEL.get(), 2)
                .input(ModItems.THUNDERANIUM_INGOT.get())
                .input(ModBlocks.VOID_COAL_BLOCK.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDER_FUEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDER_FUEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.VOID_COAL_BLOCK.get())
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.VOID_COAL.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOID_COAL.get()),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOID_COAL_BLOCK.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.VOID_COAL_BLOCK.get())));

        //Compressed Sticks
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.COMPRESSED_STICK.get(), Items.STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.DOUBLE_COMPRESSED_STICK.get(), ModItems.COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.TRIPLE_COMPRESSED_STICK.get(),  ModItems.DOUBLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.QUADRUPLE_COMPRESSED_STICK.get(),  ModItems.TRIPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.QUINTUPLE_COMPRESSED_STICK.get(),  ModItems.QUADRUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.SEXTUPLE_COMPRESSED_STICK.get(),  ModItems.QUINTUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.SEPTUPLE_COMPRESSED_STICK.get(),  ModItems.SEXTUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.OCTUPLE_COMPRESSED_STICK.get(),  ModItems.SEPTUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.NONUPLE_COMPRESSED_STICK.get(),  ModItems.OCTUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.DECUPLE_COMPRESSED_STICK.get(),  ModItems.NONUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.UNDECUPLE_COMPRESSED_STICK.get(),  ModItems.DECUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.DUODECUPLE_COMPRESSED_STICK.get(),  ModItems.UNDECUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.TREDECUPLE_COMPRESSED_STICK.get(),  ModItems.DUODECUPLE_COMPRESSED_STICK.get());
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.QUATTUORDECUPLE_COMPRESSED_STICK.get(),  ModItems.TREDECUPLE_COMPRESSED_STICK.get());

        //Armor

        //Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_HELMET.get())
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_HELMET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_HELMET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_CHESTPLATE.get())
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CHESTPLATE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CHESTPLATE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_LEGGINGS.get())
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_LEGGINGS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_LEGGINGS.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_BOOTS.get())
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_BOOTS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_BOOTS.get())));

        //Red Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_HELMET.get())
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.THUNDERANIUM_HELMET.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_HELMET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_HELMET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_CHESTPLATE.get())
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.THUNDERANIUM_CHESTPLATE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_CHESTPLATE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_CHESTPLATE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_LEGGINGS.get())
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.THUNDERANIUM_LEGGINGS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_LEGGINGS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_LEGGINGS.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_BOOTS.get())
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.THUNDERANIUM_BOOTS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_BOOTS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_BOOTS.get())));


        //Dark Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_HELMET.get())
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.RED_THUNDERANIUM_HELMET.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_HELMET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_HELMET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_CHESTPLATE.get())
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.RED_THUNDERANIUM_CHESTPLATE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_CHESTPLATE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_CHESTPLATE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_LEGGINGS.get())
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.RED_THUNDERANIUM_LEGGINGS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_LEGGINGS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_LEGGINGS.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_BOOTS.get())
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('T', ModItems.RED_THUNDERANIUM_BOOTS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_BOOTS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_BOOTS.get())));

        //Corruptinite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_HELMET.get())
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('T', ModItems.RED_THUNDERANIUM_HELMET.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_HELMET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_HELMET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_CHESTPLATE.get())
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('T', ModItems.RED_THUNDERANIUM_CHESTPLATE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_CHESTPLATE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_CHESTPLATE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_LEGGINGS.get())
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('T', ModItems.RED_THUNDERANIUM_LEGGINGS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_LEGGINGS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_LEGGINGS.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_BOOTS.get())
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('T', ModItems.RED_THUNDERANIUM_BOOTS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_BOOTS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_BOOTS.get())));

        //Axon Alloy G
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_HELMET.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_CHESTPLATE.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_LEGGINGS.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_BOOTS.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS.get())));

        //Axon Alloy C
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_HELMET.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.CORRUPTINITE_HELMET.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.CORRUPTINITE_CHESTPLATE.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.CORRUPTINITE_LEGGINGS.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.CORRUPTINITE_BOOTS.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS.get())));

        //Axon Alloy A
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_HELMET.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_HELMET.get())
                .input('M', ModItems.CORRUPTINITE_HELMET.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_HELMET.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_HELMET.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_CHESTPLATE.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_CHESTPLATE.get())
                .input('M', ModItems.CORRUPTINITE_CHESTPLATE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_CHESTPLATE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_CHESTPLATE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_LEGGINGS.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_LEGGINGS.get())
                .input('M', ModItems.CORRUPTINITE_LEGGINGS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_LEGGINGS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_LEGGINGS.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_BOOTS.get())
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('A', ModItems.DARK_THUNDERANIUM_BOOTS.get())
                .input('M', ModItems.CORRUPTINITE_BOOTS.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_BOOTS.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_BOOTS.get())));


        //Tools

        //MISC
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANTIGLITCH_SWORD.get())
                .pattern("EEE")
                .pattern("E#E")
                .pattern("EEE")
                .input('#', ModItems.RED_THUNDERANIUM_SWORD.get())
                .input('E', ModItems.DARK_ESSENCE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_ESSENCE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANTIGLITCH_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ANTIGLITCH_SWORD.get())));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VANILLA_HOE.get())
                .input(Items.GOLDEN_HOE)
                .input(Items.IRON_HOE)
                .input(Items.DIAMOND_HOE)
                .input(Items.WOODEN_HOE)
                .input(Items.STONE_HOE)
                .input(Items.NETHERITE_HOE)
                .criterion(FabricRecipeProvider.hasItem(Items.WOODEN_HOE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VANILLA_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.VANILLA_HOE.get())));




        //Axon
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTIMATE_HOE_TROPHY.get())
                .input(ModItems.VANILLA_HOE.get())
                .input(ModItems.THUNDERANIUM_HOE.get())
                .input(ModItems.RED_THUNDERANIUM_HOE.get())
                .input(ModItems.DARK_THUNDERANIUM_HOE.get())
                .input(ModItems.CORRUPTINITE_HOE.get())
                .input(ModItems.CORRUPTINITE_AXON_ALLOY_HOE.get())
                .input(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE.get())
                .input(ModItems.AXON_ALLOY_HOE.get())
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_HOE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ULTIMATE_HOE_TROPHY.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ULTIMATE_HOE_TROPHY.get())));


//Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_SWORD.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_PICKAXE.get())
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_PICKAXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_PICKAXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_SHOVEL.get())
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_SHOVEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_SHOVEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_AXE.get())
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_AXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_AXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_HOE.get())
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_HOE.get())));


//Red Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_SWORD.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_PICKAXE.get())
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_PICKAXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_PICKAXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_SHOVEL.get())
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_SHOVEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_SHOVEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_AXE.get())
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_AXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_AXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_HOE.get())
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_HOE.get())));



//Dark Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_SWORD.get())
                .pattern("E#E")
                .pattern("E#E")
                .pattern("ESE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('S', ModItems.ANTIGLITCH_SWORD.get())
                .input('E', ModItems.DARK_ESSENCE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_SWORD.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_PICKAXE.get())
                .pattern("###")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE.get())
                .input('B', ModItems.RED_THUNDERANIUM_PICKAXE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_PICKAXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_PICKAXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_SHOVEL.get())
                .pattern("E#E")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE.get())
                .input('B', ModItems.RED_THUNDERANIUM_SHOVEL.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_SHOVEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_SHOVEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXE.get())
                .pattern("##E")
                .pattern("#SE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE.get())
                .input('B', ModItems.RED_THUNDERANIUM_AXE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_HOE.get())
                .pattern("##E")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE.get())
                .input('B', ModItems.RED_THUNDERANIUM_HOE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_HOE.get())));


//Corruptinite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_SWORD.get())
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('S', ModItems.ANTIGLITCH_SWORD.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_SWORD.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_PICKAXE.get())
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_PICKAXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_PICKAXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_SHOVEL.get())
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_SHOVEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_SHOVEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXE.get())
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_HOE.get())
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE.get())
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_HOE.get())));

//Axon Alloy G
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.DARK_THUNDERANIUM_SWORD.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.DARK_THUNDERANIUM_AXE.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.DARK_THUNDERANIUM_PICKAXE.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.DARK_THUNDERANIUM_SHOVEL.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.DARK_THUNDERANIUM_HOE.get())
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE.get())));

//Axon Alloy C
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_SWORD.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_SWORD.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_AXE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_AXE.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_AXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_AXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_PICKAXE.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_SHOVEL.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_HOE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_HOE.get())
                .input('M', ModItems.CORRUPTINITE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_HOE.get())));

//Axon Alloy A
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_SWORD.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_SWORD.get())
                .input('M', ModItems.DARK_THUNDERANIUM_SWORD.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_SWORD.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_SWORD.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_AXE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_AXE.get())
                .input('M', ModItems.DARK_THUNDERANIUM_AXE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_AXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_AXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_PICKAXE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_PICKAXE.get())
                .input('M', ModItems.DARK_THUNDERANIUM_PICKAXE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_PICKAXE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_PICKAXE.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_SHOVEL.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_SHOVEL.get())
                .input('M', ModItems.DARK_THUNDERANIUM_SHOVEL.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_SHOVEL.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_SHOVEL.get())));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_HOE.get())
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY.get())
                .input('T', ModItems.CORRUPTINITE_HOE.get())
                .input('M', ModItems.DARK_THUNDERANIUM_HOE.get())
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY.get()),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_HOE.get()))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_HOE.get())));



    }
}
