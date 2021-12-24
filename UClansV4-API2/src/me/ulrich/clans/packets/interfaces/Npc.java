package me.ulrich.clans.packets.interfaces;

import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.entity.Entity;

public interface Npc {

	

	void removeAllRegistred();

	boolean deSpawnRegistred(Entity registred);

	void onDisable();

	boolean hasRegistred(Entity villager);

	List<UUID> getRegstredUUIDNpc();

	Entity spawnEnderCrystal(Location location, String name);

	List<Entity> getRegstredNpc();


	

	
	}
