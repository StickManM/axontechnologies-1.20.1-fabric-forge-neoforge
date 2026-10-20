package net.stickmanm.axontechnologies.item.client.fabric;

import java.util.function.Supplier;

public class ArmorClientHooksImpl {
    public static Object createClientExtensions(Supplier<Object> rendererFactory) {
        return null; // Fabric GeckoLib renders armor through GeoItem#createRenderer
    }
}
