package net.stickmanm.axontechnologies.entity.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.ai.goal.ActiveTargetGoal;
import net.minecraft.entity.ai.goal.RevengeGoal;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.mob.ZombifiedPiglinEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.Box;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.item.ModItems;


public class ThunderaniumGolemEntity extends IronGolemEntity {

    private static final double AURA_RANGE = 12.0D;       // blocks
    private static final int AURA_INTERVAL = 40;          // re-applied every 2 seconds
    private static final int AURA_DURATION = 200;         // lingers ~5 seconds after leaving the aura
    private static final int RESISTANCE_LEVEL = 1;        // 0 = I, 1 = II
    private static final int REGENERATION_LEVEL = 1;
    private static final int DEBUFF_LEVEL = 2;

    public ThunderaniumGolemEntity(EntityType<? extends IronGolemEntity> entityType, World world) {
        super(entityType, world);
    }


    public static DefaultAttributeContainer.Builder setAttributes() {
        return IronGolemEntity.createIronGolemAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 250.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.4f)
                .add(EntityAttributes.GENERIC_ARMOR, 10.0f)
                .add(EntityAttributes.GENERIC_KNOCKBACK_RESISTANCE, 100f)
                .add(EntityAttributes.GENERIC_ATTACK_KNOCKBACK, 10f)
                .add(EntityAttributes.GENERIC_FOLLOW_RANGE, 96)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 85.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 0.7f)
                .add(EntityAttributes.GENERIC_LUCK, 50.5f);

    }

    @Override
    protected void initGoals() {
        super.initGoals();
        this.targetSelector.add(1, new RevengeGoal(this, new Class[0]).setGroupRevenge(ZombifiedPiglinEntity.class));



        this.targetSelector.add(1, new ActiveTargetGoal<>(this, DarkEssenceZombieEntity.class, false));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, RedEssenceZombieEntity.class, false));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, GeneticallyModifiedRedEssenceZombieEntity.class, false));
        this.targetSelector.add(1, new ActiveTargetGoal<>(this, LostMinerEntity.class, false));

        this.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, -1, 1,false, false, false));
        this.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, -1, 3,false, false, false));
        this.addStatusEffect(new StatusEffectInstance(StatusEffects.FIRE_RESISTANCE, -1, 0,false, false, false));
    }

    @Override
    public ActionResult interactMob(PlayerEntity player, Hand hand) {
        ItemStack stack = player.getStackInHand(hand);

        if (stack.isOf(Items.IRON_INGOT)) return ActionResult.PASS;                    // iron doesn't fix this one
        if (!stack.isOf(ModItems.THUNDERANIUM_INGOT.get())) return super.interactMob(player, hand);

        float before = this.getHealth();
        this.heal(60.0F);
        if (this.getHealth() == before) return ActionResult.PASS;                      // already at full health

        this.playSound(SoundEvents.ENTITY_IRON_GOLEM_REPAIR, 1.0F,
                1.0F + (this.random.nextFloat() - this.random.nextFloat()) * 0.2F);
        if (!player.getAbilities().creativeMode) stack.decrement(1);
        return ActionResult.success(this.getWorld().isClient);
    }

    @Override
    public void tick() {
        super.tick();
        if (!this.getWorld().isClient && this.age % AURA_INTERVAL == 0) {
            applyAura();
        }

        if (this.hasStatusEffect(ModEffects.ANTIGLITCHSTER.get())) {
            this.removeStatusEffect(StatusEffects.RESISTANCE);
        } else {
            this.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, -1, 3,false, false, false));
        }
    }

    private void applyAura() {
        Box area = this.getBoundingBox().expand(AURA_RANGE);
        double rangeSq = AURA_RANGE * AURA_RANGE;
        for (PlayerEntity player : this.getWorld().getEntitiesByClass(PlayerEntity.class, area,
                p -> p.isAlive() && !p.isSpectator() && this.squaredDistanceTo(p) <= rangeSq)) {
            // ambient = true (beacon-style), no particles, icon shown
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, AURA_DURATION, RESISTANCE_LEVEL, true, true, true), this);
            player.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, AURA_DURATION, REGENERATION_LEVEL-1, true, true, true), this);
        }
        for (VillagerEntity villagerEntity : this.getWorld().getEntitiesByClass(VillagerEntity.class, area,
                p -> p.isAlive() && this.squaredDistanceTo(p) <= rangeSq)) {
            // ambient = true (beacon-style), no particles, icon shown
            villagerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.RESISTANCE, AURA_DURATION, RESISTANCE_LEVEL+2, true, true, true), this);
            villagerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, AURA_DURATION, REGENERATION_LEVEL+1, true, true, true), this);
            villagerEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, AURA_DURATION, REGENERATION_LEVEL+1, true, true, true), this);
        }
        for (HostileEntity hostileEntity : this.getWorld().getEntitiesByClass(HostileEntity.class, area,
                p -> p.isAlive() && this.squaredDistanceTo(p) <= rangeSq)) {
            // ambient = true (beacon-style), no particles, icon shown
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, AURA_DURATION, DEBUFF_LEVEL, true, true, true), this);
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, AURA_DURATION, DEBUFF_LEVEL, true, true, true), this);
        }

        for (RedEssenceZombieEntity hostileEntity : this.getWorld().getEntitiesByClass(RedEssenceZombieEntity.class, area,
                p -> p.isAlive() && this.squaredDistanceTo(p) <= rangeSq)) {
            // ambient = true (beacon-style), no particles, icon shown
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, AURA_DURATION, DEBUFF_LEVEL+2, true, true, true), this);
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, AURA_DURATION, DEBUFF_LEVEL, true, true, true), this);
        }
        for (GeneticallyModifiedRedEssenceZombieEntity hostileEntity : this.getWorld().getEntitiesByClass(GeneticallyModifiedRedEssenceZombieEntity.class, area,
                p -> p.isAlive() && this.squaredDistanceTo(p) <= rangeSq)) {
            // ambient = true (beacon-style), no particles, icon shown
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, AURA_DURATION, DEBUFF_LEVEL+2, true, true, true), this);
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, AURA_DURATION, DEBUFF_LEVEL, true, true, true), this);
        }
        for (DarkEssenceZombieEntity hostileEntity : this.getWorld().getEntitiesByClass(DarkEssenceZombieEntity.class, area,
                p -> p.isAlive() && this.squaredDistanceTo(p) <= rangeSq)) {
            // ambient = true (beacon-style), no particles, icon shown
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, AURA_DURATION, DEBUFF_LEVEL+2, true, true, true), this);
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, AURA_DURATION, DEBUFF_LEVEL, true, true, true), this);
        }
        for (LostMinerEntity hostileEntity : this.getWorld().getEntitiesByClass(LostMinerEntity.class, area,
                p -> p.isAlive() && this.squaredDistanceTo(p) <= rangeSq)) {
            // ambient = true (beacon-style), no particles, icon shown
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, AURA_DURATION, DEBUFF_LEVEL, true, true, true), this);
            hostileEntity.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, AURA_DURATION, DEBUFF_LEVEL, true, true, true), this);
        }
    }

    public boolean tryAttack(Entity target) {
        if (!super.tryAttack(target)) {
            return false;
        } else {
            if (target instanceof LivingEntity) {
                ((LivingEntity)target).addStatusEffect(new StatusEffectInstance(ModEffects.THUNDER_POISONING.get(), 1200), this);
            }

            return true;
        }
    }
}
