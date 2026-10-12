package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class EasyPlace {
    public static void place(World world, BlockPos pos) {
        // Implement EasyPlace logic here
        MinecraftClient.getInstance().player.sendMessage("Placed block at: " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ(), false);
    }
}