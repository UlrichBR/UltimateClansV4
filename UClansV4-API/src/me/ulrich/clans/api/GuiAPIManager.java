package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;

import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.GuiData;
import me.ulrich.clans.packets.interfaces.GuiAPI;

public class GuiAPIManager implements GuiAPI {

	private Clans plugin;
	
	public GuiAPIManager(Clans clans) {
		this.plugin = clans;
	}
	
	@Override
	public HashMap<String, GuiData> getInsertGui() {
		return null;
	}
	
	@Override
	public List<Player> getOpenedGuiPlayers() {
		return null;
	}
	
	@Override
	public void closeAllOpened() {}
}
