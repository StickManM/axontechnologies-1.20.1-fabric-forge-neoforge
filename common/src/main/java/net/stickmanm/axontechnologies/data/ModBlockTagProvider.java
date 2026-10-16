package net.stickmanm.axontechnologies.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
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
                    .add(ModBlocks.MIMICARIUM_ORE)
                    .add(ModBlocks.RENDERIUM_ORE)
                    .add(ModBlocks.DENDERIUM_ORE)
                    .add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE)
                    .add(ModBlocks.FAKESLATE)
                    .add(ModBlocks.FAKESTONE)
                    .add(ModBlocks.FAKESLATE_IRON_ORE)
                    .add(ModBlocks.FAKESLATE_GOLD_ORE)
                    .add(ModBlocks.FAKESTONE_GOLD_ORE)
                    .add(ModBlocks.FAKESTONE_IRON_ORE)
                    .add(ModBlocks.DREADSTONE)
                    .add(ModBlocks.REINFORCED_DREADSTONE)
                    .add(ModBlocks.REINFORCED_DREADSTONE_DOOR)
                    .add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR)
                    .add(ModBlocks.REINFORCED_DREADSTONE_STAIRS)
                    .add(ModBlocks.REINFORCED_DREADSTONE_SLAB)
                    .add(ModBlocks.REINFORCED_DREADSTONE_WALL)
                    .add(ModBlocks.REINFORCED_DREADSTONE_GLASS)
                    .add(ModBlocks.DREADSTONE_DIAMOND_ORE)
                    .add(ModBlocks.DREADSTONE_NETHERITE_ORE)
                    .add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE)
                    .add(ModBlocks.VOID_COAL_ORE)
                    .add(ModBlocks.VOID_COAL_BLOCK)
                    .add(ModBlocks.VOIDSTONE)
                    .add(ModBlocks.OCTUPLE_COMPRESSED_COBBLESTONE)
                    .add(ModBlocks.THUNDERED_STONE)
                    .add(ModBlocks.CORRUPTION_PORTAL_FRAME)
                    .add(ModBlocks.THUNDERANIUM_PORTAL_FRAME)
                    .add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME)
                    .add(ModBlocks.THUNDERANIUM_ORE)
                    .add(ModBlocks.CORRUPTED_STONE)
                    .add(ModBlocks.CORRUPTION_BLOCK)
                    .add(ModBlocks.CORRUPTINITE_ORE)
                    .add(ModBlocks.MWDC_ORE)
                    .add(ModBlocks.DCDC_ORE)
                    .add(ModBlocks.CLDC_ORE)
                    .add(ModBlocks.TLDC_ORE)
                    .add(ModBlocks.RED_THUNDERANIUM_TNT)
                    .add(ModBlocks.THUNDERANIUM_TNT);

            getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                    .add(ModBlocks.THUNDERED_LOG)
                    .add(ModBlocks.THUNDERED_PLANKS)
                    .add(ModBlocks.THUNDERED_WOOD)
                    .add(ModBlocks.STRIPPED_THUNDERED_LOG)
                    .add(ModBlocks.STRIPPED_THUNDERED_WOOD);

            getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                    .add(ModBlocks.CHARGED_DIRT)
                    .add(ModBlocks.CORRUPTED_DIRT);

            getOrCreateTagBuilder(BlockTags.SWORD_EFFICIENT);

            getOrCreateTagBuilder(BlockTags.HOE_MINEABLE);

            getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                    .add(ModBlocks.THUNDERED_STONE)
                    .add(ModBlocks.CORRUPTED_STONE)
                    .add(ModBlocks.FAKESTONE_IRON_ORE)
                    .add(ModBlocks.FAKESLATE_IRON_ORE)
                    .add(ModBlocks.OCTUPLE_COMPRESSED_COBBLESTONE);

            getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                    .add(ModBlocks.MIMICARIUM_ORE)
                    .add(ModBlocks.DEEPSLATE_MIMICARIUM_ORE)
                    .add(ModBlocks.VOIDSTONE)
                    .add(ModBlocks.FAKESTONE_GOLD_ORE)
                    .add(ModBlocks.FAKESLATE_GOLD_ORE)
                    .add(ModBlocks.MIMIMCARIUM_PORTAL_FRAME);

            getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                    .add(ModBlocks.DREADSTONE_NETHERITE_ORE)
                    .add(ModBlocks.DREADSTONE)
                    .add(ModBlocks.DREADSTONE_DIAMOND_ORE)
                    .add(ModBlocks.THUNDERANIUM_PORTAL_FRAME);

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                    .add(ModBlocks.VOID_COAL_ORE)
                    .add(ModBlocks.DREADSTONE_THUNDERANIUM_ORE)
                    .add(ModBlocks.THUNDERANIUM_TNT)
                    .add(ModBlocks.VOID_COAL_BLOCK);

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_5")))
                    .add(ModBlocks.THUNDERANIUM_ORE)
                    .add(ModBlocks.RED_THUNDERANIUM_TNT)
                    .add(ModBlocks.RENDERIUM_ORE);

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_6")))
                    .add(ModBlocks.CORRUPTINITE_ORE)
                    .add(ModBlocks.DENDERIUM_ORE)
                    .add(ModBlocks.CORRUPTION_PORTAL_FRAME)
                    .add(ModBlocks.CORRUPTION_BLOCK)
                    .addTag(ModBlockTags.REINFORCED_DREADSTONE);

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_10")))
                    .add(ModBlocks.AXON_ALLOY_TNT)
                    .add(ModBlocks.TLDC_ORE)
                    .add(ModBlocks.MWDC_ORE)
                    .add(ModBlocks.CLDC_ORE)
                    .add(ModBlocks.DCDC_ORE);

            getOrCreateTagBuilder(BlockTags.WALLS)
                    .add(ModBlocks.REINFORCED_DREADSTONE_WALL);

            getOrCreateTagBuilder(BlockTags.DIRT)
                    .add(ModBlocks.CHARGED_DIRT)
                    .add(ModBlocks.CORRUPTED_DIRT);

            getOrCreateTagBuilder(BlockTags.LOGS)
                    .add(ModBlocks.THUNDERED_LOG)
                    .add(ModBlocks.THUNDERED_WOOD)
                    .add(ModBlocks.STRIPPED_THUNDERED_LOG)
                    .add(ModBlocks.STRIPPED_THUNDERED_WOOD);

            getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier(AxonTechnologies.MOD_ID, "reinforced_dreadstone")))
                    .add(ModBlocks.REINFORCED_DREADSTONE)
                    .add(ModBlocks.REINFORCED_DREADSTONE_DOOR)
                    .add(ModBlocks.REINFORCED_DREADSTONE_GLASS)
                    .add(ModBlocks.REINFORCED_DREADSTONE_SLAB)
                    .add(ModBlocks.REINFORCED_DREADSTONE_WALL)
                    .add(ModBlocks.REINFORCED_DREADSTONE_TRAPDOOR)
                    .add(ModBlocks.REINFORCED_DREADSTONE_STAIRS);

            getOrCreateTagBuilder(BlockTags.WITHER_IMMUNE)
                    .addTag(ModBlockTags.REINFORCED_DREADSTONE);

            getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
                    .addTag(ModBlockTags.REINFORCED_DREADSTONE);

            getOrCreateTagBuilder(ModBlockTags.CORRUPTION)
                    .add(ModBlocks.CORRUPTION_BLOCK)
                    .add(ModBlocks.CORRUPTED_DIRT)
                    .add(ModBlocks.CORRUPTED_STONE)
                    .add(ModBlocks.CORRUPTINITE_ORE)
                    .add(ModBlocks.DENDERIUM_ORE)
                    .add(ModBlocks.CLDC_ORE);

        }
    }