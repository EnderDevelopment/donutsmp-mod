package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SpawnerDetect {
    public static void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, World world, BlockPos pos) {
        // Implement SpawnerDetect rendering logic here
        MinecraftClient.getInstance().textRenderer.draw(matrices, "SpawnerDetect", pos.getX(), pos.getY(), pos.getZ(), 0xFFFFFF);
    }
}