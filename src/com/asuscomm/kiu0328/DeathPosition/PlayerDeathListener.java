package com.asuscomm.kiu0328.DeathPosition;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;

public class PlayerDeathListener implements Listener {
    @EventHandler
    public void onPlayerDeath(PlayerDeathEvent event) {
        Location deathLocation = event.getEntity().getLocation();
        World world = deathLocation.getWorld();
        String worldName = world.getName();
        int x = (int) deathLocation.getX();
        int y = (int) deathLocation.getY();
        int z = (int) deathLocation.getZ();
        Bukkit.broadcastMessage(event.getEntity().getName() + " died at " + worldName + " " + x + " " + y + " " + z);
    }
}
