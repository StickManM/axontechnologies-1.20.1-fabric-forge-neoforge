package net.stickmanm.forge.client;

import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.entity.client.*;
import net.stickmanm.axontechnologies.world.portal.ModPortals;
import net.stickmanm.axontechnologies.world.portal.PortalDef;

/** Client-only registrations that Fabric does in AxonTechnologiesFabricClient. */
@Mod.EventBusSubscriber(modid = AxonTechnologies.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class AxonTechnologiesForgeClient {

    @SubscribeEvent
    public static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(ModEntities.RED_ESSENCE_ZOMBIE.get(), RedEssenceZombieRenderer::new);
        event.registerEntityRenderer(ModEntities.GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE.get(), GeneticallyModifiedRedEssenceZombieRenderer::new);
        event.registerEntityRenderer(ModEntities.DARK_ESSENCE_ZOMBIE.get(), DarkEssenceZombieRenderer::new);
        event.registerEntityRenderer(ModEntities.LOST_MINER.get(), LostMinerRenderer::new);
        event.registerEntityRenderer(ModEntities.THUNDERANIUM_TNT_ENTITY_TYPE.get(), ThunderaniumTntEntityRenderer::new);
        event.registerEntityRenderer(ModEntities.RED_THUNDERANIUM_TNT_ENTITY_TYPE.get(), RedThunderaniumTntEntityRenderer::new);
        event.registerEntityRenderer(ModEntities.AXON_ALLOY_TNT_ENTITY_TYPE.get(), AxonAlloyTntEntityRenderer::new);
    }

    @SubscribeEvent
    public static void registerBlockColors(RegisterColorHandlersEvent.Block event) {
        // tint the nether portal texture with each portal's colour
        for (PortalDef def : ModPortals.PORTALS)
            event.register((state, world, pos, tintIndex) -> def.tint, def.portalBlock.get());
    }

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            RenderLayers.setRenderLayer(ModBlocks.THUNDERED_SAPLING.get(), RenderLayer.getCutout());
            RenderLayers.setRenderLayer(ModBlocks.REINFORCED_DREADSTONE_GLASS.get(), RenderLayer.getCutout());
            RenderLayers.setRenderLayer(ModBlocks.THUNDERED_LEAVES.get(), RenderLayer.getCutoutMipped());
        });
    }
}
