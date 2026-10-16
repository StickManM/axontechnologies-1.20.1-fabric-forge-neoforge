package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.DarkThunderaniumArmorItem;
import net.stickmanm.axontechnologies.item.custom.RedThunderaniumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DarkThunderaniumArmorRenderer extends GeoArmorRenderer<DarkThunderaniumArmorItem> {
    public DarkThunderaniumArmorRenderer() {
        super(new DarkThunderaniumArmorModel());
    }
}
