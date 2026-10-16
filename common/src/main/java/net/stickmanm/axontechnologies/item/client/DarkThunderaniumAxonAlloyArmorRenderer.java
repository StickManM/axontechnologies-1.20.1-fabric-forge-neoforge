package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.DarkThunderaniumArmorItem;
import net.stickmanm.axontechnologies.item.custom.DarkThunderaniumAxonAlloyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class DarkThunderaniumAxonAlloyArmorRenderer extends GeoArmorRenderer<DarkThunderaniumAxonAlloyArmorItem> {
    public DarkThunderaniumAxonAlloyArmorRenderer() {
        super(new DarkThunderaniumAxonAlloyArmorModel());
    }
}
