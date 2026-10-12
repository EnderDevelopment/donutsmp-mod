package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.util.math.MatrixStack;

public class CoordsHUD {
    public static void render(MatrixStack matrices, DrawContext context) {
        // Implement CoordsHUD rendering logic here
        MinecraftClient client = MinecraftClient.getInstance();
        if (client.player != null) {
            String coords = String.format("X: %.1f, Y: %.1f, Z: %.1f", client.player.getX(), client.player.getY(), client.player.getZ());
            context.drawTextWithShadow(client.textRenderer, coords, 10, 10, 0xFFFFFF);
        }
    }
}