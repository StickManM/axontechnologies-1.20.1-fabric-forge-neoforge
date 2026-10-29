package net.stickmanm.axontechnologies.world.sync;

import dev.architectury.event.events.common.PlayerEvent;
import dev.architectury.event.events.common.TickEvent;
import net.minecraft.block.Blocks;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.GameMode;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.world.dimension.ModDimensions;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class DawnOfTimeTeleport {
    private static final double SPEED_THRESHOLD = 1;
    private static final int TICKS_REQUIRED = 20;
    private static final int PLATFORM_Y = 64;


    private static final int COOLDOWN_TICKS = 200;
    private static final Map<UUID, Long> COOLDOWN_UNTIL = new HashMap<>();

    private static final Map<UUID, Vec3d> LAST_POS = new HashMap<>();
    private static final Map<UUID, Integer> FAST_TICKS = new HashMap<>();

    public static void register() {
        TickEvent.PLAYER_POST.register(player -> {
            if (!(player instanceof ServerPlayerEntity sp)) return;

            UUID id = sp.getUuid();
            Vec3d now = sp.getPos();
            Vec3d last = LAST_POS.put(id, now);
            if (last == null) return;

            double dx = now.x - last.x;
            double dz = now.z - last.z;
            double speed = Math.sqrt(dx * dx + dz * dz);



            boolean flying = sp.getAbilities().flying || sp.isFallFlying();
            boolean survival = sp.interactionManager.getGameMode() == GameMode.SURVIVAL
                    || sp.interactionManager.getGameMode() == GameMode.ADVENTURE;
            long gameTime = sp.getServerWorld().getTime();
            boolean onCooldown = COOLDOWN_UNTIL.getOrDefault(id, 0L) > gameTime;

            boolean qualifies = sp.getWorld().getRegistryKey().equals(World.OVERWORLD)
                    && (sp.hasStatusEffect(ModEffects.GLITCHSTERX.get()))
                    && survival
                    && !flying
                    && !onCooldown
                    //&& sp.isSprinting()
                    && speed >= SPEED_THRESHOLD;

            if (sp.age % 10 == 0) {
                System.out.println("[DawnDebug] effect=" + (sp.hasStatusEffect(ModEffects.GLITCHSTERX.get()))
                        + " sprint=" + sp.isSprinting()
                        + " flying=" + flying
                        + " mode=" + sp.interactionManager.getGameMode()
                        + " speed=" + speed);
            }

            if (!qualifies) {
                FAST_TICKS.remove(id);
                return;
            }

            int ticks = FAST_TICKS.getOrDefault(id, 0);
            if (sp.isSprinting() && speed >= SPEED_THRESHOLD) {
                ticks++;
            } else {
                ticks = Math.max(0, ticks - 1); // decay instead of instant reset
            }
            FAST_TICKS.put(id, ticks);

            if (ticks >= TICKS_REQUIRED) {
                FAST_TICKS.remove(id);
                LAST_POS.remove(id);
                COOLDOWN_UNTIL.put(id, gameTime + COOLDOWN_TICKS);
                teleportToDawnOfTime(sp);
            }
        });

        //Leak Prevention
        PlayerEvent.PLAYER_QUIT.register(player -> {
            LAST_POS.remove(player.getUuid());
            FAST_TICKS.remove(player.getUuid());
            COOLDOWN_UNTIL.remove(player.getUuid());
        });
    }

    private static void teleportToDawnOfTime(ServerPlayerEntity player) {
        ServerWorld target = player.getServer().getWorld(ModDimensions.DAWN_OF_TIME_DIMENSION_KEY);
        if (target == null) return;

        BlockPos spawn = target.getSpawnPos();
        int x = spawn.getX();
        int z = spawn.getZ();

        // Make sure the chunk exists so the height lookup is real
        target.getChunk(x >> 4, z >> 4);

        int bottom = target.getBottomY();
        int y = target.getTopY(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, x, z);

        // No ground in this column (void): build a small platform instead
        if (y <= bottom + 1) {
            y = Math.max(bottom + 10, Math.min(PLATFORM_Y, target.getTopY() - 10));
            for (int dx = -1; dx <= 1; dx++) {
                for (int dz = -1; dz <= 1; dz++) {
                    target.setBlockState(new BlockPos(x + dx, y - 1, z + dz), Blocks.OBSIDIAN.getDefaultState());
                    for (int dy = 0; dy < 3; dy++) {
                        target.setBlockState(new BlockPos(x + dx, y + dy, z + dz), Blocks.AIR.getDefaultState());
                    }
                }
            }
        }

        player.fallDistance = 0;
        player.teleport(target, x + 0.5, y, z + 0.5, player.getYaw(), player.getPitch());
    }
}
