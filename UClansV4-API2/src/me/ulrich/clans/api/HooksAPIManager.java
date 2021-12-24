package me.ulrich.clans.api;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.packets.interfaces.HooksAPI;

public class HooksAPIManager implements HooksAPI {

	private Clans plugin;

	public HooksAPIManager(Clans plugin) {
		this.plugin = plugin;
	}

	@Override
	public boolean isInDuel(Player player) {
		return false;
	}

	@Override
	public Player getEnemyCombat(Player player) {
		return null;
	}

	@Override
	public boolean removeCombat(Player player) {
		return false;
	}

	@Override
	public boolean isInCombat(Player player) {
		return false;
	}


	
}
