package net.stickmanm.axontechnologies.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MovementType;
import net.minecraft.entity.TntEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.entity.ModEntities;
import org.jetbrains.annotations.Nullable;

public class AxonAlloyTntEntity extends TntEntity {

    // Default constructor for entity type creation
    public AxonAlloyTntEntity(EntityType<? extends TntEntity> entityType, World world) {
        super(entityType, world);
    }

    // Constructor used when the block is primed
    public AxonAlloyTntEntity(World world, double x, double y, double z, @Nullable LivingEntity igniter) {
        this(ModEntities.AXON_ALLOY_TNT_ENTITY_TYPE, world); // Use your registered entity type
        this.setPosition(x, y, z);
        float f = this.getWorld().random.nextFloat() * (float)Math.PI * 2.0F; // 6.2831855F
        this.setVelocity(-((float)MathHelper.sin(f)) * 0.02F, 0.2F, -((float)MathHelper.cos(f)) * 0.02F);
        this.setFuse(80); // Set fuse to 4 seconds (80 ticks)
    }

    @Override
    public void tick() {
        if (!this.hasNoGravity()) {
            this.setVelocity(this.getVelocity().add(0.0, -0.04, 0.0));
        }
        this.move(MovementType.SELF, this.getVelocity());
        this.setVelocity(this.getVelocity().multiply(0.98));
        if (this.isOnGround()) {
            this.setVelocity(this.getVelocity().multiply(0.7, -0.5, 0.7));
        }
        int i = this.getFuse() - 1;
        this.setFuse(i);
        if (i <= 0) {
            this.discard();
            if (!this.getWorld().isClient) {
                this.explode();
            }
        } else {
            this.updateWaterState();
            if (this.getWorld().isClient) {
                this.getWorld().addParticle(ParticleTypes.SMOKE, this.getX(), this.getY() + 0.5, this.getZ(), 0.0, 0.0, 0.0);
            }
        }
    }


    // Override the core explosion logic
    protected void explode() {
        // Customize your explosion here
        float explosionPower = 505f; // TNT is 4.0F. 6.0F is a bigger blast.

        // Explosion.DestructionType.BREAK causes block damage.
        // true sets the explosion to be 'Smoking' (fire)
        this.getWorld().createExplosion(this, this.getX(), this.getBodyY(3), this.getZ(),
                explosionPower, false, World.ExplosionSourceType.TNT);

        // Add custom status effects or other events here
    }
}
