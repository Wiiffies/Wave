package com.waveclient;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;

public class WaveClient implements ClientModInitializer {
    public static ModuleManager modules;

    @Override
    public void onInitializeClient() {
        modules = new ModuleManager();
        System.out.println("Wave Loaded - AutoTotem Ready for 1.21.1 PvP!");
    }
}