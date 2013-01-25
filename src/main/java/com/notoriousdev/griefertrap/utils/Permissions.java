package com.notoriousdev.griefertrap.utils;

import org.bukkit.command.CommandSender;

public enum Permissions
{

    /* GreiferTrap Commands */
    COMMAND_GRIEFERTRAP,
    /* Bukkit Commands */
    COMMAND_BUKKIT_HELP,
    /* Vanilla Commands */
    COMMAND_VANILLA_TP,
    /* Messages */
    BYPASS_HIDEPLUGIN;

    public boolean isAuthorised(CommandSender sender)
    {
        return sender.hasPermission(this.toString());
    }

    @Override
    public String toString()
    {
        return "griefertrap." + this.name().toLowerCase().replace("_", ".");
    }
}
