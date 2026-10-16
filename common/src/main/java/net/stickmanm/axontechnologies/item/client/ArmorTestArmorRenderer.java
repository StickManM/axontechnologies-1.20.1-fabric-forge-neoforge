package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.ArmorTestArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class ArmorTestArmorRenderer extends GeoArmorRenderer<ArmorTestArmorItem> {
    public ArmorTestArmorRenderer() {
        super(new ArmorTestArmorModel());
    }
}
