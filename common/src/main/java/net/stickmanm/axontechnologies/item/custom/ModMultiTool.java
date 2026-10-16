package net.stickmanm.axontechnologies.item.custom;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class ModMultiTool extends PickaxeItem {
    public ModMultiTool(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
    @Override
    public boolean isEnchantable(ItemStack stack) {
        return super.isEnchantable(stack);
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        // Check if the block is mineable by a Pickaxe, Axe, Shovel, or Hoe tag
        return state.isIn(BlockTags.PICKAXE_MINEABLE) ||
                state.isIn(BlockTags.AXE_MINEABLE) ||
                state.isIn(BlockTags.SHOVEL_MINEABLE) ||
                state.isIn(BlockTags.HOE_MINEABLE);
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        ToolMaterial material = this.getMaterial();

        // Check all relevant tags for the MultiTool
        if (state.isIn(BlockTags.PICKAXE_MINEABLE) ||
                state.isIn(BlockTags.AXE_MINEABLE) ||
                state.isIn(BlockTags.SHOVEL_MINEABLE) ||
                state.isIn(BlockTags.HOE_MINEABLE)) {

            // If the block is mineable by ANY of the tool types
            if (this.isSuitableFor(state)) {
                return material.getMiningSpeedMultiplier();
            }
        }

        return 1.0F; // Return 1.0F (default speed) if not effective
    }


    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        // Logic for tilling farmland (Hoe behavior)
        BlockPos pos = context.getBlockPos();

        // Example: Check for dirt/grass blocks and attempt to till
        // This often involves calling a static method similar to how vanilla tools work,
        // or replicating the logic from HoeItem's implementation.

        // If successful:
        // context.getStack().damage(1, context.getPlayer(), ...);
        // return ActionResult.SUCCESS;

        return ActionResult.PASS; // If no special action was taken
    }
}
