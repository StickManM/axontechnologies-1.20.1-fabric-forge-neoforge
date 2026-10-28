package net.stickmanm.axontechnologies.block;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.custom.AxonAlloyTntBlock;
import net.stickmanm.axontechnologies.block.custom.CorruptionBlock;
import net.stickmanm.axontechnologies.block.custom.RedThunderaniumTntBlock;
import net.stickmanm.axontechnologies.block.custom.ThunderaniumTntBlock;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.world.tree.CorruptedSaplingGenerator;
import net.stickmanm.axontechnologies.world.tree.ThunderedSaplingGenerator;

import java.util.function.Supplier;
import java.util.function.ToIntFunction;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(AxonTechnologiesConstants.MOD_ID, RegistryKeys.BLOCK);

    //Ore
    public static final RegistrySupplier<Block> MIMICARIUM_ORE = registerBlock("mimicarium_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.GOLD_ORE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    public static final RegistrySupplier<Block> DEEPSLATE_MIMICARIUM_ORE = registerBlock("deepslate_mimicarium_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE).strength(4.0f).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    public static final RegistrySupplier<Block> FAKESTONE_IRON_ORE = registerBlock("fakestone_iron_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.IRON_ORE).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    public static final RegistrySupplier<Block> FAKESTONE_GOLD_ORE = registerBlock("fakestone_gold_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.GOLD_ORE).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    public static final RegistrySupplier<Block> FAKESLATE_IRON_ORE = registerBlock("fakeslate_iron_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.DEEPSLATE_IRON_ORE).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    public static final RegistrySupplier<Block> FAKESLATE_GOLD_ORE = registerBlock("fakeslate_gold_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.DEEPSLATE_GOLD_ORE).requiresTool(),
                    UniformIntProvider.create(3, 7)));

    //Thundered Tree
    public static final RegistrySupplier<Block> THUNDERED_LOG = registerBlock("thundered_log",
            () -> new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG).strength(2.0f)));
    public static final RegistrySupplier<Block> THUNDERED_WOOD = registerBlock("thundered_wood",
            () -> new PillarBlock(Block.Settings.copy(Blocks.OAK_WOOD).strength(2.0f)));
    public static final RegistrySupplier<Block> STRIPPED_THUNDERED_LOG = registerBlock("stripped_thundered_log",
            () -> new PillarBlock(Block.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final RegistrySupplier<Block> STRIPPED_THUNDERED_WOOD = registerBlock("stripped_thundered_wood",
            () -> new PillarBlock(Block.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));

    public static final RegistrySupplier<Block> THUNDERED_PLANKS = registerBlock("thundered_planks",
            () -> new Block(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0f)));

    public static final RegistrySupplier<Block> THUNDERED_SLAB = registerBlock("thundered_slab",
            () -> new SlabBlock(Block.Settings.copy(THUNDERED_PLANKS.get())));

    public static final RegistrySupplier<Block> THUNDERED_STAIRS = registerBlock("thundered_stairs",
            () -> new StairsBlock(THUNDERED_PLANKS.get().getDefaultState(), Block.Settings.copy(THUNDERED_PLANKS.get())));

    public static final RegistrySupplier<Block> THUNDERED_FENCE = registerBlock("thundered_fence",
            () -> new FenceBlock(Block.Settings.copy(THUNDERED_PLANKS.get())));

    public static final RegistrySupplier<Block> THUNDERED_FENCE_GATE = registerBlock("thundered_fence_gate",
            () -> new FenceGateBlock(Block.Settings.copy(THUNDERED_PLANKS.get()), WoodType.CRIMSON));

    public static final RegistrySupplier<Block> THUNDERED_DOOR = registerBlock("thundered_door",
            () -> new DoorBlock(Block.Settings.copy(THUNDERED_PLANKS.get()), BlockSetType.CRIMSON));

    public static final RegistrySupplier<Block> THUNDERED_TRAPDOOR = registerBlock("thundered_trapdoor",
            () -> new TrapdoorBlock(Block.Settings.copy(THUNDERED_PLANKS.get()), BlockSetType.CRIMSON));

    public static final RegistrySupplier<Block> THUNDERED_BUTTON = registerBlock("thundered_button",
            () -> new ButtonBlock(Block.Settings.copy(THUNDERED_PLANKS.get()), BlockSetType.CRIMSON, 30,true));

    public static final RegistrySupplier<Block> THUNDERED_PRESSURE_PLATE = registerBlock("thundered_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, Block.Settings.copy(THUNDERED_PLANKS.get()), BlockSetType.CRIMSON));


    public static final RegistrySupplier<Block> THUNDERED_LEAVES = registerBlock("thundered_leaves",
            () -> new LeavesBlock(Block.Settings.copy(Blocks.OAK_LEAVES).strength(1.0f).requiresTool()));

    public static final RegistrySupplier<Block> THUNDERED_SAPLING = registerBlock("thundered_sapling",
            () -> new SaplingBlock(new ThunderedSaplingGenerator(), Block.Settings.copy(Blocks.OAK_SAPLING)));


    //Corrupted Tree
    public static final RegistrySupplier<Block> CORRUPTED_LOG = registerBlock("corrupted_log",
            () -> new PillarBlock(Block.Settings.copy(Blocks.OAK_LOG).strength(2.0f)));
    public static final RegistrySupplier<Block> CORRUPTED_WOOD = registerBlock("corrupted_wood",
            () -> new PillarBlock(Block.Settings.copy(Blocks.OAK_WOOD).strength(2.0f)));
    public static final RegistrySupplier<Block> STRIPPED_CORRUPTED_LOG = registerBlock("stripped_corrupted_log",
            () -> new PillarBlock(Block.Settings.copy(Blocks.STRIPPED_OAK_LOG).strength(2.0f)));
    public static final RegistrySupplier<Block> STRIPPED_CORRUPTED_WOOD = registerBlock("stripped_corrupted_wood",
            () -> new PillarBlock(Block.Settings.copy(Blocks.STRIPPED_OAK_WOOD).strength(2.0f)));

    public static final RegistrySupplier<Block> CORRUPTED_PLANKS = registerBlock("corrupted_planks",
            () -> new Block(Block.Settings.copy(Blocks.OAK_PLANKS).strength(2.0f)));

    public static final RegistrySupplier<Block> CORRUPTED_SLAB = registerBlock("corrupted_slab",
            () -> new SlabBlock(Block.Settings.copy(CORRUPTED_PLANKS.get())));

    public static final RegistrySupplier<Block> CORRUPTED_STAIRS = registerBlock("corrupted_stairs",
            () -> new StairsBlock(CORRUPTED_PLANKS.get().getDefaultState(), Block.Settings.copy(THUNDERED_PLANKS.get())));

    public static final RegistrySupplier<Block> CORRUPTED_FENCE = registerBlock("corrupted_fence",
            () -> new FenceBlock(Block.Settings.copy(CORRUPTED_PLANKS.get())));

    public static final RegistrySupplier<Block> CORRUPTED_FENCE_GATE = registerBlock("corrupted_fence_gate",
            () -> new FenceGateBlock(Block.Settings.copy(CORRUPTED_PLANKS.get()), WoodType.CRIMSON));

    public static final RegistrySupplier<Block> CORRUPTED_DOOR = registerBlock("corrupted_door",
            () -> new DoorBlock(Block.Settings.copy(CORRUPTED_PLANKS.get()), BlockSetType.CRIMSON));

    public static final RegistrySupplier<Block> CORRUPTED_TRAPDOOR = registerBlock("corrupted_trapdoor",
            () -> new TrapdoorBlock(Block.Settings.copy(CORRUPTED_PLANKS.get()), BlockSetType.CRIMSON));

    public static final RegistrySupplier<Block> CORRUPTED_BUTTON = registerBlock("corrupted_button",
            () -> new ButtonBlock(Block.Settings.copy(CORRUPTED_PLANKS.get()), BlockSetType.CRIMSON, 30,true));

    public static final RegistrySupplier<Block> CORRUPTED_PRESSURE_PLATE = registerBlock("corrupted_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, Block.Settings.copy(CORRUPTED_PLANKS.get()), BlockSetType.CRIMSON));

    public static final RegistrySupplier<Block> CORRUPTED_SAPLING = registerBlock("corrupted_sapling",
            () -> new SaplingBlock(new CorruptedSaplingGenerator(), Block.Settings.copy(Blocks.OAK_SAPLING)));

    //Portal Blocks
    public static final RegistrySupplier<Block> VOIDSTONE = registerBlock("voidstone",
            () -> new Block(Block.Settings.copy(Blocks.STONE).strength(4.0f).requiresTool()));
    public static final RegistrySupplier<Block> MIMIMCARIUM_PORTAL_FRAME = registerBlock("mimicarium_portal_frame",
            () -> new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final RegistrySupplier<Block> THUNDERANIUM_PORTAL_FRAME = registerBlock("thunderanium_portal_frame",
            () -> new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(4.0f).requiresTool()));

    public static final RegistrySupplier<Block> CORRUPTION_PORTAL_FRAME = registerBlock("corruption_portal_frame",
            () -> new Block(Block.Settings.copy(Blocks.IRON_BLOCK).strength(4.2f).requiresTool()));

    //Dreadstone + Dreadstone Ores
    public static final RegistrySupplier<Block> DREADSTONE = registerBlock("dreadstone",
            () -> new Block(Block.Settings.copy(Blocks.STONE).strength(2.4f).requiresTool()));

    public static final RegistrySupplier<Block> REINFORCED_DREADSTONE = registerBlock("reinforced_dreadstone",
            () -> new Block(Block.Settings.copy(Blocks.NETHERITE_BLOCK).strength(255f, Float.MAX_VALUE).requiresTool().luminance(state -> 15).sounds(BlockSoundGroup.NETHERITE)));

    public static final RegistrySupplier<Block> REINFORCED_DREADSTONE_SLAB = registerBlock("reinforced_dreadstone_slab",
            () -> new SlabBlock(Block.Settings.copy(REINFORCED_DREADSTONE.get())));

    public static final RegistrySupplier<Block> REINFORCED_DREADSTONE_STAIRS = registerBlock("reinforced_dreadstone_stairs",
            () -> new StairsBlock(REINFORCED_DREADSTONE.get().getDefaultState(), Block.Settings.copy(REINFORCED_DREADSTONE.get())));

    public static final RegistrySupplier<Block> REINFORCED_DREADSTONE_WALL = registerBlock("reinforced_dreadstone_wall",
            () -> new WallBlock(Block.Settings.copy(REINFORCED_DREADSTONE.get())));

    public static final RegistrySupplier<Block> REINFORCED_DREADSTONE_DOOR = registerBlock("reinforced_dreadstone_door",
            () -> new DoorBlock(Block.Settings.copy(REINFORCED_DREADSTONE.get()), BlockSetType.CRIMSON));

    public static final RegistrySupplier<Block> REINFORCED_DREADSTONE_TRAPDOOR = registerBlock("reinforced_dreadstone_trapdoor",
            () -> new TrapdoorBlock(Block.Settings.copy(REINFORCED_DREADSTONE.get()), BlockSetType.CRIMSON));

    public static final RegistrySupplier<Block> REINFORCED_DREADSTONE_GLASS = registerBlock("reinforced_dreadstone_glass",
            () -> new TransparentBlock(Block.Settings.copy(REINFORCED_DREADSTONE.get()).nonOpaque().allowsSpawning((state, world, pos, entityType) -> false).solidBlock((state, world, pos) -> false).suffocates((state, world, pos) -> false).blockVision((state, world, pos) -> false)));

    public static final RegistrySupplier<Block> DREADSTONE_DIAMOND_ORE = registerBlock("dreadstone_diamond_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(2.4f).requiresTool(),
                    UniformIntProvider.create(7, 10)));

    public static final RegistrySupplier<Block> DREADSTONE_THUNDERANIUM_ORE = registerBlock("dreadstone_thunderanium_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.DEEPSLATE_DIAMOND_ORE).strength(2.4f).requiresTool(),
                    UniformIntProvider.create(10, 17)));
    public static final RegistrySupplier<Block> DREADSTONE_NETHERITE_ORE = registerBlock("dreadstone_netherite_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.ANCIENT_DEBRIS).strength(4.5f).requiresTool(),
                    UniformIntProvider.create(10, 17)));

    public static final RegistrySupplier<Block> VOID_COAL_ORE = registerBlock("void_coal_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(Blocks.COAL_ORE).strength(2.4f).requiresTool(),
                    UniformIntProvider.create(7, 10)));

    public static final RegistrySupplier<Block> VOID_COAL_BLOCK = registerBlock("void_coal_block",
            () -> new Block(Block.Settings.copy(Blocks.STONE).strength(2.4f).requiresTool()));



    //MISC
    public static final RegistrySupplier<Block> OCTUPLE_COMPRESSED_COBBLESTONE = registerBlock("octuple_compressed_cobblestone",
            () -> new Block(Block.Settings.copy(Blocks.COBBLESTONE).strength(2.1f).requiresTool()));

    //TNT
    public static final RegistrySupplier<Block> THUNDERANIUM_TNT = registerBlock("thunderanium_tnt",
            () -> new ThunderaniumTntBlock(Block.Settings.copy(Blocks.IRON_BLOCK)));

    public static final RegistrySupplier<Block> RED_THUNDERANIUM_TNT = registerBlock("red_thunderanium_tnt",
            () -> new RedThunderaniumTntBlock(Block.Settings.copy(Blocks.IRON_BLOCK)));

    public static final RegistrySupplier<Block> AXON_ALLOY_TNT = registerBlock("axon_alloy_tnt",
            () -> new AxonAlloyTntBlock(Block.Settings.copy(Blocks.IRON_BLOCK)));


    //Mimic World
    public static final RegistrySupplier<Block> FAKESTONE = registerBlock("fakestone",
            () -> new Block(Block.Settings.copy(Blocks.STONE).strength(2.1f).requiresTool()));


    public static final RegistrySupplier<Block> FAKESLATE = registerBlock("fakeslate",
            () -> new Block(Block.Settings.copy(Blocks.DEEPSLATE).strength(2.4f).requiresTool()));

    //Thunderlands
    public static final RegistrySupplier<Block> CHARGED_DIRT = registerBlock("charged_dirt",
            () -> new Block(Block.Settings.copy(Blocks.DIRT).strength(0.6f)));

    public static final RegistrySupplier<Block> THUNDERED_STONE = registerBlock("thundered_stone",
            () -> new Block(Block.Settings.copy(Blocks.STONE).strength(2.1f).requiresTool()));

    public static final RegistrySupplier<Block> THUNDERANIUM_ORE = registerBlock("thunderanium_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(THUNDERED_STONE.get()).strength(2.5f).requiresTool().luminance(state -> 10),
                    UniformIntProvider.create(15, 25)));

    public static final RegistrySupplier<Block> RENDERIUM_ORE = registerBlock("renderium_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(THUNDERED_STONE.get()).strength(2.5f).requiresTool().luminance(state -> 10),
                    UniformIntProvider.create(15, 25)));

    //Corruptionlands
    public static final RegistrySupplier<Block> CORRUPTED_DIRT = registerBlock("corrupted_dirt",
            () -> new Block(Block.Settings.copy(CHARGED_DIRT.get()).strength(0.8f)));

    public static final RegistrySupplier<Block> CORRUPTED_STONE = registerBlock("corrupted_stone",
            () -> new Block(Block.Settings.copy(THUNDERED_STONE.get()).strength(2.3f).requiresTool()));
    public static final RegistrySupplier<Block> CORRUPTION_BLOCK = registerBlock("corruption_block",
            () -> new CorruptionBlock(Block.Settings.copy(THUNDERED_STONE.get()).strength(2.3f).requiresTool()));

    public static final RegistrySupplier<Block> CORRUPTINITE_ORE = registerBlock("corruptinite_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(CORRUPTED_STONE.get()).strength(2.5f).requiresTool().luminance(state -> 10),
                    UniformIntProvider.create(20, 27)));

    public static final RegistrySupplier<Block> DENDERIUM_ORE = registerBlock("denderium_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(CORRUPTED_STONE.get()).strength(2.5f).requiresTool().luminance(state -> 10),
                    UniformIntProvider.create(15, 25)));

    //Dimension Core Ores
    public static final RegistrySupplier<Block> MWDC_ORE = registerBlock("mimic_world_dimension_core_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(FAKESLATE.get()).strength(4.5f).requiresTool().luminance(state -> 15),
                    UniformIntProvider.create(30, 37)));

    public static final RegistrySupplier<Block> DCDC_ORE = registerBlock("dread_caverns_dimension_core_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(DREADSTONE.get()).strength(4.5f).requiresTool().luminance(state -> 15),
                    UniformIntProvider.create(30, 37)));

    public static final RegistrySupplier<Block> TLDC_ORE = registerBlock("thunderlands_dimension_core_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(THUNDERED_STONE.get()).strength(4.5f).requiresTool().luminance(state -> 15),
                    UniformIntProvider.create(30, 37)));

    public static final RegistrySupplier<Block> CLDC_ORE = registerBlock("corruptionlands_dimension_core_ore",
            () -> new ExperienceDroppingBlock(Block.Settings.copy(CORRUPTED_STONE.get()).strength(4.5f).requiresTool().luminance(state -> 15),
                    UniformIntProvider.create(30, 37)));




    private static <T extends Block> RegistrySupplier<T> registerBlock(String name, Supplier<T> block) {
        RegistrySupplier<T> blockSupplier = BLOCKS.register(name, block);
        registerBlockItem(name, blockSupplier);
        return blockSupplier;
    }



    private static <T extends Block> RegistrySupplier<Item> registerBlockItem(String name, RegistrySupplier<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Settings()));
    }




    /*public static void registerModBlocks() {
        AxonTechnologies.LOGGER.info("Registering ModBlocks for " + AxonTechnologiesConstants.MOD_ID);
    }*/
}
