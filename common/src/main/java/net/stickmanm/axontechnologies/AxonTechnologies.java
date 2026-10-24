package net.stickmanm.axontechnologies;

import net.stickmanm.axontechnologies.entity.ModEntities;
import net.stickmanm.axontechnologies.event.ModRespawnHandler;
import net.stickmanm.axontechnologies.item.ModFuels;
import net.stickmanm.axontechnologies.item.ModItemGroup;
import net.stickmanm.axontechnologies.world.sync.CorruptionlandsMirror;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AxonTechnologies {
	public static final String MOD_ID = AxonTechnologiesConstants.MOD_ID;
	public static final Logger LOGGER = LoggerFactory.getLogger("axontechnologies");

	public static void init() {
		ModFuels.registerModFuels();
		ModEntities.registerModEntities();
		ModItemGroup.initItemGroups();
		ModRespawnHandler.register();
		CorruptionlandsMirror.register();
		LOGGER.info("Axon Technologies initialized!");
	}
}