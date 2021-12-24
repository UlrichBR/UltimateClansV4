package me.ulrich.clans.packets.interfaces;

import org.bukkit.entity.Player;

public interface HooksAPI {

	boolean isInDuel(Player player);
	
	Player getEnemyCombat(Player player);
	
	boolean removeCombat(Player player);
	
	boolean isInCombat(Player player);
	
}
