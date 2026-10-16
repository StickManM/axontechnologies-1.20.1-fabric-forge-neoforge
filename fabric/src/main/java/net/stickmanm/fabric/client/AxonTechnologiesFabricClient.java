package net.stickmanm.fabric.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.keybinding.v1.KeyBindingHelper;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.option.KeyBinding;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.TntEntityRenderer;
import net.minecraft.client.render.entity.TntMinecartEntityRenderer;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.util.InputUtil;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.entity.client.*;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import org.lwjgl.glfw.GLFW;

public class AxonTechnologiesFabricClient implements ClientModInitializer {

    /*public static KeyBinding effectKey = KeyBindingHelper.registerKeyBinding(new KeyBinding(
    "key.axontechnologies.activate_effect", // The translation key of the keybinding's name
    InputUtil.Type.KEYSYM, // The type of the keybinding, KEYSYM for keyboard, MOUSE for mouse.
    GLFW.GLFW_KEY_LEFT_BRACKET, // The keycode of the key
    "category.axontechnologies.keybinds" // The translation key of the keybinding's category.
    ));*/



    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.THUNDERED_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.REINFORCED_DREADSTONE_GLASS, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.RED_ESSENCE_ZOMBIE, RedEssenceZombieRenderer::new);
        EntityRendererRegistry.register(ModEntities.GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE, GeneticallyModifiedRedEssenceZombieRenderer::new);
        EntityRendererRegistry.register(ModEntities.DARK_ESSENCE_ZOMBIE, DarkEssenceZombieRenderer::new);
        EntityRendererRegistry.register(ModEntities.LOST_MINER, LostMinerRenderer::new);
        EntityRendererRegistry.register(ModEntities.THUNDERANIUM_TNT_ENTITY_TYPE, ThunderaniumTntEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.RED_THUNDERANIUM_TNT_ENTITY_TYPE, RedThunderaniumTntEntityRenderer::new);
        EntityRendererRegistry.register(ModEntities.AXON_ALLOY_TNT_ENTITY_TYPE, AxonAlloyTntEntityRenderer::new);

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIQUID_THUNDER, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0xA8A9AD));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FLOWING_LIQUID_THUNDER, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0xA8A9AD));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_LIQUID_CORRUPTION, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0x111111));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FLOWING_LIQUID_CORRUPTION, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0x111111));

        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.STILL_GX, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0x519b66));
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.FLOWING_GX, new SimpleFluidRenderHandler(
                SimpleFluidRenderHandler.WATER_STILL, SimpleFluidRenderHandler.WATER_FLOWING, SimpleFluidRenderHandler.WATER_OVERLAY,
                0x519b66));

    }
}
