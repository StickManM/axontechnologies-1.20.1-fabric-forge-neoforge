package net.stickmanm.axontechnologies.world.portal;

import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.world.World;

import java.util.function.Supplier;

/** One custom portal: which frame block + igniter item opens a portal to which dimension. */
public class PortalDef {
    public final String name;
    public final Supplier<Block> frame;
    public final RegistryKey<World> destination;
    public final int tint;
    public final Supplier<Item> igniter;
    /** Flat portals lie horizontally (like a trapdoor) instead of standing up. */
    public final boolean flat;
    public RegistrySupplier<Block> portalBlock;

    public PortalDef(String name, Supplier<Block> frame, RegistryKey<World> destination, int tint, Supplier<Item> igniter, boolean flat) {
        this.name = name;
        this.frame = frame;
        this.destination = destination;
        this.tint = tint;
        this.igniter = igniter;
        this.flat = flat;
    }
}
