package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.AxonAlloyArmorItem;
import net.stickmanm.axontechnologies.item.custom.DarkThunderaniumAxonAlloyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class AxonAlloyArmorRenderer extends GeoArmorRenderer<AxonAlloyArmorItem> {
    public AxonAlloyArmorRenderer() {
        super(new AxonAlloyArmorModel());
    }
}
