package me.ulrich.clans.data;

import java.util.UUID;

public class Invites {

	private UUID inviter;
	private UUID invited;
	private UUID clanId;
	private Long expires;

	public Invites(UUID inviter, UUID invited, UUID clanId, Long expires) {
		this.setInviter(inviter);
		this.setInvited(invited);
		this.setClanId(clanId);
		this.setExpires(expires);
	}

	public UUID getInviter() {
		return inviter;
	}

	public void setInviter(UUID inviter) {
		this.inviter = inviter;
	}

	public UUID getInvited() {
		return invited;
	}

	public void setInvited(UUID invited) {
		this.invited = invited;
	}

	public UUID getClanId() {
		return clanId;
	}

	public void setClanId(UUID clanId) {
		this.clanId = clanId;
	}

	public Long getExpires() {
		return expires;
	}

	public void setExpires(Long expires) {
		this.expires = expires;
	}
}
