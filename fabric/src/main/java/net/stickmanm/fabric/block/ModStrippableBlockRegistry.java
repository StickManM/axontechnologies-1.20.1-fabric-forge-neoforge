package net.stickmanm.fabric.block;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModStrippableBlockRegistry {
    public static void registerStrippableBlocks(){
        StrippableBlockRegistry.register(ModBlocks.THUNDERED_LOG.get(), ModBlocks.STRIPPED_THUNDERED_LOG.get());
        StrippableBlockRegistry.register(ModBlocks.THUNDERED_WOOD.get(), ModBlocks.STRIPPED_THUNDERED_WOOD.get());
    }
}
