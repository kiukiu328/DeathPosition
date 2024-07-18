package com.asuscomm.kiu0328.DeathPosition;

import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        //getLogger().info("Hello, SpigotMC!");
        getServer().getPluginManager().registerEvents(new PlayerDeathListener(), this);
    }

    @Override
    public void onDisable() {
        //getLogger().info("See you again, SpigotMC!");
    }
}
