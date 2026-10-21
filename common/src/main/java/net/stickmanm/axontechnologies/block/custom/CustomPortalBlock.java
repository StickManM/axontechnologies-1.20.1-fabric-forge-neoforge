package net.stickmanm.axontechnologies.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldAccess;
import net.minecraft.block.ShapeContext;
import net.stickmanm.axontechnologies.world.portal.ModPortals;
import net.stickmanm.axontechnologies.world.portal.PortalDef;

/**
 * Portal block shared by all of the mod's portals (one registered instance per {@link PortalDef}).
 * AXIS = the plane the portal lies in: X (spans X/Y), Z (spans Z/Y) or Y (flat, spans X/Z).
 */
public class CustomPortalBlock extends Block {
    public static final EnumProperty<Direction.Axis> AXIS = Properties.AXIS;

    private static final VoxelShape X_SHAPE = Block.createCuboidShape(0, 0, 6, 16, 16, 10);
    private static final VoxelShape Z_SHAPE = Block.createCuboidShape(6, 0, 0, 10, 16, 16);
    private static final VoxelShape Y_SHAPE = Block.createCuboidShape(0, 6, 0, 16, 10, 16);

    private final PortalDef def;

    public CustomPortalBlock(PortalDef def, Settings settings) {
        super(settings);
        this.def = def;
        setDefaultState(getStateManager().getDefaultState().with(AXIS, Direction.Axis.X));
    }

    public PortalDef getDef() {
        return def;
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(AXIS);
    }

    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return switch (state.get(AXIS)) {
            case Z -> Z_SHAPE;
            case Y -> Y_SHAPE;
            default -> X_SHAPE;
        };
    }

    /** The four directions that stay inside the portal's plane. */
    public static Direction[] planeDirections(Direction.Axis axis) {
        return switch (axis) {
            case X -> new Direction[]{Direction.EAST, Direction.WEST, Direction.UP, Direction.DOWN};
            case Z -> new Direction[]{Direction.NORTH, Direction.SOUTH, Direction.UP, Direction.DOWN};
            default -> new Direction[]{Direction.EAST, Direction.WEST, Direction.NORTH, Direction.SOUTH};
        };
    }

    @Override
    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState,
                                                WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        for (Direction d : planeDirections(state.get(AXIS))) {
            if (d == direction) {
                // a frame block or another portal block of ours has to stay there, otherwise the portal collapses
                if (!neighborState.isOf(this) && !neighborState.isOf(def.frame.get()))
                    return Blocks.AIR.getDefaultState();
            }
        }
        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    @Override
    public void onEntityCollision(BlockState state, World world, BlockPos pos, Entity entity) {
        if (world.isClient() || !(entity instanceof ServerPlayerEntity player))
            return;
        if (player.hasVehicle() || player.hasPassengers())
            return;
        ModPortals.playerInPortal(player, def);
    }

    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        if (random.nextInt(4) == 0) {
            world.addParticle(ParticleTypes.PORTAL,
                    pos.getX() + random.nextDouble(), pos.getY() + random.nextDouble(), pos.getZ() + random.nextDouble(),
                    (random.nextDouble() - 0.5) * 0.5, (random.nextDouble() - 0.5) * 0.5, (random.nextDouble() - 0.5) * 0.5);
        }
    }

    @Override
    public ItemStack getPickStack(BlockView world, BlockPos pos, BlockState state) {
        return ItemStack.EMPTY;
    }
}
