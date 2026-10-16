package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.stickmanm.axontechnologies.entity.custom.LostMinerEntity;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.model.data.EntityModelData;

public class LostMinerModel extends GeoModel<LostMinerEntity> {
    @Override
    public Identifier getModelResource(LostMinerEntity animatable) {
        return new Identifier(AxonTechnologies.MOD_ID,"geo/lost_miner.geo.json");
    }

    @Override
    public Identifier getTextureResource(LostMinerEntity animatable) {
        return new Identifier(AxonTechnologies.MOD_ID,"textures/entity/lost_miner.png");    }

    @Override
    public Identifier getAnimationResource(LostMinerEntity animatable) {
        return new Identifier(AxonTechnologies.MOD_ID,"animations/lost_miner.animation.json");
    }
    @Override
    public void setCustomAnimations(LostMinerEntity animatable, long instanceId, AnimationState<LostMinerEntity> animationState) {
        CoreGeoBone head = getAnimationProcessor().getBone("head");

        if (head != null) {
            EntityModelData entityData = animationState.getData(DataTickets.ENTITY_MODEL_DATA);
            head.setRotX(entityData.headPitch() * MathHelper.RADIANS_PER_DEGREE);
            head.setRotY(entityData.netHeadYaw() * MathHelper.RADIANS_PER_DEGREE);
        }
    }
}
