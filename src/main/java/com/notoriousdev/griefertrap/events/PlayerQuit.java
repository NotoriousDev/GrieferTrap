package com.notoriousdev.griefertrap.events;

import com.notoriousdev.griefertrap.GrieferTrap;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

public class PlayerQuit implements Listener
{

    private final GrieferTrap plugin;

    public PlayerQuit(GrieferTrap plugin)
    {
        this.plugin = plugin;
    }

    /* Whilst these methods are empty, they are purely placeholders. When code is added, they will be put together as necessary. */
    @EventHandler
    public void notifyOps(PlayerQuitEvent event)
    {
    }

    @EventHandler
    public void sendMessages(PlayerQuitEvent event)
    {
    }
}
