package net.stickmanm.axontechnologies.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.stickmanm.axontechnologies.world.ModPlacedFeatures;
import net.stickmanm.axontechnologies.world.biome.ModBiomes;

public class ModOreGeneration {
    public static void generateOres() {
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.MIMICARIUM_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MIMIC_PLAINS_KEY,
                        ModBiomes.MIMIC_FOREST_KEY, ModBiomes.MIMIC_DESERT_KEY, ModBiomes.MIMIC_SWAMP_KEY, ModBiomes.MIMIC_TAIGA_KEY, ModBiomes.MIMIC_SNOWY_TAIGA_KEY, ModBiomes.MIMIC_BAMBOO_JUNGLE_KEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FAKESTONES_IRON_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MIMIC_PLAINS_KEY,
                        ModBiomes.MIMIC_FOREST_KEY, ModBiomes.MIMIC_DESERT_KEY, ModBiomes.MIMIC_SWAMP_KEY, ModBiomes.MIMIC_TAIGA_KEY, ModBiomes.MIMIC_SNOWY_TAIGA_KEY, ModBiomes.MIMIC_BAMBOO_JUNGLE_KEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.FAKESTONES_GOLD_ORE_PLACED_KEY);

        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.MIMIC_PLAINS_KEY,
                        ModBiomes.MIMIC_FOREST_KEY, ModBiomes.MIMIC_DESERT_KEY, ModBiomes.MIMIC_SWAMP_KEY, ModBiomes.MIMIC_TAIGA_KEY, ModBiomes.MIMIC_SNOWY_TAIGA_KEY, ModBiomes.MIMIC_BAMBOO_JUNGLE_KEY),
                GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.VOIDSTONE_ORE_PLACED_KEY);

        //Dreadstone Ores
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.DREAD_WASTES_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DREADSTONE_DIAMOND_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.DREAD_WASTES_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DREADSTONE_NETHERITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.DREAD_WASTES_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DREADSTONE_THUNDERANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.DREAD_WASTES_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.VOID_COAL_ORE_PLACED_KEY);

        //Thunderlands
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.THUNDERED_PLAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.RENDERIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.THUNDERED_PLAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_LIQUID_THUNDER_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.THUNDERED_PLAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.THUNDERANIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.THUNDERED_PLAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CORRUPTION_BLOCK_ORE_PLACED_KEY);

        //Corruptionlads
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CORRUPTED_PLAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DENDERIUM_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CORRUPTED_PLAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.CORRUPTINITE_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.CORRUPTED_PLAINS_KEY), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.ORE_LIQUID_CORRUPTION_PLACED_KEY);


        //Dimension Core
        BiomeModifications.addFeature(BiomeSelectors.all(), GenerationStep.Feature.UNDERGROUND_ORES, ModPlacedFeatures.DIMENSION_CORE_PLACED_KEY);

    }
}