package net.stickmanm.axontechnologies.world;

import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.fluid.ModFluids;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> THUNDERED_SAPLING_KEY = registerKey("thundered_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CORRUPTED_SAPLING_KEY = registerKey("corrupted_tree");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MIMICARIUM_ORE_KEY = registerKey("mimicarium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FAKESTONES_IRON_ORE_KEY = registerKey("fakestones_iron_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> FAKESTONES_GOLD_ORE_KEY = registerKey("fakestones_gold_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VOIDSTONE_ORE_KEY = registerKey("voidstone");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADSTONE_DIAMOND_ORE_KEY = registerKey("dreadstone_diamond_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADSTONE_THUNDERANIUM_ORE_KEY = registerKey("dreadstone_thunderanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DREADSTONE_NETHERITE_ORE_KEY = registerKey("dreadstone_netherite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> VOID_COAL_ORE_KEY = registerKey("void_coal_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DIMENSION_CORE_ORE_KEY = registerKey("dimension_core_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> RENDERIUM_ORE_KEY = registerKey("renderium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> THUNDERANIUM_ORE_KEY = registerKey("thunderanium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DENDERIUM_ORE_KEY = registerKey("denderium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CORRUPTINITE_ORE_KEY = registerKey("corruptinite_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CORRUPTION_BLOCK_ORE_KEY = registerKey("corruption_block_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_LIQUID_THUNDER_KEY = registerKey("ore_liquid_thunder");
    public static final RegistryKey<ConfiguredFeature<?, ?>> ORE_LIQUID_CORRUPTION_KEY = registerKey("ore_liquid_corruption");


    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        //Mimicarium Ore
        RuleTest mimicariumStoneReplaceables = new TagMatchRuleTest(ModBlockTags.MIMICARIUM_REPLACEABLE_STONE);
        RuleTest mimicariumDeepslateReplaceables = new TagMatchRuleTest(ModBlockTags.MIMICARIUM_REPLACEABLE_DEEPSLATE);
        RuleTest fakeslate = new TagMatchRuleTest(ModBlockTags.FAKESLATE_REPLACEABLE);
        RuleTest fakestone = new TagMatchRuleTest(ModBlockTags.FAKESTONE_REPLACEABLE);
        RuleTest dreadCaverns = new TagMatchRuleTest(ModBlockTags.DREADSTONE_REPLACEABLE);
        RuleTest thunderlands = new TagMatchRuleTest(ModBlockTags.THUNDERED_STONE_REPLACEABLE);
        RuleTest corruptionlands = new TagMatchRuleTest(ModBlockTags.CORRUPTED_STONE_REPLACEABLE);
        RuleTest voidstoneReplaceable = new TagMatchRuleTest(ModBlockTags.VOIDSTONE_REPLACEABLE);

        List<OreFeatureConfig.Target> overworldMimicariumOres =
                List.of(OreFeatureConfig.createTarget(mimicariumStoneReplaceables, ModBlocks.MIMICARIUM_ORE.get().getDefaultState()),
                       OreFeatureConfig.createTarget(mimicariumDeepslateReplaceables, ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get().getDefaultState()));

        //Mimic World
        List<OreFeatureConfig.Target> fakestonesIronOre = List.of(OreFeatureConfig.createTarget(fakestone, ModBlocks.FAKESTONE_IRON_ORE.get().getDefaultState()),
                OreFeatureConfig.createTarget(fakeslate, ModBlocks.FAKESLATE_IRON_ORE.get().getDefaultState()));

        List<OreFeatureConfig.Target> fakestonesGoldOre = List.of(OreFeatureConfig.createTarget(fakestone, ModBlocks.FAKESTONE_GOLD_ORE.get().getDefaultState()),
                OreFeatureConfig.createTarget(fakeslate, ModBlocks.FAKESLATE_GOLD_ORE.get().getDefaultState()));

        List<OreFeatureConfig.Target> voidstoneOre = List.of(OreFeatureConfig.createTarget(voidstoneReplaceable, ModBlocks.VOIDSTONE.get().getDefaultState()));





        //Dimension Cores
        List<OreFeatureConfig.Target> dimensionCoreOres =
                List.of(OreFeatureConfig.createTarget(fakeslate, ModBlocks.MWDC_ORE.get().getDefaultState()),
                        OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DCDC_ORE.get().getDefaultState()),
                        OreFeatureConfig.createTarget(thunderlands, ModBlocks.TLDC_ORE.get().getDefaultState()),
                        OreFeatureConfig.createTarget(corruptionlands, ModBlocks.CLDC_ORE.get().getDefaultState()));

        //Dreadstone Ores
        List<OreFeatureConfig.Target> dreadstoneDiamondOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DREADSTONE_DIAMOND_ORE.get().getDefaultState()));
        List<OreFeatureConfig.Target> dreadstoneThunderaniumOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get().getDefaultState()));
        List<OreFeatureConfig.Target> dreadstoneNetheriteOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.DREADSTONE_NETHERITE_ORE.get().getDefaultState()));
        List<OreFeatureConfig.Target> voidCoalOres = List.of(OreFeatureConfig.createTarget(dreadCaverns, ModBlocks.VOID_COAL_ORE.get().getDefaultState()));

        //Thunderlands
        List<OreFeatureConfig.Target> renderiumOres = List.of(OreFeatureConfig.createTarget(thunderlands, ModBlocks.RENDERIUM_ORE.get().getDefaultState()));
        List<OreFeatureConfig.Target> thunderaniumOres = List.of(OreFeatureConfig.createTarget(thunderlands, ModBlocks.THUNDERANIUM_ORE.get().getDefaultState()));
        List<OreFeatureConfig.Target> corruptionBlockOres = List.of(OreFeatureConfig.createTarget(thunderlands, ModBlocks.CORRUPTION_BLOCK.get().getDefaultState()));
        List<OreFeatureConfig.Target> oreLiquidThunder = List.of(OreFeatureConfig.createTarget(thunderlands, ModFluids.LIQUID_THUNDER_BLOCK.get().getDefaultState()));

        //Corruptionlands
        List<OreFeatureConfig.Target> denderiumOres = List.of(OreFeatureConfig.createTarget(corruptionlands, ModBlocks.DENDERIUM_ORE.get().getDefaultState()));
        List<OreFeatureConfig.Target> corruptiniteOres = List.of(OreFeatureConfig.createTarget(corruptionlands, ModBlocks.CORRUPTINITE_ORE.get().getDefaultState()));
        List<OreFeatureConfig.Target> oreLiquidCorruption = List.of(OreFeatureConfig.createTarget(corruptionlands, ModFluids.LIQUID_CORRUPTION_BLOCK.get().getDefaultState()));








        //Thundered Tree
        register(context, THUNDERED_SAPLING_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.THUNDERED_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(ModBlocks.THUNDERED_LEAVES.get()),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        register(context, CORRUPTED_SAPLING_KEY, Feature.TREE, new TreeFeatureConfig.Builder(
                BlockStateProvider.of(ModBlocks.CORRUPTED_LOG.get()),
                new StraightTrunkPlacer(5, 6, 3),
                BlockStateProvider.of(Blocks.AIR),
                new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                new TwoLayersFeatureSize(1, 0, 2)).build());

        //register ores
        register(context, MIMICARIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldMimicariumOres, 10));
        register(context, DIMENSION_CORE_ORE_KEY, Feature.ORE, new OreFeatureConfig(dimensionCoreOres, 3));
        register(context, FAKESTONES_IRON_ORE_KEY, Feature.ORE, new OreFeatureConfig(fakestonesIronOre, 14));
        register(context, FAKESTONES_GOLD_ORE_KEY, Feature.ORE, new OreFeatureConfig(fakestonesGoldOre, 10));
        register(context, VOIDSTONE_ORE_KEY, Feature.ORE, new OreFeatureConfig(voidstoneOre, 11));
        register(context, RENDERIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(renderiumOres, 4));
        register(context, THUNDERANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(thunderaniumOres, 10));
        register(context, CORRUPTION_BLOCK_ORE_KEY, Feature.ORE, new OreFeatureConfig(corruptionBlockOres, 12));
        register(context, DENDERIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(denderiumOres, 4));
        register(context, CORRUPTINITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(corruptiniteOres, 5));
        register(context, ORE_LIQUID_THUNDER_KEY, Feature.ORE, new OreFeatureConfig(oreLiquidThunder, 7));
        register(context, ORE_LIQUID_CORRUPTION_KEY, Feature.ORE, new OreFeatureConfig(oreLiquidCorruption, 7));


        //Dreadstone Ores
        register(context, DREADSTONE_DIAMOND_ORE_KEY, Feature.ORE, new OreFeatureConfig(dreadstoneDiamondOres, 8));
        register(context, DREADSTONE_NETHERITE_ORE_KEY, Feature.ORE, new OreFeatureConfig(dreadstoneNetheriteOres, 4));
        register(context, DREADSTONE_THUNDERANIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(dreadstoneThunderaniumOres, 4));
        register(context, VOID_COAL_ORE_KEY, Feature.ORE, new OreFeatureConfig(voidCoalOres, 10));

    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(AxonTechnologiesConstants.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
