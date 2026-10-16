package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.RedThunderaniumArmorItem;
import net.stickmanm.axontechnologies.item.custom.ThunderaniumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class RedThunderaniumArmorRenderer extends GeoArmorRenderer<RedThunderaniumArmorItem> {
    public RedThunderaniumArmorRenderer() {
        super(new RedThunderaniumArmorModel());
    }
}
