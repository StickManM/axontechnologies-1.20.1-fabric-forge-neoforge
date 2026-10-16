package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.stickmanm.axontechnologies.entity.custom.DarkEssenceZombieEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class DarkEssenceZombieModel extends GeoModel<DarkEssenceZombieEntity> {
    @Override
    public Identifier getModelResource(DarkEssenceZombieEntity animatable) {
        return new Identifier(AxonTechnologies.MOD_ID,"geo/dark_essence_zombie.geo.json");
    }

    @Override
    public Identifier getTextureResource(DarkEssenceZombieEntity animatable) {
        return new Identifier(AxonTechnologies.MOD_ID,"textures/entity/dark_essence_zombie.png");    }

    @Override
    public Identifier getAnimationResource(DarkEssenceZombieEntity animatable) {
        return new Identifier(AxonTechnologies.MOD_ID,"animations/red_essence_zombie.animation.json");
    }
    @Override
    public void setCustomAnimations(DarkEssenceZombieEntity animatable, long instanceId, AnimationState<DarkEssenceZombieEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
