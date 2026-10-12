package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CoordLogger {
    public static void log(World world, BlockPos pos) {
        // Implement CoordLogger logic here
        MinecraftClient.getInstance().player.sendMessage("Logged coordinates: " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ(), false);
    }
}