package ru.joutak.mod.client;

import net.fabricmc.api.ClientModInitializer;
import ru.joutak.mod.ModCheckerMain;

public class ModCheckerClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModCheckerMain.LOGGER.info("Client side of mod {} initialized!", ModCheckerMain.MOD_ID);
    }
}
