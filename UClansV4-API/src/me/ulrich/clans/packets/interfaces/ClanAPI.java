package me.ulrich.clans.packets.interfaces;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.ClanActions;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.ClanEnum.RivalAllyCount;
import me.ulrich.clans.data.ClanEnum.RivalRemoveReturn;
import me.ulrich.clans.data.CommandData;
import me.ulrich.clans.data.CommandData_show;
import me.ulrich.clans.data.HomesData;

public interface ClanAPI {
		
	HashMap<String, CommandData> getClanCommander();

	HashMap<String, CommandData> getUClanCommander();

	void reloadClanData(UUID uuid);

	void updateClanData(ClanData clan);

	void unRegisterCommand(String command);

	void insertCommand(String command, String permission, String alias, int cooldown, CommandData_show data);

	boolean tagExists(String tag);

	boolean isRival(UUID player1, UUID player2);

	boolean isAlly(UUID player1, UUID player2);

	boolean promotePlayer(UUID clanUUID, UUID promoted);

	boolean demotePlayer(UUID clanUUID, UUID demoted);

	boolean kickPlayer(UUID clanUUID, UUID kicked);

	boolean changeLeader(UUID clanUUID, UUID newleader);

	boolean leaveClan(UUID player);

	boolean modDesc(ClanData clanData, String newDescription, Player sender);

	boolean modTag(ClanData clanData, String newTag, Player sender);

	boolean toggleGlobalFF(CommandSender player);

	boolean toggleGlobalFF(Player player);

	boolean toggleFF(ClanData clanData);

	boolean isLeader(UUID player);

	boolean isMod(UUID uuid);

	boolean deleteHome(UUID clanUUID, String homeName);

	boolean setHome(UUID player, Location location, String name);

	boolean hasHome(UUID player, String homeName);

	Location getHome(UUID player, String homeName);

	HomesData getHomeData(UUID player, String homeName);

	boolean deleteClan(UUID clanUUID);

	boolean deletePlayerClan(UUID player);

	ClanData createNewClan(Player player, String tag, String desc);

	boolean clanExists(UUID clanUUID);

	ClanData getClan(UUID clanUUID);

	HashMap<UUID, Float> getTopClans(PlaceholderTop checktype);

	boolean resetClanKDR(ClanData clanKDR, CommandSender sender);

	boolean addExtraChest(UUID clanUUID, int amount, CommandSender sender);

	boolean addSlot(String tag, int amount, CommandSender sender);

	boolean removeSlot(String tag, int amount, CommandSender sender);

	boolean setSlot(String tag, int amount, CommandSender sender);

	boolean addPoint(UUID clanid, int amount, CommandSender sender);

	boolean removePoint(String tag, int amount, CommandSender sender);

	boolean setPoint(String tag, int amount, CommandSender sender);

	int getPointsNextLevel(ClanData clanData);

	void checkClanLevelUp(ClanData clanData, CommandSender player);

	int slotsCount(ClanData clanData);

	int allyRivalCount(ClanData clanData, RivalAllyCount type);

	boolean hasClanModerationOnline(UUID clanUUID);

	String parseText(UUID player, String text);

	boolean hasAddonEnabled(String addonName);

	HashMap<UUID, ClanData> getClanData();

	List<Player> getChatspy();

	boolean isGlobalFF();
	
	List<String> getProxieds();

	RivalRemoveReturn rivalRemoveSend(UUID clanUUID1, UUID clanUUID2, boolean mult);

	void clanChatSendOffline(UUID sender, String message);

	void clanMessageSend(UUID id, String text);

	UUID getClanByTag(String tag);

	void check_actions(ClanActions action, UUID clanid);

	List<ClanData> getRivalries(UUID clanUUID);

	List<ClanData> getAlliances(UUID clanUUID);

	


}