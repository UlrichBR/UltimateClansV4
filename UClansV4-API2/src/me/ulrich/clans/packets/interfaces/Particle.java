package me.ulrich.clans.packets.interfaces;

import org.bukkit.Location;
import org.bukkit.entity.Player;

public interface Particle {
   void displayParticle(Player var1, Location var2, float var3, float var4, float var5, int var6, String var7, int var8);

   void broadcastParticle(Location var1, float var2, float var3, float var4, int var5, String var6, int var7);
}
