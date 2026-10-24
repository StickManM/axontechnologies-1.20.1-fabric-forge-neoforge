package net.stickmanm.forge.event;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.PillarBlock;
import net.minecraftforge.common.ToolActions;
import net.minecraftforge.event.level.BlockEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.ModBlocks;

import java.util.Map;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = AxonTechnologiesConstants.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class ModForgeEvents {

    // Suppliers, because the blocks are registered later through DeferredRegister
    private static final Map<Supplier<Block>, Supplier<Block>> STRIPPABLES = Map.of(
            ModBlocks.THUNDERED_LOG::get,   ModBlocks.STRIPPED_THUNDERED_LOG::get,
            ModBlocks.THUNDERED_WOOD::get,  ModBlocks.STRIPPED_THUNDERED_WOOD::get,
            ModBlocks.CORRUPTED_LOG::get,   ModBlocks.STRIPPED_CORRUPTED_LOG::get,
            ModBlocks.CORRUPTED_WOOD::get,  ModBlocks.STRIPPED_CORRUPTED_WOOD::get
    );

    @SubscribeEvent
    public static void onAxeStrip(BlockEvent.BlockToolModificationEvent event) {
        if (event.getToolAction() != ToolActions.AXE_STRIP) return;

        BlockState state = event.getState();
        for (Map.Entry<Supplier<Block>, Supplier<Block>> entry : STRIPPABLES.entrySet()) {
            if (state.isOf(entry.getKey().get())) {
                event.setFinalState(entry.getValue().get().getDefaultState()
                        .with(PillarBlock.AXIS, state.get(PillarBlock.AXIS)));
                return;
            }
        }
    }
}