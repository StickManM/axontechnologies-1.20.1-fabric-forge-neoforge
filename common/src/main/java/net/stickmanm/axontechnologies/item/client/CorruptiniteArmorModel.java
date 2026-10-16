package net.stickmanm.axontechnologies.item.client;

import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.item.custom.CorruptiniteArmorItem;
import software.bernie.geckolib.model.GeoModel;

public class CorruptiniteArmorModel extends GeoModel<CorruptiniteArmorItem>{
    @Override
    public Identifier getModelResource(CorruptiniteArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "geo/thunderanium_armor.geo.json");
    }

    @Override
    public Identifier getTextureResource(CorruptiniteArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "textures/armor/corruptinite_armor.png");
    }

    @Override
    public Identifier getAnimationResource(CorruptiniteArmorItem animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "animations/armor_test.animation.json");
    }
}
