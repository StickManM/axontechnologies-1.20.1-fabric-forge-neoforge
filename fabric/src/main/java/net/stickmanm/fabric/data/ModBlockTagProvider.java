package net.stickmanm.fabric.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
        public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {
            getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                    .add(ModBlocks.MIMICARIUM_ORE.get())
                    .add(ModBlocks.RENDERIUM_ORE.get())
                    .add(ModBlocks.DENDERIUM_ORE.get())
                    .add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get())
                    .add(ModBlocks.FAKESLATE.get())
                    .add(ModBlocks.FAKESTONE.get())
                    .add(ModBlocks.FAKESLATE_IRON_ORE.get())
                    .add(ModBlocks.FAKESLATE_GOLD_ORE.get())
                    .add(ModBlocks.FAKESTONE_GOLD_ORE.get())
                    .add(ModBlocks.FAKESTONE_IRON_ORE.get())
                    .add(ModBlocks.DREADSTONE.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_DOOR.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_SLAB.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_WALL.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_GLASS.get())
                    .add(ModBlocks.DREADSTONE_DIAMOND_ORE.get())
                    .add(ModBlocks.DREADSTONE_NETHERITE_ORE.get())
                    .add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get())
                    .add(ModBlocks.VOID_COAL_ORE.get())
                    .add(ModBlocks.VOID_COAL_BLOCK.get())
                    .add(ModBlocks.VOIDSTONE.get())
                    .add(ModBlocks.OCTUPLE_COMPRESSED_COBBLESTONE.get())
                    .add(ModBlocks.THUNDERED_STONE.get())
                    .add(ModBlocks.CORRUPTION_PORTAL_FRAME.get())
                    .add(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get())
                    .add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get())
                    .add(ModBlocks.THUNDERANIUM_ORE.get())
                    .add(ModBlocks.CORRUPTED_STONE.get())
                    .add(ModBlocks.CORRUPTION_BLOCK.get())
                    .add(ModBlocks.CORRUPTINITE_ORE.get())
                    .add(ModBlocks.MWDC_ORE.get())
                    .add(ModBlocks.DCDC_ORE.get())
                    .add(ModBlocks.CLDC_ORE.get())
                    .add(ModBlocks.TLDC_ORE.get())
                    .add(ModBlocks.RED_THUNDERANIUM_TNT.get())
                    .add(ModBlocks.THUNDERANIUM_TNT.get());

            getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                    .add(ModBlocks.THUNDERED_LOG.get())
                    .add(ModBlocks.THUNDERED_PLANKS.get())
                    .add(ModBlocks.THUNDERED_WOOD.get())
                    .add(ModBlocks.STRIPPED_THUNDERED_LOG.get())
                    .add(ModBlocks.STRIPPED_THUNDERED_WOOD.get());

            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                    .add(ModBlocks.CHARGED_DIRT.get())
                    .add(ModBlocks.CORRUPTED_DIRT.get());

            getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT);

            getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                    .add(ModBlocks.THUNDERED_STONE.get())
                    .add(ModBlocks.CORRUPTED_STONE.get())
                    .add(ModBlocks.FAKESTONE_IRON_ORE.get())
                    .add(ModBlocks.FAKESLATE_IRON_ORE.get())
                    .add(ModBlocks.OCTUPLE_COMPRESSED_COBBLESTONE.get());

            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                    .add(ModBlocks.MIMICARIUM_ORE.get())
                    .add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE.get())
                    .add(ModBlocks.VOIDSTONE.get())
                    .add(ModBlocks.FAKESTONE_GOLD_ORE.get())
                    .add(ModBlocks.FAKESLATE_GOLD_ORE.get())
                    .add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME.get());

            getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                    .add(ModBlocks.DREADSTONE_NETHERITE_ORE.get())
                    .add(ModBlocks.DREADSTONE.get())
                    .add(ModBlocks.DREADSTONE_DIAMOND_ORE.get())
                    .add(ModBlocks.THUNDERANIUM_PORTAL_FRAME.get());

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                    .add(ModBlocks.VOID_COAL_ORE.get())
                    .add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE.get())
                    .add(ModBlocks.THUNDERANIUM_TNT.get())
                    .add(ModBlocks.VOID_COAL_BLOCK.get());

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                    .add(ModBlocks.THUNDERANIUM_ORE.get())
                    .add(ModBlocks.RED_THUNDERANIUM_TNT.get())
                    .add(ModBlocks.RENDERIUM_ORE.get());

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_6")))
                    .add(ModBlocks.CORRUPTINITE_ORE.get())
                    .add(ModBlocks.DENDERIUM_ORE.get())
                    .add(ModBlocks.CORRUPTION_PORTAL_FRAME.get())
                    .add(ModBlocks.CORRUPTION_BLOCK.get())
                    .addTag(ModBlockTags.REINFORCED_DREADSTONE);

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_10")))
                    .add(ModBlocks.AXON_ALLOY_TNT.get())
                    .add(ModBlocks.TLDC_ORE.get())
                    .add(ModBlocks.MWDC_ORE.get())
                    .add(ModBlocks.CLDC_ORE.get())
                    .add(ModBlocks.DCDC_ORE.get());

            getOrCreateTagBuilder(BlockTags.WALLS)
                    .add(ModBlocks.REINFORCED_DREADSTONE_WALL.get());

            getOrCreateTagBuilder(BlockTags.DIRT)
                    .add(ModBlocks.CHARGED_DIRT.get())
                    .add(ModBlocks.CORRUPTED_DIRT.get());

            getOrCreateTagBuilder(BlockTags.LOGS)
                    .add(ModBlocks.THUNDERED_LOG.get())
                    .add(ModBlocks.THUNDERED_WOOD.get())
                    .add(ModBlocks.STRIPPED_THUNDERED_LOG.get())
                    .add(ModBlocks.STRIPPED_THUNDERED_WOOD.get());

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologiesConstants.MOD_ID, "reinforced_dreadstone")))
                    .add(ModBlocks.REINFORCED_DREADSTONE.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_DOOR.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_GLASS.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_SLAB.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_WALL.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR.get())
                    .add(ModBlocks.REINFORCED_DREADSTONE_STAIRS.get());

            getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
                    .addTag(ModBlockTags.REINFORCED_DREADSTONE);

            getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
                    .addTag(ModBlockTags.REINFORCED_DREADSTONE);

            getOrCreateTagBuilder(ModBlockTags.CORRUPTION)
                    .add(ModBlocks.CORRUPTION_BLOCK.get())
                    .add(ModBlocks.CORRUPTED_DIRT.get())
                    .add(ModBlocks.CORRUPTED_STONE.get())
                    .add(ModBlocks.CORRUPTINITE_ORE.get())
                    .add(ModBlocks.DENDERIUM_ORE.get())
                    .add(ModBlocks.CLDC_ORE.get());

        }
    }