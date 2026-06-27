package com.waveclient.combat;

import com.waveclient.Module;
import net.minecraft.client.MinecraftClient;
import net.minecraft.item.Items;

public class AutoTotem extends Module {
    public AutoTotem() {
        super("AutoTotem", "Auto Totem for PvP");
    }

    @Override
    public void onTick() {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player != null && mc.player.getHealth() <= 8.0f) {
            System.out.println("Wave AutoTotem Activated!");
        }
    }
}