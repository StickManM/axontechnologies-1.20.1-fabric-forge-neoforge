package net.stickmanm.fabric.world;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;

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
                .registerPortal();
    }

}
