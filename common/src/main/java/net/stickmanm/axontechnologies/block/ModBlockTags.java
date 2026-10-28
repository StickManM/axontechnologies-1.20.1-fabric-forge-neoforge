package net.stickmanm.axontechnologies.block;

//import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;

public class ModBlockTags {
    //Mimicarium Ore Replaceables
    public static final TagKey<Block> MIMICARIUM_REPLACEABLE_STONE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "mimicarium_replaceable"));
    public static final TagKey<Block> MIMICARIUM_REPLACEABLE_DEEPSLATE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "mimicarium_replaceable_deepslate"));
    public static final TagKey<Block> FAKESLATE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "fakeslate_replaceable"));
    public static final TagKey<Block> FAKESTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "fakestone_replaceable"));

    //MISC
    public static final TagKey<Block> DREADSTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "dreadstone_replaceable"));
    public static final TagKey<Block> THUNDERED_STONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "thundered_stone_replaceable"));
    public static final TagKey<Block> CORRUPTED_STONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "corrupted_stone_replaceable"));
    public static final TagKey<Block> VOIDSTONE_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "voidstone_replaceable"));

    public static final TagKey<Block> REINFORCED_DREADSTONE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "reinforced_dreadstone"));

    public static final TagKey<Block> CORRUPTION_REPLACEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "corruption_replaceable"));
    public static final TagKey<Block> CORRUPTION = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "corruption"));

    public static final TagKey<Block> THUNDERED_PLANKS_CONVERTIBLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "thundered_planks_convertible"));
    public static final TagKey<Block> CORRUPTED_PLANKS_CONVERTIBLE = TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "corrupted_planks_convertible"));





    public static void registerModTags() {
        AxonTechnologies.LOGGER.info("Registering ModTags for " + AxonTechnologiesConstants.MOD_ID);
    }
}
