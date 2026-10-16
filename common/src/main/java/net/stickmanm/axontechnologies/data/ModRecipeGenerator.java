package net.stickmanm.axontechnologies.data;

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
        offerSmelting(exporter, List.of(ModBlocks.MIMICARIUM_ORE), RecipeCategory.MISC, ModItems.MIMICARIUM,
                3f, 75, "mimicarium");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_MIMICARIUM_ORE), RecipeCategory.MISC, ModItems.MIMICARIUM,
                3f, 10, "mimicarium");


        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_DIAMOND_ORE), RecipeCategory.MISC, Items.DIAMOND,
                3f, 75, "diamond");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_NETHERITE_ORE), RecipeCategory.MISC, Items.NETHERITE_INGOT,
                3f, 75, "netherite");

        offerSmelting(exporter, List.of(ModBlocks.VOID_COAL_ORE), RecipeCategory.MISC, ModItems.VOID_COAL,
                3f, 75, "void_coal");

        offerBlasting(exporter, List.of(ModItems.RAW_NETHERITE), RecipeCategory.MISC, Items.NETHERITE_INGOT,
                3f, 75, "netherite");

        offerSmelting(exporter, List.of(ModBlocks.DREADSTONE_THUNDERANIUM_ORE), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 75, "thunderanium");

        offerSmelting(exporter, List.of(ModBlocks.THUNDERANIUM_ORE), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 75, "thunderanium");

        offerSmelting(exporter, List.of(ModBlocks.CORRUPTINITE_ORE), RecipeCategory.MISC, ModItems.UNSTABLE_CORRUPTINITE,
                5f, 75, "corruptinite");

        offerSmelting(exporter, List.of(ModBlocks.RENDERIUM_ORE), RecipeCategory.MISC, ModItems.RENDERIUM,
                5f, 75, "renderium");

        offerSmelting(exporter, List.of(ModBlocks.DENDERIUM_ORE), RecipeCategory.MISC, ModItems.DENDERIUM,
                5f, 75, "denderium");


        offerBlasting(exporter, List.of(ModItems.RAW_THUNDERANIUM), RecipeCategory.MISC, ModItems.REFINED_THUNDERANIUM,
                5f, 75, "thunderanium");

        offerBlasting(exporter, List.of(ModItems.THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.THUNDERANIUM_INGOT,
                5f, 75, "thunderanium");

        offerBlasting(exporter, List.of(ModItems.RED_THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_INGOT,
                10f, 75, "red_thunderanium");

        offerBlasting(exporter, List.of(ModItems.DARK_THUNDERANIUM_CLUSTER), RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_INGOT,
                1000f, 100, "dark_thunderanium");

        offerBlasting(exporter, List.of(ModBlocks.MWDC_ORE), RecipeCategory.MISC, ModItems.MWDC,
                2000f, 250, "dimension_core");

        offerBlasting(exporter, List.of(ModBlocks.DCDC_ORE), RecipeCategory.MISC, ModItems.DCDC,
                2000f, 250, "dimension_core");

        offerBlasting(exporter, List.of(ModBlocks.TLDC_ORE), RecipeCategory.MISC, ModItems.TLDC,
                2000f, 250, "dimension_core");

        offerBlasting(exporter, List.of(ModBlocks.CLDC_ORE), RecipeCategory.MISC, ModItems.CLDC,
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
        createDoorRecipe(ModBlocks.REINFORCED_DREADSTONE_DOOR, Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_DOOR))
        .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_DOOR)));

        createTrapdoorRecipe(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR, Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR)));

        createStairsRecipe(ModBlocks.REINFORCED_DREADSTONE_STAIRS, Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_STAIRS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_STAIRS)));


        createSlabRecipe(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE_SLAB, Ingredient.ofItems(ModBlocks.REINFORCED_DREADSTONE_SLAB))
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_SLAB))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_SLAB)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE_WALL, 6)
                .pattern("# #")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModBlocks.REINFORCED_DREADSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_WALL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_WALL)));


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
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERANIUM_TNT)
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('T', Blocks.TNT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERANIUM_TNT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERANIUM_TNT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.RED_THUNDERANIUM_TNT)
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModBlocks.THUNDERANIUM_TNT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.RED_THUNDERANIUM_TNT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.RED_THUNDERANIUM_TNT)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.AXON_ALLOY_TNT)
                .pattern("###")
                .pattern("#T#")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModBlocks.RED_THUNDERANIUM_TNT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.AXON_ALLOY_TNT))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.AXON_ALLOY_TNT)));


        //Thundered Wood

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERED_WOOD)
                .pattern("##")
                .pattern("##")
                .input('#', ModBlocks.THUNDERED_LOG)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.THUNDERED_LOG),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERED_WOOD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERED_WOOD)));

       //IGNITERS
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.MIMICARIUM_IGNITER)
                .pattern(" F#")
                .pattern(" SF")
                .pattern("S  ")
                .input('#', ModItems.MIMICARIUM)
                .input('F', Items.FLINT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MIMICARIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.MIMICARIUM_IGNITER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.MIMICARIUM_IGNITER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DREADED_IGNITER)
                .pattern("FVF")
                .pattern("V#V")
                .pattern("FVF")
                .input('#', ModItems.MIMICARIUM_IGNITER)
                .input('V', ModBlocks.VOIDSTONE)
                .input('F', Items.FLINT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.VOIDSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DREADED_IGNITER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DREADED_IGNITER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_KEY)
                .pattern("RGR")
                .pattern("#I#")
                .pattern("RGR")
                .input('I', ModItems.DREADED_IGNITER)
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('G', Items.GOLD_INGOT)
                .input('R', Items.REDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_KEY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_KEY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTION_GATEWAY)
                .pattern("DRD")
                .pattern("#K#")
                .pattern("DRD")
                .input('K', ModItems.THUNDERANIUM_KEY)
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('D', ModBlocks.CORRUPTION_BLOCK)
                .input('R', ModItems.RED_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CORRUPTION_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTION_GATEWAY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTION_GATEWAY)));

        //PORTAL FRAMES
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                .pattern("I#I")
                .pattern("#C#")
                .pattern("I#I")
                .input('#', ModItems.MIMICARIUM)
                .input('I', Items.IRON_INGOT)
                .input('C', Items.COAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.MIMICARIUM),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.MIMIMCARIUM_PORTAL_FRAME))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.MIMIMCARIUM_PORTAL_FRAME)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.THUNDERANIUM_PORTAL_FRAME)
                .pattern("DVD")
                .pattern("#V#")
                .pattern("DVD")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('D', ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                .input('V', ModBlocks.VOIDSTONE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.THUNDERANIUM_PORTAL_FRAME))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.THUNDERANIUM_PORTAL_FRAME)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.CORRUPTION_PORTAL_FRAME)
                .pattern("DRD")
                .pattern("#F#")
                .pattern("DTD")
                .input('#', ModItems.RED_ESSENCE)
                .input('D', ModBlocks.CORRUPTION_BLOCK)
                .input('F', ModBlocks.THUNDERANIUM_PORTAL_FRAME)
                .input('T', ModItems.THUNDERANIUM_INGOT)
                .input('R', ModItems.RED_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.CORRUPTION_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.CORRUPTION_PORTAL_FRAME))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.CORRUPTION_PORTAL_FRAME)));

        //MISC
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_CLUSTER)
                .pattern("###")
                .pattern("TTT")
                .pattern("###")
                .input('#', ModItems.RED_ESSENCE)
                .input('T', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_ESSENCE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_CLUSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_CLUSTER)
                .pattern("###")
                .input('#', ModItems.REFINED_THUNDERANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.REFINED_THUNDERANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CLUSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_CLUSTER)
                .pattern(" ##")
                .pattern(" TT")
                .pattern(" ##")
                .input('#', ModItems.DARK_ESSENCE)
                .input('T', ModItems.RED_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_ESSENCE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_CLUSTER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_CLUSTER)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE)
                .pattern("###")
                .pattern("UUU")
                .pattern("###")
                .input('#', ModItems.DARK_ESSENCE)
                .input('U', ModItems.UNSTABLE_CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.UNSTABLE_CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE)));

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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.GX_BUCKET)
                .pattern("#D#")
                .pattern("#L#")
                .pattern("#R#")
                .input('#', ModItems.AXON_ALLOY)
                .input('L', ModItems.LIQUID_THUNDER_BUCKET)
                .input('D', ModItems.AXON_ALLOY_HELMET)
                .input('R', ModItems.AXON_ALLOY_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.LIQUID_THUNDER_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.GX_BUCKET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.GX_BUCKET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE)
                .pattern("###")
                .pattern("#G#")
                .pattern("###")
                .input('#', ModBlocks.DREADSTONE)
                .input('G', Items.GLOWSTONE_DUST)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.DREADSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.REINFORCED_DREADSTONE_GLASS)
                .pattern("G#G")
                .pattern("#G#")
                .pattern("G#G")
                .input('#', ModBlocks.REINFORCED_DREADSTONE)
                .input('G', Blocks.GLASS)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.REINFORCED_DREADSTONE),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.REINFORCED_DREADSTONE_GLASS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.REINFORCED_DREADSTONE_GLASS)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY)
                .pattern("RES")
                .pattern("THN")
                .pattern("CDM")
                .input('E', ModItems.DARK_ESSENCE)
                .input('C', ModItems.CORRUPTINITE)
                .input('D', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('R', ModItems.RED_ESSENCE)
                .input('M', ModItems.MIMICARIUM)
                .input('T', ModItems.THUNDERANIUM_INGOT)
                .input('H', ModItems.RED_THUNDERANIUM_INGOT)
                .input('N', Items.NETHERITE_INGOT)
                .input('S', ModItems.QUADRUPLE_COMPRESSED_STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY))
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAZZORIUM)
                .pattern("MAD")
                .pattern("GHG")
                .pattern("TAC")
                .input('M', ModItems.MWDC)
                .input('D', ModItems.DCDC)
                .input('T', ModItems.TLDC)
                .input('C', ModItems.CLDC)
                .input('H', ModItems.ULTIMATE_HOE_TROPHY)
                .input('G', ModItems.GX_BUCKET)
                .input('A', ModItems.AXON_ALLOY)
                .criterion(FabricRecipeProvider.hasItem(ModItems.GX_BUCKET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAZZORIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAZZORIUM)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAZZOR)
                .pattern("RRR")
                .pattern("RRR")
                .pattern("RSR")
                .input('R', ModItems.RAZZORIUM)
                .input('S', ModItems.QUATTUORDECUPLE_COMPRESSED_STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAZZORIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAZZOR))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAZZOR)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAZZORIUM_MINER)
                .pattern("RRR")
                .pattern("RSR")
                .pattern("RSR")
                .input('R', ModItems.RAZZORIUM)
                .input('S', ModItems.QUATTUORDECUPLE_COMPRESSED_STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAZZORIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RAZZORIUM_MINER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RAZZORIUM_MINER)));


        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TICKLE_TRAVIS_TICKLER)
                .input(ModItems.RAZZOR)
                .input(Items.FEATHER)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RAZZOR),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TICKLE_TRAVIS_TICKLER))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TICKLE_TRAVIS_TICKLER)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_ESSENCE, 12)
                .input(ModItems.RENDERIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RENDERIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_ESSENCE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_ESSENCE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_ESSENCE, 12)
                .input(ModItems.DENDERIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DENDERIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_ESSENCE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_ESSENCE)));

        //Fuels
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDER_FUEL, 2)
                .input(ModItems.THUNDERANIUM_INGOT)
                .input(ModBlocks.VOID_COAL_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDER_FUEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDER_FUEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModBlocks.VOID_COAL_BLOCK)
                .pattern("###")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.VOID_COAL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.VOID_COAL),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.VOID_COAL_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModBlocks.VOID_COAL_BLOCK)));

        //Compressed Sticks
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.COMPRESSED_STICK, Items.STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.DOUBLE_COMPRESSED_STICK, ModItems.COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.TRIPLE_COMPRESSED_STICK,  ModItems.DOUBLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.QUADRUPLE_COMPRESSED_STICK,  ModItems.TRIPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.QUINTUPLE_COMPRESSED_STICK,  ModItems.QUADRUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.SEXTUPLE_COMPRESSED_STICK,  ModItems.QUINTUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.SEPTUPLE_COMPRESSED_STICK,  ModItems.SEXTUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.OCTUPLE_COMPRESSED_STICK,  ModItems.SEPTUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.NONUPLE_COMPRESSED_STICK,  ModItems.OCTUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.DECUPLE_COMPRESSED_STICK,  ModItems.NONUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.UNDECUPLE_COMPRESSED_STICK,  ModItems.DECUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.DUODECUPLE_COMPRESSED_STICK,  ModItems.UNDECUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.TREDECUPLE_COMPRESSED_STICK,  ModItems.DUODECUPLE_COMPRESSED_STICK);
        offerCompactingRecipe(exporter, RecipeCategory.MISC, ModItems.QUATTUORDECUPLE_COMPRESSED_STICK,  ModItems.TREDECUPLE_COMPRESSED_STICK);

        //Armor

        //Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_BOOTS)));

        //Red Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_HELMET)
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_CHESTPLATE)
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_LEGGINGS)
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_BOOTS)
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('T', ModItems.THUNDERANIUM_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_BOOTS)));


        //Dark Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_HELMET)
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_CHESTPLATE)
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_LEGGINGS)
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_BOOTS)
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('T', ModItems.RED_THUNDERANIUM_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_BOOTS)));

        //Corruptinite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_HELMET)
                .pattern("###")
                .pattern("#T#")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_CHESTPLATE)
                .pattern("#T#")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_LEGGINGS)
                .pattern("###")
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_BOOTS)
                .pattern("#T#")
                .pattern("# #")
                .input('#', ModItems.CORRUPTINITE)
                .input('T', ModItems.RED_THUNDERANIUM_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_BOOTS)));

        //Axon Alloy G
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_HELMET)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_CHESTPLATE)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_LEGGINGS)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_BOOTS)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_BOOTS)));

        //Axon Alloy C
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_HELMET)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.CORRUPTINITE_HELMET)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.CORRUPTINITE_CHESTPLATE)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.CORRUPTINITE_LEGGINGS)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.CORRUPTINITE_BOOTS)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_BOOTS)));

        //Axon Alloy A
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_HELMET)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_HELMET)
                .input('M', ModItems.CORRUPTINITE_HELMET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_HELMET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_CHESTPLATE)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_CHESTPLATE)
                .input('M', ModItems.CORRUPTINITE_CHESTPLATE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_CHESTPLATE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_LEGGINGS)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_LEGGINGS)
                .input('M', ModItems.CORRUPTINITE_LEGGINGS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_LEGGINGS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_BOOTS)
                .pattern("###")
                .pattern("A#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('A', ModItems.DARK_THUNDERANIUM_BOOTS)
                .input('M', ModItems.CORRUPTINITE_BOOTS)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_BOOTS))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_BOOTS)));


        //Tools

        //MISC
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ANTIGLITCH_SWORD)
                .pattern("EEE")
                .pattern("E#E")
                .pattern("EEE")
                .input('#', ModItems.RED_THUNDERANIUM_SWORD)
                .input('E', ModItems.DARK_ESSENCE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_ESSENCE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ANTIGLITCH_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ANTIGLITCH_SWORD)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.VANILLA_HOE)
                .input(Items.GOLDEN_HOE)
                .input(Items.IRON_HOE)
                .input(Items.DIAMOND_HOE)
                .input(Items.WOODEN_HOE)
                .input(Items.STONE_HOE)
                .input(Items.NETHERITE_HOE)
                .criterion(FabricRecipeProvider.hasItem(Items.WOODEN_HOE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.VANILLA_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.VANILLA_HOE)));




        //Axon
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.ULTIMATE_HOE_TROPHY)
                .input(ModItems.VANILLA_HOE)
                .input(ModItems.THUNDERANIUM_HOE)
                .input(ModItems.RED_THUNDERANIUM_HOE)
                .input(ModItems.DARK_THUNDERANIUM_HOE)
                .input(ModItems.CORRUPTINITE_HOE)
                .input(ModItems.CORRUPTINITE_AXON_ALLOY_HOE)
                .input(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE)
                .input(ModItems.AXON_ALLOY_HOE)
                .criterion(FabricRecipeProvider.hasItem(Items.NETHERITE_HOE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.ULTIMATE_HOE_TROPHY))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.ULTIMATE_HOE_TROPHY)));


        //Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_PICKAXE)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_SHOVEL)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_AXE)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.THUNDERANIUM_HOE)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.THUNDERANIUM_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.THUNDERANIUM_HOE)));


        //Red Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_PICKAXE)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_SHOVEL)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_AXE)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RED_THUNDERANIUM_HOE)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.RED_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.RED_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.RED_THUNDERANIUM_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.RED_THUNDERANIUM_HOE)));



        //Dark Thunderanium
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_SWORD)
                .pattern("E#E")
                .pattern("E#E")
                .pattern("ESE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', ModItems.ANTIGLITCH_SWORD)
                .input('E', ModItems.DARK_ESSENCE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_PICKAXE)
                .pattern("###")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_PICKAXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_SHOVEL)
                .pattern("E#E")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_SHOVEL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXE)
                .pattern("##E")
                .pattern("#SE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_AXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_HOE)
                .pattern("##E")
                .pattern("ESE")
                .pattern("EBE")
                .input('#', ModItems.DARK_THUNDERANIUM_INGOT)
                .input('S', Items.STICK)
                .input('E', ModItems.DARK_ESSENCE)
                .input('B', ModItems.RED_THUNDERANIUM_HOE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.DARK_THUNDERANIUM_INGOT),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_HOE)));


        //Corruptinite
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_SWORD)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', ModItems.ANTIGLITCH_SWORD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_PICKAXE)
                .pattern("###")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_SHOVEL)
                .pattern(" # ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXE)
                .pattern("## ")
                .pattern("#S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_HOE)
                .pattern("## ")
                .pattern(" S ")
                .pattern(" S ")
                .input('#', ModItems.CORRUPTINITE)
                .input('S', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.CORRUPTINITE),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_HOE)));

        //Axon Alloy G
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.DARK_THUNDERANIUM_SWORD)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.DARK_THUNDERANIUM_AXE)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.DARK_THUNDERANIUM_PICKAXE)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.DARK_THUNDERANIUM_SHOVEL)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.DARK_THUNDERANIUM_HOE)
                .input('M', ModItems.DARK_THUNDERANIUM_INGOT)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.DARK_THUNDERANIUM_AXON_ALLOY_HOE)));

        //Axon Alloy C
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_SWORD)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_SWORD)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_AXE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_AXE)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_PICKAXE)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_SHOVEL)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.CORRUPTINITE_AXON_ALLOY_HOE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_HOE)
                .input('M', ModItems.CORRUPTINITE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.CORRUPTINITE_AXON_ALLOY_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.CORRUPTINITE_AXON_ALLOY_HOE)));

        //Axon Alloy A
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_SWORD)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_SWORD)
                .input('M', ModItems.DARK_THUNDERANIUM_SWORD)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_SWORD))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_AXE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_AXE)
                .input('M', ModItems.DARK_THUNDERANIUM_AXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_AXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_PICKAXE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_PICKAXE)
                .input('M', ModItems.DARK_THUNDERANIUM_PICKAXE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_PICKAXE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_SHOVEL)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_SHOVEL)
                .input('M', ModItems.DARK_THUNDERANIUM_SHOVEL)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_SHOVEL))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.AXON_ALLOY_HOE)
                .pattern("###")
                .pattern("T#M")
                .pattern("###")
                .input('#', ModItems.AXON_ALLOY)
                .input('T', ModItems.CORRUPTINITE_HOE)
                .input('M', ModItems.DARK_THUNDERANIUM_HOE)
                .criterion(FabricRecipeProvider.hasItem(ModItems.AXON_ALLOY),
                        FabricRecipeProvider.conditionsFromItem(ModItems.AXON_ALLOY_HOE))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.AXON_ALLOY_HOE)));



    }
}
