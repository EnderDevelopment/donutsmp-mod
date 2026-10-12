package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;

public class ElytraBoost {
    public static void boost(PlayerEntity player, float multiplier) {
        // Implement ElytraBoost logic here
        player.setVelocity(player.getVelocity().multiply(multiplier));
        MinecraftClient.getInstance().player.sendMessage("Elytra boosted with multiplier: " + multiplier, false);
    }
}