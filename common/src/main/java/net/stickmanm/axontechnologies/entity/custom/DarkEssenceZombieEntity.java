package net.stickmanm.axontechnologies.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
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
import net.minecraft.entity.passive.MerchantEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.entity.ModEntities;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib.animatable.GeoEntity;
import software.bernie.geckolib.core.animatable.GeoAnimatable;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animatable.instance.SingletonAnimatableInstanceCache;
import software.bernie.geckolib.core.animation.*;
import software.bernie.geckolib.core.object.PlayState;

public class DarkEssenceZombieEntity extends PathAwareEntity implements GeoEntity {
    private AnimatableInstanceCache cache = new SingletonAnimatableInstanceCache(this);
    public DarkEssenceZombieEntity(EntityType<? extends PathAwareEntity> entityType, World world) {
        super(entityType, world);
    }



    public static DefaultAttributeContainer.Builder setAttributes() {
        return MobEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 0.5f)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 0.5f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 96)
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 110.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 45.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 5.0f)
                .add(EntityAttributes.GENERIC_LUCK, 50.5f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 1.01f);


    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(1, new SwimGoal(this));
        this.goalSelector.add(2, new MeleeAttackGoal(this, 5D, false));
        this.goalSelector.add(3, new WanderAroundFarGoal(this, 0.75f, 1));
        this.goalSelector.add(1, new LongDoorInteractGoal(this, false));
        this.targetSelector.add(1, new RevengeGoal(this, new Class[0]).setGroupRevenge(ZombifiedPiglinEntity.class));



        this.goalSelector.add(4, new LookAroundGoal(this));

        this.targetSelector.add(2, new ActiveTargetGoal<>(this, PlayerEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, RedEssenceZombieEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, GeneticallyModifiedRedEssenceZombieEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, LostMinerEntity.class, false));
        this.targetSelector.add(2, new ActiveTargetGoal<>(this, MerchantEntity.class, false));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, VillagerEntity.class, false));
        this.targetSelector.add(3, new ActiveTargetGoal<>(this, WardenEntity.class, false));
        this.addStatusEffect(new StatusEffectInstance(StatusEffects.DOLPHINS_GRACE, -1, 2,false, false, false));


    }



    @Nullable

    public MobEntity createChild(ServerWorld world, MobEntity entity) {
        return ModEntities.DARK_ESSENCE_ZOMBIE.create(world);
    }

    public boolean tryAttack(Entity target) {
        if (!super.tryAttack(target)) {
            return false;
        } else {
            if (target instanceof LivingEntity) {
                ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(ModEffects.ANTIGLITCHSTER, 1200), this);
            }

            return true;
        }
    }

    public boolean damage(DamageSource source, float amount) {
        // 1. Call the super method first to process the damage normally
        boolean damaged = super.damage(source, amount);

        // 2. Only apply the effect if the entity was successfully damaged
        if (damaged) {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 15, 255,false, false, false));
        }

        return damaged;
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

    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return cache;
    }
}
