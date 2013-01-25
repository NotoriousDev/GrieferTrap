package com.notoriousdev.griefertrap;

import org.bukkit.plugin.java.JavaPlugin;

public class GrieferTrap extends JavaPlugin
{

    private static GrieferTrap instance;

    @Override
    public void onDisable()
    {
        instance = null;
        /* Disable features of the plugin */
    }

    @Override
    public void onEnable()
    {
        instance = this;
        /* Register features of the plugin */
    }
    
    public static GrieferTrap getInstance() {
        return instance;
    }
}