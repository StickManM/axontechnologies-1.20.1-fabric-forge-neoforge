package net.stickmanm.axontechnologies.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.entity.custom.*;

public class ModEntities {

    public static final EntityType<RedEssenceZombieEntity> RED_ESSENCE_ZOMBIE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"red_essence_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, RedEssenceZombieEntity::new)
                    .fireImmune()
                    .specificSpawnBlocks(ModBlocks.CHARGED_DIRT)
                    .specificSpawnBlocks(ModBlocks.THUNDERED_STONE)
                    .trackRangeChunks(32)
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());

    public static final EntityType<DarkEssenceZombieEntity> DARK_ESSENCE_ZOMBIE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"dark_essence_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, DarkEssenceZombieEntity::new)
                    .fireImmune()
                    .specificSpawnBlocks(ModBlocks.CORRUPTED_DIRT)
                    .specificSpawnBlocks(ModBlocks.CORRUPTED_STONE)
                    .trackRangeChunks(48)
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());

    public static final EntityType<LostMinerEntity> LOST_MINER = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"lost_miner"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, LostMinerEntity::new)
                    .specificSpawnBlocks(ModBlocks.DREADSTONE)
                    .trackRangeChunks(15)
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());

    public static final EntityType<GeneticallyModifiedRedEssenceZombieEntity> GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE = Registry.register(
            Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID,"genetically_modified_red_essence_zombie"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, GeneticallyModifiedRedEssenceZombieEntity::new)
                    .fireImmune()
                    .specificSpawnBlocks(ModBlocks.CHARGED_DIRT)
                    .specificSpawnBlocks(ModBlocks.THUNDERED_STONE)
                    .trackRangeChunks(64)
                    .dimensions(EntityDimensions.fixed(0.6f,2f)).build());


    /*public static final EntityType<ThunderaniumTntEntity> THUNDERANIUM_TNT_ENTITY_ENTITY_TYPE = Registry.register(
                    Registries.ENTITY_TYPE, new Identifier(AxonTechnologies.MOD_ID, "thunderanium_tnt_entity"),
                    FabricEntityTypeBuilder.create(SpawnGroup.MISC, ThunderaniumTntEntity::new)
                            .dimensions(EntityDimensions.fixed(0.6f,2f))
                            .build());*/
    public static final EntityType<ThunderaniumTntEntity> THUNDERANIUM_TNT_ENTITY_TYPE =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    new Identifier(AxonTechnologies.MOD_ID, "primed_thunderanium_tnt"),

                    // 🟢 The builder creates an EntityType that links to the two-arg constructor.
                    // Explicitly defining the generic types here can sometimes resolve IDE issues.
                    EntityType.Builder.<ThunderaniumTntEntity>create(ThunderaniumTntEntity::new, SpawnGroup.MISC)
                            .setDimensions(0.98F, 0.98F)
                            .maxTrackingRange(10)
                            .build("primed_thunderanium_tnt"));

    public static final EntityType<RedThunderaniumTntEntity> RED_THUNDERANIUM_TNT_ENTITY_TYPE =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    new Identifier(AxonTechnologies.MOD_ID, "primed_red_thunderanium_tnt"),

                    // 🟢 The builder creates an EntityType that links to the two-arg constructor.
                    // Explicitly defining the generic types here can sometimes resolve IDE issues.
                    EntityType.Builder.<RedThunderaniumTntEntity>create(RedThunderaniumTntEntity::new, SpawnGroup.MISC)
                            .setDimensions(0.98F, 0.98F)
                            .maxTrackingRange(10)
                            .build("primed_red_thunderanium_tnt"));

    public static final EntityType<AxonAlloyTntEntity> AXON_ALLOY_TNT_ENTITY_TYPE =
            Registry.register(
                    Registries.ENTITY_TYPE,
                    new Identifier(AxonTechnologies.MOD_ID, "primed_axon_alloy_tnt"),

                    // 🟢 The builder creates an EntityType that links to the two-arg constructor.
                    // Explicitly defining the generic types here can sometimes resolve IDE issues.
                    EntityType.Builder.<AxonAlloyTntEntity>create(AxonAlloyTntEntity::new, SpawnGroup.MISC)
                            .setDimensions(0.98F, 0.98F)
                            .maxTrackingRange(10)
                            .build("primed_axon_alloy_tnt"));

    public static void registerModEntities(){
        FabricDefaultAttributeRegistry.register(ModEntities.RED_ESSENCE_ZOMBIE, RedEssenceZombieEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE, GeneticallyModifiedRedEssenceZombieEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.DARK_ESSENCE_ZOMBIE, DarkEssenceZombieEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.LOST_MINER, LostMinerEntity.setAttributes());

    }
}


