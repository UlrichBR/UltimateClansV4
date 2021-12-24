package me.ulrich.clans;

import org.bukkit.plugin.java.JavaPlugin;

import me.ulrich.clans.api.BossBarAPIManager;
import me.ulrich.clans.api.ClanAPIManager;
import me.ulrich.clans.api.HooksAPIManager;
import me.ulrich.clans.api.MoneyAPIManager;
import me.ulrich.clans.api.PlayerAPIManager;
import me.ulrich.clans.packets.interfaces.UClans;

public final class Clans extends JavaPlugin implements UClans{

	private final ClanAPIManager ClanAPI;
	private final PlayerAPIManager PlayerAPI;
	private final MoneyAPIManager MoneyAPI;
	private final HooksAPIManager HooksAPI;
	private final BossBarAPIManager BossBarAPI;
	
	public Clans() {
		this.ClanAPI = new ClanAPIManager(this);
		this.PlayerAPI = new PlayerAPIManager(this);
		this.MoneyAPI = new MoneyAPIManager(this);
		this.HooksAPI = new HooksAPIManager(this);
		this.BossBarAPI = new BossBarAPIManager(this);
	}
	
	@Override
	public JavaPlugin getPlugin() {
		return null;
	}

	@Override
	public ClanAPIManager getClanAPI() {
		return null;
	}

	@Override
	public PlayerAPIManager getPlayerAPI() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MoneyAPIManager getMoneyAPI() {
		return null;
	}

	@Override
	public HooksAPIManager getHooksAPI() {
		return null;
	}

	@Override
	public BossBarAPIManager getBossBarAPI() {
		return null;
	}

}
