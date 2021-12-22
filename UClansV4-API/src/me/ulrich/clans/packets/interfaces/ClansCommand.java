package me.ulrich.clans.packets.interfaces;

import java.util.EnumMap;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;

import me.ulrich.clans.Clans;

public interface ClansCommand {

    boolean execute(final Clans plugin, final CommandSender sender, final Command command, final String label, String[] args, EnumMap<me.ulrich.clans.data.Flag, String> info);

}
