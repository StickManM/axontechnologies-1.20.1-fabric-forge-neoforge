package net.stickmanm.axontechnologies.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.entity.mob.WardenEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.entity.ModEntities;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class RedEssenceZombieEntity extends PathAwareEntity implements GeoEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    public RedEssenceZombieEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }



    public static DefaultAttributeContainer.Builder setAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.2f)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0.4f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 64)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 100.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 40.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 5.0f)
                .add(EntityAttributes.GENERIC_LUCK, 50.5f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.0f);


    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 1.2D, false));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(1, new LongDoorInteractGoal(this, false));
        this.targetSelector.add(1, new RevengeGoal(this, new Class[0]).setGroupRevenge(ZombifiedPiglinEntity.class));



        this.goalSelector.add(4, new LookAroundGoal(this));

        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, LostMinerEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, MerchantEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, VillagerEntity.class, false));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, WardenEntity.class, false));
        this.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, -1, 2,false, false, false));



    }



    @Nullable

    public MobEntity createChild(ServerWorld world, MobEntity entity) {
        return ModEntities.RED_ESSENCE_ZOMBIE.create(world);
    }

    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllerRegistrar) {
        controllerRegistrar.add(new AnimationController<>(this, "controller", 0, this::predicate));

    }

    private <T extends GeoAnimatable> PlayState predicate(AnimationState<T> tAnimationState) {
        if (tAnimationState.isMoving()){
            tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.modified_RedEssenceZombie.walking", Animation.LoopType.LOOP));
            return PlayState.CONTINUE;
        }

        tAnimationState.getController().setAnimation(RawAnimation.begin().then("animation.modified_RedEssenceZombie.idle", Animation.LoopType.LOOP));
        return PlayState.CONTINUE;
    }

    public boolean damage(DamageSource source, float amount) {
        // 1. Call the super method first to process the damage normally
        boolean damaged = super.damage(source, amount);

        // 2. Only apply the effect if the entity was successfully damaged
        if (damaged) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 10, 255,false, false, false));
        }

        return damaged;
    }

    public void tick() {
        super.tick();

        // Check for transformation logic every tick
        BlockPos currentPos = this.getBlockPos();

        if (this.hasStatusEffect(ModEffects.GLITCHSTERX)) {
            convertEntity();

        }

        for (Direction direction : Direction.Type.HORIZONTAL) {
            BlockPos sidePos = currentPos.offset(direction);

            // Note: We check the block at the entity's Y-level, assuming the side touch happens here.
            if (this.tryTransform(sidePos)) {
                return;
            }
        }

        BlockPos upperPos = currentPos.up();
        for (Direction direction : Direction.Type.HORIZONTAL) {
            if (this.tryTransform(upperPos.offset(direction))) {
                return;
            }
        }
    }

    private boolean tryTransform(BlockPos pos) {
        BlockState state = this.getWorld().getBlockState(pos);

        // Check if the block at the given position is the trigger block (Cobblestone)
        if (state.isOf(ModBlocks.CORRUPTION_BLOCK)) {

            corruptEntity();
            // Tell the tick loop that the transformation happened
            return true;
        }

        return false;
    }


    private void convertEntity() {
        // This conversion should only happen on the server side
        if (!(this.getWorld() instanceof ServerWorld serverWorld)) {
            return;
        }

        // 1. Get the target entity type (e.g., a vanilla Zombie)
        EntityType<GeneticallyModifiedRedEssenceZombieEntity> targetType = ModEntities.GENETICALLY_MODIFIED_RED_ESSENCE_ZOMBIE; // Change to your desired entity type

        // 2. Create the new entity at the current location
        MobEntity newEntity = targetType.create(serverWorld);
        if (newEntity == null) {
            return;
        }

        newEntity.copyPositionAndRotation(this);

        // Optional: Copy NBT data (inventory, name, health, etc.)
        NbtCompound nbt = new NbtCompound();
        this.writeNbt(nbt);
        newEntity.readNbt(nbt);
        newEntity.setHealth(this.getHealth());

        // 3. Remove the original entity and add the new one
        this.discard(); // Removes the custom entity from the world
        serverWorld.spawnEntityAndPassengers(newEntity);

        // Optional: Add visual/sound effects for the transformation
        // serverWorld.syncWorldEvent(WorldEvents.ZOMBIE_VILLAGER_CURES, this.getBlockPos(), 0);
    }

    private void corruptEntity() {
        // This conversion should only happen on the server side
        if (!(this.getWorld() instanceof ServerWorld serverWorld)) {
            return;
        }

        // 1. Get the target entity type (e.g., a vanilla Zombie)
        EntityType<DarkEssenceZombieEntity> targetType = ModEntities.DARK_ESSENCE_ZOMBIE; // Change to your desired entity type

        // 2. Create the new entity at the current location
        MobEntity newEntity = targetType.create(serverWorld);
        if (newEntity == null) {
            return;
        }

        newEntity.copyPositionAndRotation(this);

        // Optional: Copy NBT data (inventory, name, health, etc.)
        NbtCompound nbt = new NbtCompound();
        this.writeNbt(nbt);
        newEntity.readNbt(nbt);
        newEntity.setHealth(this.getHealth());

        // 3. Remove the original entity and add the new one
        this.discard(); // Removes the custom entity from the world
        serverWorld.spawnEntityAndPassengers(newEntity);

        // Optional: Add visual/sound effects for the transformation
        // serverWorld.syncWorldEvent(WorldEvents.ZOMBIE_VILLAGER_CURES, this.getBlockPos(), 0);
    }

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
