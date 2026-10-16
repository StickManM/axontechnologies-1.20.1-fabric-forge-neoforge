package net.stickmanm.fabric;

import net.fabricmc.api.ModInitializer;

import net.stickmanm.axontechnologies.block.ModBlockTags;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.block.ModStrippableBlockRegistry;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.item.ModFuels;
import net.stickmanm.axontechnologies.item.ModItemGroup;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.util.ModLootTableModifiers;
import net.stickmanm.axontechnologies.world.biome.ModBiomes;
import net.stickmanm.axontechnologies.world.dimension.ModDimensions;
import net.stickmanm.axontechnologies.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AxonTechnologiesFabric implements ModInitializer {
	public static final String MOD_ID = "axontechnologies";
	public static final Logger LOGGER = LoggerFactory.getLogger("axontechnologies");


	@Override
	public void onInitialize() {
		ModItemGroup.registerItemGroups();
		ModFluids.register();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModLootTableModifiers.modifyLootTables();
		ModBlockTags.registerModTags();
		ModWorldGeneration.generateModWorldGen();


		ModStrippableBlockRegistry.registerStrippableBlocks();

		ModDimensions.registerModDimensions();
		ModBiomes.registerModBiomes();

		ModEffects.registerModEffects();

		ModFuels.registerModFuels();

		ModEntities.registerModEntities();


	}
}