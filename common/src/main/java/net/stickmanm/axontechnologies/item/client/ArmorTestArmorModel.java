package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.item.custom.ArmorTestArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class ArmorTestArmorModel extends GeoModel<ArmorTestArmorItem>{
    @Override
    public Identifier getModelResource(ArmorTestArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "geo/armor_test.geo.json");
    }

    @Override
    public Identifier getTextureResource(ArmorTestArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/armor/armor_test.png");
    }

    @Override
    public Identifier getAnimationResource(ArmorTestArmorItem animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "animations/armor_test.animation.json");
    }
}
