package me.ulrich.clans.api;

import java.util.List;

import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanEnum.BarActions;
import me.ulrich.clans.packets.interfaces.BossBarAPI;

public class BossBarAPIManager implements BossBarAPI {

	private Clans plugin;

	public BossBarAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	@Override
	public void customBossBar(Player player, BarColor barcolor, BarStyle barstyle, List<BarFlag> flags, String message, int seconds, boolean animated, List<String> data) {}

	@Override
	public void startBossBar(Player player, BarActions action, List<String> data) {}
}
