package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.entity.custom.LostMinerEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class LostMinerRenderer extends GeoEntityRenderer<LostMinerEntity> {
    public LostMinerRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new LostMinerModel());
    }

    @Override
    public Identifier getTextureLocation(LostMinerEntity animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/entity/lost_miner.png");
    }

    @Override
    public void render(LostMinerEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
