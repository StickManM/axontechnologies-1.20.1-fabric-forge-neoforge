package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.item.custom.DarkThunderaniumAxonAlloyArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class DarkThunderaniumAxonAlloyArmorModel extends GeoModel<DarkThunderaniumAxonAlloyArmorItem>{
    @Override
    public Identifier getModelResource(DarkThunderaniumAxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "geo/thunderanium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(DarkThunderaniumAxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/armor/axon_alloy_armor.png");
    }

    @Override
    public Identifier getAnimationResource(DarkThunderaniumAxonAlloyArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "animations/armor_test.animation.json");
    }
}
