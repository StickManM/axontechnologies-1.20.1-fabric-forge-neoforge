package net.stickmanm.forge;

import dev.architectury.platform.forge.EventBuses;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.util.ModPotions;

@Mod(AxonTechnologies.MOD_ID)
public final class AxonTechnologiesForge {
    public AxonTechnologiesForge() {
        // Submit our event bus to let Architectury API register our content on the right time.
        EventBuses.registerModEventBus(AxonTechnologies.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());

        // Register Architectury deferred registers
        ModBlocks.BLOCKS.register();
        ModEntities.ENTITIES.register();
        ModFluids.FLUIDS.register();
        ModFluids.FLUID_BLOCKS.register();
        ModItems.ITEMS.register();
        ModEffects.EFFECTS.register();
        ModPotions.POTIONS.register();

        // Run our common setup.
        AxonTechnologies.init();
    }
}
