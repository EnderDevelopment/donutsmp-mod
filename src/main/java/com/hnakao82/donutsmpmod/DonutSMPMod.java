package com.hnakao82.donutsmpmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DonutSMPMod implements ModInitializer {
    public static final String MOD_ID = "donutsmpmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing DonutSMPMod");
        // Initialize your mod here
    }

    public void onEnable() {
        LOGGER.info("Enabling DonutSMPMod");
        // Enable your mod here
    }

    public void onDisable() {
        LOGGER.info("Disabling DonutSMPMod");
        // Disable your mod here
    }

    public void onStop() {
        LOGGER.info("Stopping DonutSMPMod");
        // Stop your mod here
    }
}