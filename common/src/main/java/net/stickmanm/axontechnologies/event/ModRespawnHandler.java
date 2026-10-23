package net.stickmanm.axontechnologies.event;

import com.google.common.collect.Maps;
import dev.architectury.event.EventResult;
import dev.architectury.event.events.common.EntityEvent;
import dev.architectury.event.events.common.PlayerEvent;
import net.minecraft.registry.RegistryKey;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Heightmap;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.world.dimension.ModDimensions;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public class ModRespawnHandler {

    private static  final Set<RegistryKey<World>> RESPAWN_IN_PLACE = Set.of(
            ModDimensions.MIMDIM_DIMENSION_KEY,
            ModDimensions.DCDIM_DIMENSION_KEY,
            ModDimensions.THUNDERLANDS_DIMENSION_KEY,
            ModDimensions.CORRUPTIONLANDS_DIMENSION_KEY
    );

    private static final Map<UUID, RegistryKey<World>> DEATH_DIMENSION = new HashMap<>();

    public static void register() {
        EntityEvent.LIVING_DEATH.register(((entity, source) -> {
            if (entity instanceof ServerPlayerEntity player) {
                RegistryKey<World> dim = player.getServerWorld().getRegistryKey();
                if (RESPAWN_IN_PLACE.contains(dim)) {
                    DEATH_DIMENSION.put(player.getUuid(), dim);
                }
            }
            return EventResult.pass();
        }));

        PlayerEvent.PLAYER_RESPAWN.register((player, conqueredEnd) -> {
            RegistryKey<World> dim = DEATH_DIMENSION.remove(player.getUuid());
            if (dim == null) return;

            if (player.getServerWorld().getRegistryKey().equals(dim)) return;

            MinecraftServer server = player.getServer();
            if (server == null) return;
            ServerWorld target = server.getWorld(dim);
            if (target == null) return;

            // Respawn point
            BlockPos pos = target.getSpawnPos();
            int x = pos.getX();
            int z = pos.getZ();
            int y = target.getTopY(Heightmap.Type.MOTION_BLOCKING_NO_LEAVES, x, z);
            if (y <= target.getBottomY()) {
                y = target.getSeaLevel() + 1; // no ground found; fall back
            }

            player.teleport(target, x + 0.5, y, z + 0.5, player.getYaw(), player.getPitch());
        });
    }
}
