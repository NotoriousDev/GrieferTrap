package com.notoriousdev.griefertrap.utils;

import com.notoriousdev.griefertrap.GrieferTrap;
import com.notoriousdev.griefertrap.events.PlayerJoin;
import com.notoriousdev.griefertrap.events.PlayerQuit;

public class Events
{

    private static GrieferTrap plugin = GrieferTrap.getInstance();

    public static void registerEvents()
    {
        plugin.getServer().getPluginManager().registerEvents(new PlayerJoin(plugin), plugin);
        plugin.getServer().getPluginManager().registerEvents(new PlayerQuit(plugin), plugin);
    }
}
