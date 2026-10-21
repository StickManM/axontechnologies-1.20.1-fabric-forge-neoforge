package net.stickmanm.axontechnologies.fluid;

import dev.architectury.core.fluid.ArchitecturyFlowingFluid;
import dev.architectury.core.fluid.ArchitecturyFluidAttributes;
import dev.architectury.core.fluid.SimpleArchitecturyFluidAttributes;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.fluid.FlowableFluid;
import net.minecraft.fluid.Fluid;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.custom.GXFluidBlock;
import net.stickmanm.axontechnologies.block.custom.LiquidCorruptionFluidBlock;
import net.stickmanm.axontechnologies.block.custom.LiquidThunderFluidBlock;
import net.stickmanm.axontechnologies.fluid.custom.LiquidCorruptionFluid;
import net.stickmanm.axontechnologies.fluid.custom.LiquidThunderFluid;
import net.stickmanm.axontechnologies.item.ModItems;

/**
 * Fluids are built on Architectury's fluid API so the same code works on Fabric and Forge
 * (Forge needs a FluidType for every fluid, Architectury creates it from these attributes).
 * Fluids must be registered before the fluid blocks (see the platform entry points).
 */
public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.FLUID);
    public static final DeferredRegister<Block> FLUID_BLOCKS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.BLOCK);

    private static final Identifier WATER_STILL = new Identifier("minecraft", "block/water_still");
    private static final Identifier WATER_FLOW = new Identifier("minecraft", "block/water_flow");
    private static final Identifier WATER_OVERLAY = new Identifier("minecraft", "block/water_overlay");

    // ---- Liquid Thunder ----
    public static final ArchitecturyFluidAttributes LIQUID_THUNDER_ATTRIBUTES = SimpleArchitecturyFluidAttributes
            .ofSupplier(() -> ModFluids.FLOWING_LIQUID_THUNDER, () -> ModFluids.STILL_LIQUID_THUNDER)
            .convertToSource(true)
            .slopeFindDistance(8)
            .dropOff(1)
            .tickDelay(5)
            .explosionResistance(200f)
            .sourceTexture(WATER_STILL)
            .flowingTexture(WATER_FLOW)
            .overlayTexture(WATER_OVERLAY)
            .color(0xFFA8A9AD)
            .blockSupplier(() -> ModFluids.LIQUID_THUNDER_BLOCK)
            .bucketItemSupplier(() -> ModItems.LIQUID_THUNDER_BUCKET);

    public static final RegistrySupplier<FlowableFluid> STILL_LIQUID_THUNDER = FLUIDS.register("liquid_thunder",
            () -> new LiquidThunderFluid.Source(LIQUID_THUNDER_ATTRIBUTES));
    public static final RegistrySupplier<FlowableFluid> FLOWING_LIQUID_THUNDER = FLUIDS.register("flowing_liquid_thunder",
            () -> new LiquidThunderFluid.Flowing(LIQUID_THUNDER_ATTRIBUTES));
    public static final RegistrySupplier<LiquidThunderFluidBlock> LIQUID_THUNDER_BLOCK = FLUID_BLOCKS.register("liquid_thunder_block",
            () -> new LiquidThunderFluidBlock(STILL_LIQUID_THUNDER.get(),
                    AbstractBlock.Settings.copy(Blocks.LAVA).liquid().pistonBehavior(PistonBehavior.DESTROY).replaceable()));

    // ---- Liquid Corruption ----
    public static final ArchitecturyFluidAttributes LIQUID_CORRUPTION_ATTRIBUTES = SimpleArchitecturyFluidAttributes
            .ofSupplier(() -> ModFluids.FLOWING_LIQUID_CORRUPTION, () -> ModFluids.STILL_LIQUID_CORRUPTION)
            .convertToSource(true)
            .slopeFindDistance(8)
            .dropOff(1)
            .tickDelay(5)
            .explosionResistance(200f)
            .sourceTexture(WATER_STILL)
            .flowingTexture(WATER_FLOW)
            .overlayTexture(WATER_OVERLAY)
            .color(0xFF111111)
            .blockSupplier(() -> ModFluids.LIQUID_CORRUPTION_BLOCK)
            .bucketItemSupplier(() -> ModItems.LIQUID_CORRUPTION_BUCKET);

    public static final RegistrySupplier<FlowableFluid> STILL_LIQUID_CORRUPTION = FLUIDS.register("liquid_corruption",
            () -> new LiquidCorruptionFluid.Source(LIQUID_CORRUPTION_ATTRIBUTES));
    public static final RegistrySupplier<FlowableFluid> FLOWING_LIQUID_CORRUPTION = FLUIDS.register("flowing_liquid_corruption",
            () -> new LiquidCorruptionFluid.Flowing(LIQUID_CORRUPTION_ATTRIBUTES));
    public static final RegistrySupplier<LiquidCorruptionFluidBlock> LIQUID_CORRUPTION_BLOCK = FLUID_BLOCKS.register("liquid_corruption_block",
            () -> new LiquidCorruptionFluidBlock(STILL_LIQUID_CORRUPTION.get(),
                    AbstractBlock.Settings.copy(Blocks.LAVA).liquid().pistonBehavior(PistonBehavior.DESTROY).replaceable()));

    // ---- GX ----
    public static final ArchitecturyFluidAttributes GX_ATTRIBUTES = SimpleArchitecturyFluidAttributes
            .ofSupplier(() -> ModFluids.FLOWING_GX, () -> ModFluids.STILL_GX)
            .convertToSource(false)
            .slopeFindDistance(1)
            .dropOff(1)
            .tickDelay(5)
            .explosionResistance(200f)
            .sourceTexture(WATER_STILL)
            .flowingTexture(WATER_FLOW)
            .overlayTexture(WATER_OVERLAY)
            .color(0xFF519B66)
            .blockSupplier(() -> ModFluids.GX_BLOCK)
            .bucketItemSupplier(() -> ModItems.GX_BUCKET);

    public static final RegistrySupplier<FlowableFluid> STILL_GX = FLUIDS.register("gx",
            () -> new ArchitecturyFlowingFluid.Source(GX_ATTRIBUTES));
    public static final RegistrySupplier<FlowableFluid> FLOWING_GX = FLUIDS.register("flowing_gx",
            () -> new ArchitecturyFlowingFluid.Flowing(GX_ATTRIBUTES));
    public static final RegistrySupplier<GXFluidBlock> GX_BLOCK = FLUID_BLOCKS.register("gx_block",
            () -> new GXFluidBlock(STILL_GX.get(),
                    AbstractBlock.Settings.copy(Blocks.WATER).replaceable().pistonBehavior(PistonBehavior.DESTROY)));

    public static void register() {
    }
}
