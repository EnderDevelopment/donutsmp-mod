package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class ChestStealer {
    public static void steal(PlayerEntity player) {
        // Implement ChestStealer logic here
        MinecraftClient.getInstance().player.sendMessage("ChestStealer activated", false);
    }
}