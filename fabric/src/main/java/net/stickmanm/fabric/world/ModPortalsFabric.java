package net.stickmanm.fabric.world;

import net.fabricmc.fabric.api.event.player.UseItemCallback;
import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.kyrptonaught.customportalapi.portal.PortalIgnitionSource;
import net.kyrptonaught.customportalapi.portal.PortalPlacer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.util.math.BlockPos;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;

import java.util.List;

import static net.stickmanm.axontechnologies.world.dimension.ModDimensions.*;

public class ModPortalsFabric {

    public static void registerModPortalsFabric() {
        //DREAD CAVERNS PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.VOIDSTONE.get())
                .destDimID(DCDIM_DIMENSION_KEY.getValue())
                .tintColor(0, 0,0)
                .lightWithItem(ModItems.DREADED_IGNITER.get())
                .flatPortal()
                .registerPortal();


        //MIMIC WORLD PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get())
                .destDimID(MIMDIM_DIMENSION_KEY.getValue())
                .tintColor(144, 238, 144)
                .lightWithItem(ModItems.MIMICARIUM_IGNITER.get())
                .registerPortal();

        //THUNDERLANDS PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get())
                .destDimID(THUNDERLANDS_DIMENSION_KEY.getValue())
                .tintColor(170, 169, 173)
                .lightWithItem(ModItems.THUNDERANIUM_KEY.get())
                .registerPortal();

        //CORRUPTEDLANDS PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.CORRUPTION_PORTAL_FRAME.get())
                .destDimID(CORRUPTIONLANDS_DIMENSION_KEY.getValue())
                .tintColor(139, 0, 0)
                .lightWithItem(ModItems.CORRUPTION_GATEWAY.get())
                .returnDim(THUNDERLANDS_DIMENSION_KEY.getValue(), false)
                .registerPortal();


        // Universal igniter: try each portal's igniter, the frame decides which one actually lights
        UseItemCallback.EVENT.register((player, world, hand) -> {
            ItemStack stack = player.getStackInHand(hand);
            if (world.isClient || !stack.isOf(ModItems.UNIVERSAL_IGNITER.get()))
                return TypedActionResult.pass(stack);

            HitResult hit = player.raycast(6, 1, false);
            if (hit.getType() != HitResult.Type.BLOCK)
                return TypedActionResult.pass(stack);

            BlockHitResult blockHit = (BlockHitResult) hit;
            BlockPos lightPos = blockHit.getBlockPos().offset(blockHit.getSide());

            for (Item igniter : List.of(
                    ModItems.DREADED_IGNITER.get(),
                    ModItems.MIMICARIUM_IGNITER.get(),
                    ModItems.THUNDERANIUM_KEY.get(),
                    ModItems.CORRUPTION_GATEWAY.get())) {
                if (PortalPlacer.attemptPortalLight(world, lightPos,
                        PortalIgnitionSource.ItemUseSource(igniter).withPlayer(player))) {
                    return TypedActionResult.success(stack);
                }
            }
            return TypedActionResult.pass(stack);
        });

    }


}
