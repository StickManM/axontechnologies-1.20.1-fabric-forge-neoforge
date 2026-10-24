package net.stickmanm.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.ItemTags;
import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.item.ModItemTags;
import net.stickmanm.axontechnologies.util.ModTags;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture,
                              FabricTagProvider.BlockTagProvider blockTagProvider) {
        super(output, registriesFuture, blockTagProvider);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        copy(ModBlockTags.THUNDERED_PLANKS_CONVERTIBLE, ModItemTags.THUNDERED_PLANKS_CONVERTIBLE);
        copy(BlockTags.PLANKS, ItemTags.PLANKS);
        copy(BlockTags.LOGS, ItemTags.LOGS);
        copy(ModBlockTags.CORRUPTED_PLANKS_CONVERTIBLE, ModItemTags.CORRUPTED_PLANKS_CONVERTIBLE);

        getOrCreateTagBuilder(ItemTags.STONE_CRAFTING_MATERIALS)
                .add(ModBlocks.THUNDERED_STONE.get().asItem())
                .add(ModBlocks.CORRUPTED_STONE.get().asItem())
                .add(ModBlocks.FAKESTONE.get().asItem())
                .add(ModBlocks.FAKESLATE.get().asItem())
                .add(ModBlocks.DREADSTONE.get().asItem());

        getOrCreateTagBuilder(ItemTags.STONE_TOOL_MATERIALS)
                .add(ModBlocks.THUNDERED_STONE.get().asItem())
                .add(ModBlocks.CORRUPTED_STONE.get().asItem())
                .add(ModBlocks.FAKESTONE.get().asItem())
                .add(ModBlocks.FAKESLATE.get().asItem())
                .add(ModBlocks.DREADSTONE.get().asItem());

    }
}