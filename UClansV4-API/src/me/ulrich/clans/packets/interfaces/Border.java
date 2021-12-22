package me.ulrich.clans.packets.interfaces;

import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Border {

	void send(Player player, Color color, double size, Location centerLocation);
	void remove(Player player);
	void sendRedTint(Player player, int warningBlocks);

}
