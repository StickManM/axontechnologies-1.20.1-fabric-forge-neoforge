package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.ThunderaniumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ThunderaniumArmorRenderer extends GeoArmorRenderer<ThunderaniumArmorItem> {
    public ThunderaniumArmorRenderer() {
        super(new ThunderaniumArmorModel());
    }
}
