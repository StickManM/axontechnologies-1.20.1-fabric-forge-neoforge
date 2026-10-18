package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.item.custom.AxonAlloyArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class AxonAlloyArmorModel extends GeoModel<AxonAlloyArmorItem>{
    @Override
    public Identifier getModelResource(AxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "geo/thunderanium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(AxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/armor/axon_alloy_armor.png");
    }

    @Override
    public Identifier getAnimationResource(AxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "animations/armor_test.animation.json");
    }
}
