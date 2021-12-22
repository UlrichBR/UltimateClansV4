package me.ulrich.clans.packets.interfaces;

import java.util.List;

import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarFlag;
import org.bukkit.boss.BarStyle;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanEnum.BarActions;

public interface BossBarAPI {

	void customBossBar(Player player, BarColor barcolor, BarStyle barstyle, List<BarFlag> flags, String message,
			int seconds, boolean animated, List<String> data);

	void startBossBar(Player player, BarActions action, List<String> data);

}
