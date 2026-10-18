package net.stickmanm.axontechnologies;

import net.stickmanm.axontechnologies.item.ModFuels;
import net.stickmanm.axontechnologies.item.ModItemGroup;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class AxonTechnologies {
	public static final String MOD_ID = AxonTechnologiesConstants.MOD_ID;
	public static final Logger LOGGER = LoggerFactory.getLogger("axontechnologies");

	public static void init() {
		ModFuels.registerModFuels();
		ModItemGroup.initItemGroups();
		LOGGER.info("Axon Technologies initialized!");
	}
}