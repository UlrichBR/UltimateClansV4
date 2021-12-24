package me.ulrich.clans.data;

import java.util.UUID;

public class InUseData {

	private UUID clanId;
	private boolean iseUse;
	private String player;

	public InUseData(UUID clanId, boolean inUse, String player) {
		this.setClanId(clanId);
		this.setIseUse(inUse);
		this.setPlayer(player);
	}

	public UUID getClanId() {
		return clanId;
	}

	public void setClanId(UUID clanId) {
		this.clanId = clanId;
	}

	public boolean isIseUse() {
		return iseUse;
	}

	public void setIseUse(boolean iseUse) {
		this.iseUse = iseUse;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}
}
