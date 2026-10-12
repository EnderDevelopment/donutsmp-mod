package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class AutoEat {
    public static void eat(PlayerEntity player) {
        // Implement AutoEat logic here
        MinecraftClient.getInstance().player.sendMessage("AutoEat activated", false);
    }
}