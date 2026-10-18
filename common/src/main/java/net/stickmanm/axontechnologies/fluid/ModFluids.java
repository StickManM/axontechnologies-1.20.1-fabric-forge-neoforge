package net.stickmanm.axontechnologies.fluid;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.registry.RegistryKeys;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.custom.GXFluidBlock;
import net.stickmanm.axontechnologies.block.custom.LiquidCorruptionFluidBlock;
import net.stickmanm.axontechnologies.block.custom.LiquidThunderFluidBlock;
import net.stickmanm.axontechnologies.fluid.custom.GXFluid;
import net.stickmanm.axontechnologies.fluid.custom.LiquidCorruptionFluid;
import net.stickmanm.axontechnologies.fluid.custom.LiquidThunderFluid;

import java.util.function.Supplier;

public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.FLUID);
    public static final DeferredRegister<Block> FLUID_BLOCKS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.BLOCK);

    public static final RegistrySupplier<Fluid> STILL_LIQUID_THUNDER = FLUIDS.register("liquid_thunder",
            () -> new LiquidThunderFluid.Still());
    public static final RegistrySupplier<Fluid> FLOWING_LIQUID_THUNDER = FLUIDS.register("flowing_liquid_thunder",
            () -> new LiquidThunderFluid.Flowing());
    public static final RegistrySupplier<Block> LIQUID_THUNDER_BLOCK = registerFluidBlock("liquid_thunder_block",
            () -> new LiquidThunderFluidBlock((FlowableFluid) STILL_LIQUID_THUNDER.get(), Block.Settings.copy(Blocks.LAVA).liquid().pistonBehavior(PistonBehavior.DESTROY).replaceable()));

    public static final RegistrySupplier<Fluid> STILL_LIQUID_CORRUPTION = FLUIDS.register("liquid_corruption",
            () -> new LiquidCorruptionFluid.Still());
    public static final RegistrySupplier<Fluid> FLOWING_LIQUID_CORRUPTION = FLUIDS.register("flowing_liquid_corruption",
            () -> new LiquidCorruptionFluid.Flowing());
    public static final RegistrySupplier<Block> LIQUID_CORRUPTION_BLOCK = registerFluidBlock("liquid_corruption_block",
            () -> new LiquidCorruptionFluidBlock((FlowableFluid) STILL_LIQUID_CORRUPTION.get(), Block.Settings.copy(Blocks.LAVA).liquid().pistonBehavior(PistonBehavior.DESTROY).replaceable()));

    public static final RegistrySupplier<Fluid> STILL_GX = FLUIDS.register("gx",
            () -> new GXFluid.Still());
    public static final RegistrySupplier<Fluid> FLOWING_GX = FLUIDS.register("flowing_gx",
            () -> new GXFluid.Flowing());
    public static final RegistrySupplier<Block> GX_BLOCK = registerFluidBlock("gx_block",
            () -> new GXFluidBlock((FlowableFluid) STILL_GX.get(), Block.Settings.copy(Blocks.WATER).replaceable().pistonBehavior(PistonBehavior.DESTROY)));

    private static <T extends Block> RegistrySupplier<T> registerFluidBlock(String name, Supplier<T> block) {
        return FLUID_BLOCKS.register(name, block);
    }

    public static void register() {
    }






}

