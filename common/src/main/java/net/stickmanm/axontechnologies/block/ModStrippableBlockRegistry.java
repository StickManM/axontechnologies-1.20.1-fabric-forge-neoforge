package net.stickmanm.axontechnologies.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks(){
        StrippableBlockRegistry.register(ModBlocks.THUNDERED_LOG, ModBlocks.STRIPPED_THUNDERED_LOG);
        StrippableBlockRegistry.register(ModBlocks.THUNDERED_WOOD, ModBlocks.STRIPPED_THUNDERED_WOOD);
    }
}
//comment 3