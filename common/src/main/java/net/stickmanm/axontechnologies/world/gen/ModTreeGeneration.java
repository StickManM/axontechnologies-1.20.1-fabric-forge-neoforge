package net.stickmanm.axontechnologies.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.stickmanm.axontechnologies.world.ModPlacedFeatures;
import net.stickmanm.axontechnologies.world.biome.ModBiomes;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(ModBiomes.THUNDERED_PLAINS_KEY),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.THUNDERED_TREE_PLACED_KEY);
    }
}
