package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.entity.custom.RedEssenceZombieEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class RedEssenceZombieRenderer extends GeoEntityRenderer<RedEssenceZombieEntity> {
    public RedEssenceZombieRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new RedEssenceZombieModel());
    }

    @Override
    public Identifier getTextureLocation(RedEssenceZombieEntity animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/entity/red_essence_zombie.png");
    }

    @Override
    public void render(RedEssenceZombieEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
