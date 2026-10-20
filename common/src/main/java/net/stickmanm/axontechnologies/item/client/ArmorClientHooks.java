package net.stickmanm.axontechnologies.item.client;

import dev.architectury.injectables.annotations.ExpectPlatform;

import java.util.function.Supplier;

/**
 * Platform bridge for GeckoLib armor rendering.
 * Forge builds an IClientItemExtensions around the renderer, Fabric returns null (it uses GeoItem#createRenderer instead).
 */
public class ArmorClientHooks {
    /** @param rendererFactory creates the GeoArmorRenderer for the armor item */
    @ExpectPlatform
    public static Object createClientExtensions(Supplier<Object> rendererFactory) {
        throw new AssertionError();
    }
}
