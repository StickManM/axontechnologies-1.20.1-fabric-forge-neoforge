package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.block.BlockRenderManager;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.TntMinecartEntityRenderer;
import net.minecraft.client.texture.SpriteAtlasTexture;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.RotationAxis;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.custom.RedThunderaniumTntEntity;
import net.stickmanm.axontechnologies.entity.custom.ThunderaniumTntEntity;

public class RedThunderaniumTntEntityRenderer extends EntityRenderer<RedThunderaniumTntEntity> {

    private final BlockRenderManager blockRenderManager;
    // You don't need the BlockRenderManager field,
    // as the method we call is static.

    public RedThunderaniumTntEntityRenderer(EntityRendererFactory.Context context) {
        super(context);
        this.shadowRadius = 0.5F;
        this.blockRenderManager = context.getBlockRenderManager();
    }

    /**
     * We override the entire render method to change the block state.
     * This code is copied from the vanilla TntEntityRenderer.
     */
    @Override
    public void render(RedThunderaniumTntEntity myTntEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        matrixStack.push();
        matrixStack.translate(0.0F, 0.5F, 0.0F);

        // This code handles the bobbing up and down as the fuse ticks down
        int j = myTntEntity.getFuse();
        if ((float)j - g + 1.0F < 10.0F) {
            float h = 1.0F - ((float)j - g + 1.0F) / 10.0F;
            h = MathHelper.clamp(h, 0.0F, 1.0F);
            h *= h;
            h *= h;
            float k = 1.0F + h * 0.3F;
            matrixStack.scale(k, k, k);
        }

        // This code handles the white flashing overlay
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(-90.0F));
        matrixStack.translate(-0.5F, -0.5F, 0.5F);
        matrixStack.multiply(RotationAxis.POSITIVE_Y.rotationDegrees(90.0F));

        //
        // *** THIS IS THE KEY CHANGE ***
        //
        // We call the static method 'renderFlashingBlock' (found in TntMinecartEntityRenderer)
        // and pass in OUR custom block's default state instead of Blocks.TNT.
        TntMinecartEntityRenderer.renderFlashingBlock(this.blockRenderManager, ModBlocks.RED_THUNDERANIUM_TNT.getDefaultState(), matrixStack, vertexConsumerProvider, i, j / 5 % 2 == 0);

        matrixStack.pop();
        super.render(myTntEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }

    /**
     * Returns the texture sheet. For blocks, this is always the block atlas.
     */
    @Override
    public Identifier getTexture(RedThunderaniumTntEntity myTntEntity) {
        return SpriteAtlasTexture.BLOCK_ATLAS_TEXTURE;
    }
}
