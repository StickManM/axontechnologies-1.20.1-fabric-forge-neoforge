package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.entity.custom.GeneticallyModifiedRedEssenceZombieEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class GeneticallyModifiedRedEssenceZombieRenderer extends GeoEntityRenderer<GeneticallyModifiedRedEssenceZombieEntity> {
    public GeneticallyModifiedRedEssenceZombieRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new GeneticallyModifiedRedEssenceZombieModel());
    }

    @Override
    public Identifier getTextureLocation(GeneticallyModifiedRedEssenceZombieEntity animatable) {
        return new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/entity/genetically_modified_red_essence_zombie.png");
    }

    @Override
    public void render(GeneticallyModifiedRedEssenceZombieEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
