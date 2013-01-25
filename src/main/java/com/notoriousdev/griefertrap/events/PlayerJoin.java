package com.notoriousdev.griefertrap.events;

import com.notoriousdev.griefertrap.GrieferTrap;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoin implements Listener
{

    private final GrieferTrap plugin;

    public PlayerJoin(GrieferTrap plugin)
    {
        this.plugin = plugin;
    }

    /* Whilst these methods are empty, they are purely placeholders. When code is added, they will be put together as necessary. */
    @EventHandler
    public void logPlayerJoin(PlayerJoinEvent event)
    {
    }

    @EventHandler
    public void deopOpForcers(PlayerJoinEvent event)
    {
    }

    @EventHandler
    public void sendMessages(PlayerJoinEvent event)
    {
    }
}
