package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.entity.custom.DarkEssenceZombieEntity;
import software.bernie.geckolib.renderer.GeoEntityRenderer;

public class DarkEssenceZombieRenderer extends GeoEntityRenderer<DarkEssenceZombieEntity> {
    public DarkEssenceZombieRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new DarkEssenceZombieModel());
    }

    @Override
    public Identifier getTextureLocation(DarkEssenceZombieEntity animatable) {
        return new Identifier(AxonTechnologies.MOD_ID, "textures/entity/dark_essence_zombie.png");
    }

    @Override
    public void render(DarkEssenceZombieEntity entity, float entityYaw, float partialTick, MatrixStack poseStack,
                       VertexConsumerProvider bufferSource, int packedLight) {
        if (entity.isBaby()){
            poseStack.scale(0.4f, 0.4f, 0.4f);
        }
        super.render(entity, entityYaw, partialTick, poseStack, bufferSource, packedLight);
    }
}
