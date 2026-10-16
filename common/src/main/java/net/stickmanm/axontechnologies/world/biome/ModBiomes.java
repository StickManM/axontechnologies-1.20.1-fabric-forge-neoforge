package net.stickmanm.axontechnologies.world.biome;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;

public class ModBiomes {

    public static final RegistryKey<Biome> THUNDERED_PLAINS_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","thundered_plains"));
    public static final RegistryKey<Biome> CORRUPTED_PLAINS_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","corrupted_plains"));
    public static final RegistryKey<Biome> DREAD_WASTES_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","dread_wastes"));
    public static final RegistryKey<Biome> MIMIC_PLAINS_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","mimic_plains"));
    public static final RegistryKey<Biome> MIMIC_DESERT_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","mimic_desert"));
    public static final RegistryKey<Biome> MIMIC_BAMBOO_JUNGLE_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","mimic_bamboo_jungle"));
    public static final RegistryKey<Biome> MIMIC_FOREST_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","mimic_forest"));
    public static final RegistryKey<Biome> MIMIC_TAIGA_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","mimic_taiga"));
    public static final RegistryKey<Biome> MIMIC_SWAMP_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","mimic_swamp"));
    public static final RegistryKey<Biome> MIMIC_SNOWY_TAIGA_KEY = RegistryKey.of(RegistryKeys.BIOME, new Identifier("axontechnologies","mimic_snowy_taiga"));


    public static void registerModBiomes(){
        AxonTechnologies.LOGGER.info("Registering Mod Biomes for " + AxonTechnologies.MOD_ID);

    }
}
