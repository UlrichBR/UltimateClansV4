package me.ulrich.clans.data;

import me.ulrich.clans.data.ClanEnum.EventState;

public class ArenaData {

	private String name;
	private EventState state;
	private boolean enabled;
	private String spawn2;
	private String spawn1;
	private String lobby;
	private String exit;
	private String point1;
	private String point2;

	public ArenaData(String name, EventState state, boolean enabled ,String spawn1, String spawn2, String lobby, String exit, String point1, String point2) {
		this.setName(name);
		this.setState(state);
		this.setEnabled(enabled);
		this.setSpawn1(spawn1);
		this.setSpawn2(spawn2);
		this.setLobby(lobby);
		this.setExit(exit);
		this.setPoint1(point1);
		this.setPoint2(point2);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EventState getState() {
		return state;
	}

	public void setState(EventState state) {
		this.state = state;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getSpawn2() {
		return spawn2;
	}

	public void setSpawn2(String spawn2) {
		this.spawn2 = spawn2;
	}

	public String getSpawn1() {
		return spawn1;
	}

	public void setSpawn1(String spawn1) {
		this.spawn1 = spawn1;
	}

	public String getLobby() {
		return lobby;
	}

	public void setLobby(String lobby) {
		this.lobby = lobby;
	}

	public String getExit() {
		return exit;
	}

	public void setExit(String exit) {
		this.exit = exit;
	}

	public String getPoint1() {
		return point1;
	}

	public void setPoint1(String point1) {
		this.point1 = point1;
	}

	public String getPoint2() {
		return point2;
	}

	public void setPoint2(String point2) {
		this.point2 = point2;
	}
}
