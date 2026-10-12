package com.hnakao82.donutsmpmod.features;

import net.minecraft.client.MinecraftClient;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WaypointExport {
    public static void export(World world, BlockPos pos) {
        // Implement WaypointExport logic here
        MinecraftClient.getInstance().player.sendMessage("Exported waypoint: " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ(), false);
    }
}