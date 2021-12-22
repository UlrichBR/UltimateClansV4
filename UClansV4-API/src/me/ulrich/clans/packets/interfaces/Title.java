package me.ulrich.clans.packets.interfaces;

import org.bukkit.entity.Player;

public interface Title {
	   void sendTitle(Player var1, String var2, int var3, int var4, int var5);

	   void sendSubTitle(Player var1, String var2, int var3, int var4, int var5);

	   void sendTitleSubTitle(Player var1, String var2, String var3, int var4, int var5, int var6);
	}