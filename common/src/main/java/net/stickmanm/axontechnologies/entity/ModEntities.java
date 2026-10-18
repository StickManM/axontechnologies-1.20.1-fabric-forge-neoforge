package net.stickmanm.axontechnologies.entity;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.RegistryKeys;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.entity.custom.*;

import java.util.function.Supplier;

public class ModEntities {

    public static final DeferredRegister<EntityType<?>> ENTITIES =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.ENTITY_TYPE);

    public static final RegistrySupplier<EntityType<RedEssenceZombieEntity>> RED_ESSENCE_ZOMBIE = registerEntity("red_essence_zombie",
            () -> EntityType.Builder.create(RedEssenceZombieEntity::new, SpawnGroup.MONSTER)
                    .makeFireImmune()
                    .setDimensions(0.6f,2f)
                    .build("red_essence_zombie"));

    public static final RegistrySupplier<EntityType<DarkEssenceZombieEntity>> DARK_ESSENCE_ZOMBIE = registerEntity("dark_essence_zombie",
            () -> EntityType.Builder.create(DarkEssenceZombieEntity::new, SpawnGroup.MONSTER)
                    .makeFireImmune()
                    .setDimensions(0.6f,2f)
                    .build("dark_essence_zombie"));

    public static final RegistrySupplier<EntityType<LostMinerEntity>> LOST_MINER = registerEntity("lost_miner",
            () -> EntityType.Builder.create(LostMinerEntity::new, SpawnGroup.MONSTER)
                    .setDimensions(0.6f,2f)
                    .build("lost_miner"));

    public static final RegistrySupplier<EntityType<GeneticallyModifiedRedEssenceZombieEntity>> GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE = registerEntity("genetically_modified_red_essence_zombie",
            () -> EntityType.Builder.create(GeneticallyModifiedRedEssenceZombieEntity::new, SpawnGroup.MONSTER)
                    .makeFireImmune()
                    .setDimensions(0.6f,2f)
                    .build("genetically_modified_red_essence_zombie"));

    public static final RegistrySupplier<EntityType<ThunderaniumTntEntity>> THUNDERANIUM_TNT_ENTITY_TYPE = registerEntity("primed_thunderanium_tnt",
            () -> EntityType.Builder.<ThunderaniumTntEntity>create(ThunderaniumTntEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.98F, 0.98F)
                    .maxTrackingRange(10)
                    .build("primed_thunderanium_tnt"));

    public static final RegistrySupplier<EntityType<RedThunderaniumTntEntity>> RED_THUNDERANIUM_TNT_ENTITY_TYPE = registerEntity("primed_red_thunderanium_tnt",
            () -> EntityType.Builder.<RedThunderaniumTntEntity>create(RedThunderaniumTntEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.98F, 0.98F)
                    .maxTrackingRange(10)
                    .build("primed_red_thunderanium_tnt"));

    public static final RegistrySupplier<EntityType<AxonAlloyTntEntity>> AXON_ALLOY_TNT_ENTITY_TYPE = registerEntity("primed_axon_alloy_tnt",
            () -> EntityType.Builder.<AxonAlloyTntEntity>create(AxonAlloyTntEntity::new, SpawnGroup.MISC)
                    .setDimensions(0.98F, 0.98F)
                    .maxTrackingRange(10)
                    .build("primed_axon_alloy_tnt"));

    private static <T extends EntityType<?>> RegistrySupplier<T> registerEntity(String name, Supplier<T> entity) {
        return ENTITIES.register(name, entity);
    }

    public static void registerModEntities(){
        // Attribute registration is handled in platform-specific code
    }
}


