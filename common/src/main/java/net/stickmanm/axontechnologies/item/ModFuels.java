package net.stickmanm.axontechnologies.item;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModFuels {
    public static void registerModFuels(){
        FuelRegistry.INSTANCE.add(ModItems.THUNDER_FUEL, 34560000);
        FuelRegistry.INSTANCE.add(ModItems.VOID_COAL, 1728000);
        FuelRegistry.INSTANCE.add(ModBlocks.VOID_COAL_BLOCK, 17280000);

    }
}
