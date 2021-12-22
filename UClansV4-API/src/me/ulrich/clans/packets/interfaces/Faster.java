package me.ulrich.clans.packets.interfaces;

import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.command.SimpleCommandMap;

import me.ulrich.clans.Clans;

public interface Faster {

	boolean setBlock(Block b, Material material, boolean applyPhysics);

	boolean fastSetSpawner(Block block, int delay);

	String fastGetSpawner(Block block);

	SimpleCommandMap getSimpleCommandMap();

	SimpleCommandMap getSimpleCommandMap(Clans plugin);

}
