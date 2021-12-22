package me.ulrich.clans.data;

public class SettingsData {

	private boolean warInvite;
	private boolean allySharedChat;
	private boolean joinLeave;
	private boolean allySharedHome;

	public SettingsData(boolean warInvite, boolean allySharedChat, boolean joinLeave, boolean allySharedHome) {
		this.setWarInvite(warInvite);
		this.setAllySharedChat(allySharedChat);
		this.setJoinLeave(joinLeave);
		this.setAllySharedHome(allySharedHome);
	}

	public boolean isWarInvite() {
		return warInvite;
	}

	public void setWarInvite(boolean warInvite) {
		this.warInvite = warInvite;
	}

	public boolean isAllySharedChat() {
		return allySharedChat;
	}

	public void setAllySharedChat(boolean allySharedChat) {
		this.allySharedChat = allySharedChat;
	}

	public boolean isJoinLeave() {
		return joinLeave;
	}

	public void setJoinLeave(boolean joinLeave) {
		this.joinLeave = joinLeave;
	}

	public boolean isAllySharedHome() {
		return allySharedHome;
	}

	public void setAllySharedHome(boolean allySharedHome) {
		this.allySharedHome = allySharedHome;
	}
}
