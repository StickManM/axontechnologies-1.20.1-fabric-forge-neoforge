package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.item.custom.DarkThunderaniumArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class DarkThunderaniumArmorModel extends GeoModel<DarkThunderaniumArmorItem>{
    @Override
    public Identifier getModelResource(DarkThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "geo/thunderanium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(DarkThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "textures/armor/dark_thunderanium_armor.png");
    }

    @Override
    public Identifier getAnimationResource(DarkThunderaniumArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "animations/armor_test.animation.json");
    }
}
