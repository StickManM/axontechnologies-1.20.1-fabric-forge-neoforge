package net.stickmanm.axontechnologies.entity.client;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.IronGolemEntityRenderer;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;

/** Vanilla iron golem model and animations, with our own texture (128x128, same layout as the vanilla one). */
public class ThunderaniumGolemRenderer extends IronGolemEntityRenderer {
    private static final Identifier TEXTURE =
            new Identifier(AxonTechnologiesConstants.MOD_ID, "textures/entity/thunderanium_golem.png");

    public ThunderaniumGolemRenderer(EntityRendererFactory.Context context) {
        super(context);
    }

    @Override
    public Identifier getTexture(IronGolemEntity entity) {
        return TEXTURE;
    }
}
