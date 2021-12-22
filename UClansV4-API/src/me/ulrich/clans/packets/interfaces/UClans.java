package me.ulrich.clans.packets.interfaces;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.MoneyAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;

public interface UClans {

	JavaPlugin getPlugin();

	ClanAPIManager getClanAPI();

	PlayerAPIManager getPlayerAPI();
	
	MoneyAPIManager getMoneyAPI();
	
	HooksAPIManager getHooksAPI();
	
	BossBarAPIManager getBossBarAPI();

}
