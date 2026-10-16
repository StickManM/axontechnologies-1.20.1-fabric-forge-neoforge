package net.stickmanm.axontechnologies.item.client;

import net.stickmanm.axontechnologies.item.custom.CorruptiniteArmorItem;
import net.stickmanm.axontechnologies.item.custom.CorruptiniteAxonAlloyArmorItem;
import software.bernie.geckolib.renderer.GeoArmorRenderer;

public class CorruptiniteAxonAlloyArmorRenderer extends GeoArmorRenderer<CorruptiniteAxonAlloyArmorItem> {
    public CorruptiniteAxonAlloyArmorRenderer() {
        super(new CorruptiniteAxonAlloyArmorModel());
    }
}
