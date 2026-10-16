package net.stickmanm.axontechnologies.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.item.ModItems;

public class CorruptionBlock extends Block {
    public CorruptionBlock(Settings settings) {
        super(settings);
    }
    private void spreadBlock(World world, BlockPos centerPos) {
        // Try to find a random position around the center block (in a 3x3x3 cube)
        BlockPos targetPos = centerPos.add(
                world.random.nextInt(3) - 1,
                world.random.nextInt(3) - 1,
                world.random.nextInt(3) - 1
        );

        // Ensure the target position is not the center block itself
        if (targetPos.equals(centerPos)) {
            return;
        }

        // Check if the target block is replaceable (like air, grass, etc.)
        BlockState targetState = world.getBlockState(targetPos);

        if (targetState.isIn(BlockTags.STONE_ORE_REPLACEABLES) || targetState.isIn(BlockTags.DEEPSLATE_ORE_REPLACEABLES) || targetState.getBlock().equals(ModBlocks.THUNDERED_STONE)) {
            world.setBlockState(targetPos, ModBlocks.CORRUPTED_STONE.getDefaultState(), 3);
        } else if (targetState.isIn(BlockTags.DIRT)) {
            world.setBlockState(targetPos, ModBlocks.CORRUPTED_DIRT.getDefaultState(), 3);
        } else if (targetState.getBlock().equals(ModBlocks.THUNDERANIUM_ORE)) {
            world.setBlockState(targetPos, ModBlocks.CORRUPTINITE_ORE.getDefaultState(), 3);
        } else if (targetState.getBlock().equals(ModFluids.LIQUID_THUNDER_BLOCK)) {
            world.setBlockState(targetPos, ModFluids.LIQUID_CORRUPTION_BLOCK.getDefaultState(), 3);
        } else if (targetState.getBlock().equals(ModBlocks.RENDERIUM_ORE)) {
            world.setBlockState(targetPos, ModBlocks.DENDERIUM_ORE.getDefaultState(), 3);
        }
        else if (!targetState.isIn(ModBlockTags.CORRUPTION)){
            // Place the custom block at the target position
            world.setBlockState(targetPos, this.getDefaultState(), 3);
        }
    }


    /**
     * This method runs every time the block is right-clicked.
     */
    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos,
                              PlayerEntity player, Hand hand, BlockHitResult hit) {

        ItemStack stack = player.getStackInHand(hand);

        if (!world.isClient()) {

            // 🟢 MOSS BLOCK BEHAVIOR: Spreading with Bone Meal
            if (stack.getItem() == ModItems.DARK_ESSENCE) {

                // Attempt to spread the block multiple times, just like Bone Meal
                int spreadAttempts = 6;
                for (int i = 0; i < spreadAttempts; i++) {
                    spreadBlock(world, pos);
                }

                // Play bone meal sound
                world.playSound(null, pos, SoundEvents.BLOCK_SCULK_CATALYST_BLOOM,
                        SoundCategory.BLOCKS, 1.0F, 1.0F);

                // Consume the item
                if (!player.getAbilities().creativeMode) {
                    stack.decrement(1);
                }
                return ActionResult.SUCCESS;

                // 🟢 CUSTOM ITEM BEHAVIOR: Instantly transform the block (example)
            } /*else if (stack.getItem() == ModItems.RAZZORIUM) {

                // Example: Transform the spreading block into something valuable!
                world.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState(), 3);

                // Optional: Play a cool sound effect
                world.playSound(null, pos, SoundEvents.BLOCK_RESPAWN_ANCHOR_CHARGE,
                        SoundCategory.BLOCKS, 1.0F, 1.0F);

                // Consume the item
                if (!player.getAbilities().creativeMode) {
                    stack.decrement(1);
                }
                return ActionResult.SUCCESS;
            }*/
        }

        // If no custom action was taken, return PASS
        return super.onUse(state, world, pos, player, hand, hit);
    }


}
