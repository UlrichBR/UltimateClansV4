package me.ulrich.clans.data;

import org.bukkit.Location;

import me.ulrich.clans.data.ClanEnum.PlaceholderTop;

public class HoloData {

	private String id;
	private Location location;
	private PlaceholderTop type;

	public HoloData(String id, Location location, PlaceholderTop type) {
		this.setId(id);
		this.setLocation(location);
		this.setType(type);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public PlaceholderTop getType() {
		return type;
	}

	public void setType(PlaceholderTop type) {
		this.type = type;
	}
}
