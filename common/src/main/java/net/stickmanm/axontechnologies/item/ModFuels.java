package net.stickmanm.axontechnologies.item;



import dev.architectury.event.events.common.LifecycleEvent;
import dev.architectury.registry.fuel.FuelRegistry;
import net.stickmanm.axontechnologies.block.ModBlocks;

public class ModFuels {
    public static void registerModFuels() {
        // Items/blocks only exist once the registries are filled, so wait for the setup phase.
        LifecycleEvent.SETUP.register(ModFuels::registerFuels);
    }

    private static void registerFuels() {
        FuelRegistry.register(34560000, ModItems.THUNDER_FUEL.get());
        FuelRegistry.register(1728000, ModItems.VOID_COAL.get());
        FuelRegistry.register(17280000, ModBlocks.VOID_COAL_BLOCK.get());

    }
}
