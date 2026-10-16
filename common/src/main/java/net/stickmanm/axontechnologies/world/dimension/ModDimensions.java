package net.stickmanm.axontechnologies.world.dimension;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItems;

public class ModDimensions {
    //Dread Caverns
    public static final RegistryKey<World> DCDIM_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(AxonTechnologies.MOD_ID, "dreadcaverns"));
    public static final RegistryKey<DimensionType> DCDIM_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, DCDIM_DIMENSION_KEY.getValue());

    //Mimic World
    public static final RegistryKey<World> MIMDIM_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(AxonTechnologies.MOD_ID, "mimicworld"));
    public static final RegistryKey<DimensionType> MIMDIM_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, MIMDIM_DIMENSION_KEY.getValue());

    //Thunderlands
    public static final RegistryKey<World> THUNDERLANDS_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(AxonTechnologies.MOD_ID, "thunderlands"));
    public static final RegistryKey<DimensionType> THUNDERLANDS_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, THUNDERLANDS_DIMENSION_KEY.getValue());

    public static final RegistryKey<World> CORRUPTIONLANDS_DIMENSION_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(AxonTechnologies.MOD_ID, "corruptionlands"));
    public static final RegistryKey<DimensionType> CORRUPTIONLANDS_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, CORRUPTIONLANDS_DIMENSION_KEY.getValue());

    public static final RegistryKey<World> DAWN_OF_TIME_KEY = RegistryKey.of(RegistryKeys.WORLD,
            new Identifier(AxonTechnologies.MOD_ID, "dawn_of_time"));
    public static final RegistryKey<DimensionType> DAWN_OF_TIME_TYPE_KEY = RegistryKey.of(RegistryKeys.DIMENSION_TYPE, DAWN_OF_TIME_KEY.getValue());

    public static void registerModDimensions() {
        AxonTechnologies.LOGGER.debug("Registering ModDimensions for " + AxonTechnologies.MOD_ID);

        //PORTALS

        //DREAD CAVERNS PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.VOIDSTONE)
                .destDimID(DCDIM_DIMENSION_KEY.getValue())
                .tintColor(0, 0,0)
                .lightWithItem(ModItems.DREADED_IGNITER)
                .flatPortal()
                .registerPortal();


        //MIMIC WORLD PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                .destDimID(MIMDIM_DIMENSION_KEY.getValue())
                .tintColor(144, 238, 144)
                .lightWithItem(ModItems.MIMICARIUM_IGNITER)
                .registerPortal();

        //THUNDERLANDS PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.THUNDERANIUM_PORTAL_FRAME)
                .destDimID(THUNDERLANDS_DIMENSION_KEY.getValue())
                .tintColor(170, 169, 173)
                .lightWithItem(ModItems.THUNDERANIUM_KEY)
                .registerPortal();

        //CORRUPTEDLANDS PORTAL
        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.CORRUPTION_PORTAL_FRAME)
                .destDimID(CORRUPTIONLANDS_DIMENSION_KEY.getValue())
                .tintColor(139, 0, 0)
                .lightWithItem(ModItems.CORRUPTION_GATEWAY)
                .registerPortal();

    }
}
