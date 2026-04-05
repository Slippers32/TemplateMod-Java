package ru.joutak.mod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModCheckerMain implements ModInitializer {

    public static final String MOD_ID = "mod-checker";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    private static ModCheckerMain instance;

    public static ModCheckerMain getInstance() {
        return instance;
    }

    @Override
    public void onInitialize() {
        instance = this;
        LOGGER.info("Mod {} initialized!", MOD_ID);
    }
}
