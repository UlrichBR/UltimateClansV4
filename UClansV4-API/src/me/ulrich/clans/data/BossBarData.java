package me.ulrich.clans.data;

import java.util.List;

import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanEnum.BarActions;

public class BossBarData {

	private List<Player> sender;
	private BarActions type;
	private BossBar bossbar;

	public BossBarData(List<Player> sender, BarActions type, BossBar bossbar) {
		this.setSender(sender);
		this.setType(type);
		this.setBossbar(bossbar);
	}

	

	public BarActions getType() {
		return type;
	}

	public void setType(BarActions type) {
		this.type = type;
	}



	public List<Player> getSender() {
		return sender;
	}



	public void setSender(List<Player> sender) {
		this.sender = sender;
	}



	public BossBar getBossbar() {
		return bossbar;
	}



	public void setBossbar(BossBar bossbar) {
		this.bossbar = bossbar;
	}
}
