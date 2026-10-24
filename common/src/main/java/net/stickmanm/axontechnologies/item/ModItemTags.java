package net.stickmanm.axontechnologies.item;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;

import static net.minecraft.registry.tag.TagEntry.create;
import static net.minecraft.registry.tag.TagEntry.createTag;

public class ModItemTags {
    public static final TagKey<Item> THUNDERED_PLANKS_CONVERTIBLE = TagKey.of(RegistryKeys.ITEM, new Identifier(AxonTechnologiesConstants.MOD_ID, "thundered_planks_convertible"));
    public static final TagKey<Item> CORRUPTED_PLANKS_CONVERTIBLE = TagKey.of(RegistryKeys.ITEM, new Identifier(AxonTechnologiesConstants.MOD_ID, "corrupted_planks_convertible"));
}
