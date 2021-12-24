package me.ulrich.clans.packets.interfaces;

import java.util.HashMap;
import java.util.UUID;

import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.InviteResponse;
import me.ulrich.clans.data.ClanEnum.MemberRoles;
import me.ulrich.clans.data.Invites;
import me.ulrich.clans.data.PlayerData;

public interface PlayerAPI {

	UUID getClanID(UUID uuid);

	boolean isSameClan(UUID player1, UUID player2);

	boolean canPVP(UUID player1, UUID player2);

	boolean hasPlayerData(UUID uuid);

	boolean hasPlayerData(Player player);

	PlayerData getPlayerData(UUID playerUUID);

	PlayerData getPlayerData(String player);

	String getPlayerRole(UUID playerUUID);

	boolean isLockedChat(Player player);

	boolean toggleChat(Player player);

	boolean isInClan(UUID clanUUID, UUID playerUUID);

	void updatePlayerSkinCache(UUID playerUUID);

	void updatePlayerSkinCache(Player player);

	InviteResponse inviteToClan(UUID clanUUID, UUID invitedUUID);

	boolean hasClan(UUID playerUUID);

	ClanData getPlayerClan(UUID playerUUID);

	boolean resetPlayerKdr(UUID playerUUID);

	void loadPlayerData(UUID playerUUID);

	void savePlayerData(PlayerData player);

	HashMap<UUID, Invites> getInvited();

	MemberRoles getEnumPlayerRole(UUID playerUUID);

	


	


	

}
