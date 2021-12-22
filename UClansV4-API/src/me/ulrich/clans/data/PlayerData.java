package me.ulrich.clans.data;

import java.util.UUID;

public class PlayerData {

	private UUID id;
	private String name;
	private UUID uuid;
	private UUID clan_id;
	private int kills;
	private int deaths;
	private int souls;
	private double kdr;
	private long joinDate;
	private long lastSeen;
	private String cache;


	public PlayerData(UUID id, String name, UUID uuid, UUID clan_id, int kills, int deaths, int souls, double kdr, long joinDate, long lastSeen, String cache) {
		this.setId(id);
		this.setName(name);
		this.setUuid(uuid);
		this.setClan_id(clan_id);
		this.setKills(kills);
		this.setDeaths(deaths);
		this.setSouls(souls);
		this.setKdr(kdr);
		this.setJoinDate(joinDate);
		this.setLastSeen(lastSeen);
		this.setCache(cache);
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public UUID getClan_id() {
		return clan_id;
	}

	public void setClan_id(UUID clan_id) {
		this.clan_id = clan_id;
	}

	public int getKills() {
		return kills;
	}

	public void setKills(int kills) {
		this.kills = kills;
	}

	public int getDeaths() {
		return deaths;
	}

	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}

	public int getSouls() {
		return souls;
	}

	public void setSouls(int souls) {
		this.souls = souls;
	}

	public double getKdr() {
		return kdr;
	}

	public void setKdr(double kdr) {
		this.kdr = kdr;
	}

	public long getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(long joinDate) {
		this.joinDate = joinDate;
	}

	public long getLastSeen() {
		return lastSeen;
	}

	public void setLastSeen(long lastSeen) {
		this.lastSeen = lastSeen;
	}

	public String getCache() {
		return cache;
	}

	public void setCache(String cache) {
		this.cache = cache;
	}


}
