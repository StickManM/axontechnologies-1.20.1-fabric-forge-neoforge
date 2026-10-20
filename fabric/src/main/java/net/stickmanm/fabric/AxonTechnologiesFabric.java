package net.stickmanm.fabric;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.stickmanm.axontechnologies.AxonTechnologies;
import net.stickmanm.axontechnologies.AxonTechnologiesConstants;
import net.stickmanm.axontechnologies.block.ModBlocks;
import net.stickmanm.axontechnologies.effect.ModEffects;
import net.stickmanm.axontechnologies.item.ModFuels;
import net.stickmanm.axontechnologies.world.dimension.ModDimensions;
import net.stickmanm.fabric.block.ModStrippableBlockRegistry;
import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.entity.custom.DarkEssenceZombieEntity;
import net.stickmanm.axontechnologies.entity.custom.GeneticallyModifiedRedEssenceZombieEntity;
import net.stickmanm.axontechnologies.entity.custom.LostMinerEntity;
import net.stickmanm.axontechnologies.entity.custom.RedEssenceZombieEntity;
import net.stickmanm.axontechnologies.fluid.ModFluids;
import net.stickmanm.axontechnologies.item.ModItems;
import net.stickmanm.axontechnologies.util.ModPotions;
import net.stickmanm.fabric.util.ModLootTableModifiers;
import net.stickmanm.fabric.world.ModPortalsFabric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class AxonTechnologiesFabric implements ModInitializer {
	public static final String MOD_ID = AxonTechnologiesConstants.MOD_ID;
	public static final Logger LOGGER = LoggerFactory.getLogger("axontechnologies");


	@Override
	public void onInitialize() {
		// Register Architectury deferred registers
		ModBlocks.BLOCKS.register();
		ModEntities.ENTITIES.register();
		ModFluids.FLUIDS.register();
		ModFluids.FLUID_BLOCKS.register();
		ModItems.ITEMS.register();
		//ModFuels.registerModFuels();
		ModEffects.EFFECTS.register();
		ModPotions.POTIONS.register();
		ModLootTableModifiers.modifyLootTables();

		// Call common initialization
		AxonTechnologies.init();

		// Fabric-specific registrations
		ModStrippableBlockRegistry.registerStrippableBlocks();


		// Register Portals
		ModPortalsFabric.registerModPortalsFabric();
	}
}