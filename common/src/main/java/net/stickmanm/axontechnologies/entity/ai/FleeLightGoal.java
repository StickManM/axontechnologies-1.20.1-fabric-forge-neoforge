package net.stickmanm.axontechnologies.entity.ai;

import net.minecraft.entity.ai.goal.Goal;
import net.minecraft.entity.ai.pathing.Path;
import net.minecraft.entity.mob.PathAwareEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.LightType;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.AxonTechnologies;

import java.util.EnumSet;


public class FleeLightGoal extends Goal {
    private static final boolean DEBUG = true;

    private final PathAwareEntity mob;
    private final double speed;
    private final int fearLevel;   // block light at (or above) which the mob panics
    private final int safeLevel;   // block light it considers "dark enough"
    private final int range;       // search radius in blocks

    private BlockPos target;
    private int cooldown;

    public FleeLightGoal(PathAwareEntity mob, double speed, int fearLevel, int safeLevel, int range) {
        this.mob = mob;
        this.speed = speed;
        this.fearLevel = fearLevel;
        this.safeLevel = safeLevel;
        this.range = range;
        this.setControls(EnumSet.of(Control.MOVE));
    }

    private int lightAt(BlockPos pos) {
        return mob.getWorld().getLightLevel(LightType.BLOCK, pos);
    }

    @Override
    public boolean canStart() {
        if (cooldown > 0) {
            cooldown--;
            return false;
        }
        int here = lightAt(mob.getBlockPos());
        if (here < fearLevel) return false;

        if (!findDarkSpot(here)) {
            if (DEBUG) AxonTechnologies.LOGGER.info("[FleeLight] light {} at {} but found no darker reachable spot", here, mob.getBlockPos());
            cooldown = 20;
            return false;
        }
        return true;
    }

    @Override
    public boolean shouldContinue() {
        return !mob.getNavigation().isIdle() && lightAt(mob.getBlockPos()) > safeLevel;
    }

    @Override
    public void start() {
        if (DEBUG) AxonTechnologies.LOGGER.info("[FleeLight] fleeing from {} (light {}) to {} (light {})",
                mob.getBlockPos(), lightAt(mob.getBlockPos()), target, lightAt(target));
        mob.getNavigation().startMovingTo(target.getX() + 0.5, target.getY(), target.getZ() + 0.5, speed);
    }

    @Override
    public void stop() {
        mob.getNavigation().stop();
        target = null;
    }

    //First free, walkable spot found scanning the column x/z from yHint+4 down to yHint-4.
    private BlockPos standingSpot(int x, int yHint, int z) {
        World world = mob.getWorld();
        for (int y = yHint + 4; y >= yHint - 4; y--) {
            BlockPos feet = new BlockPos(x, y, z);
            BlockPos below = feet.down();
            if (world.getBlockState(below).isSolidBlock(world, below)
                    && world.getBlockState(feet).getCollisionShape(world, feet).isEmpty()
                    && world.getBlockState(feet.up()).getCollisionShape(world, feet.up()).isEmpty()) {
                return feet;
            }
        }
        return null;
    }

    private boolean findDarkSpot(int here) {
        BlockPos origin = mob.getBlockPos();
        BlockPos best = null;
        double bestScore = Double.MAX_VALUE;

        for (int i = 0; i < 48; i++) {
            int x = origin.getX() + mob.getRandom().nextInt(range * 2 + 1) - range;
            int z = origin.getZ() + mob.getRandom().nextInt(range * 2 + 1) - range;
            BlockPos p = standingSpot(x, origin.getY(), z);
            if (p == null) continue;

            int light = lightAt(p);
            if (light > safeLevel && light > here - 4) continue;       //must be dark, or clearly darker than here

            double score = light * 2.0 + Math.sqrt(p.getSquaredDistance(origin));   //darker and closer is better
            if (score >= bestScore) continue;

            Path path = mob.getNavigation().findPathTo(p, 0);          //only path-check promising candidates
            if (path == null || !path.reachesTarget()) continue;

            best = p;
            bestScore = score;
        }
        target = best;
        return best != null;
    }
}