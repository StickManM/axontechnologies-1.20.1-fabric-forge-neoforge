package net.stickmanm.axontechnologies.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;

public class ModTags {

    public static class Blocks{


        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, name));
        }
    }

    public static class Items {

        public static final TagKey<Item> TRIMS = createTag("trims");
        public static final TagKey<Item> MIMIC_WORLD_INGITERS = createTag("lights_mimic_world_portal");
        public static final TagKey<Item> DREAD_CAVERNS_INGITERS = createTag("lights_dread_caverns_portal");
        public static final TagKey<Item> THUNDERLANDS_INGITERS = createTag("lights_thunderlands_portal");

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(AxonTechnologiesConstants.MOD_ID, name));

        }
    }

    }




