package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.item.custom.RedThunderaniumArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class RedThunderaniumArmorModel extends GeoModel<RedThunderaniumArmorItem>{
    @Override
    public Identifier getModelResource(RedThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "geo/thunderanium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(RedThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/armor/red_thunderanium_armor.png");
    }

    @Override
    public Identifier getAnimationResource(RedThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "animations/armor_test.animation.json");
    }
}
