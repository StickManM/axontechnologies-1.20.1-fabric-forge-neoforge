package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.CorruptiniteArmorItem;
import net.stickmanm.axontechnologies.item.custom.RedThunderaniumArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CorruptiniteArmorRenderer extends GeoArmorRenderer<CorruptiniteArmorItem> {
    public CorruptiniteArmorRenderer() {
        super(new CorruptiniteArmorModel());
    }
}
