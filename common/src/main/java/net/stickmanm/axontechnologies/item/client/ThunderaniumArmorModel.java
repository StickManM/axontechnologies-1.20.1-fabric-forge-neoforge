package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.item.custom.ThunderaniumArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class ThunderaniumArmorModel extends GeoModel<ThunderaniumArmorItem>{
    @Override
    public Identifier getModelResource(ThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "geo/thunderanium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(ThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/armor/thunderanium_armor.png");
    }

    @Override
    public Identifier getAnimationResource(ThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "animations/armor_test.animation.json");
    }
}
