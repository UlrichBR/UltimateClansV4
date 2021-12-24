package me.ulrich.clans.api;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.ulrich.clans.Clans;
import me.ulrich.clans.data.ClanData;
import me.ulrich.clans.data.ClanEnum.ClanActions;
import me.ulrich.clans.data.ClanEnum.PlaceholderTop;
import me.ulrich.clans.data.ClanEnum.RivalAllyCount;
import me.ulrich.clans.data.ClanEnum.RivalRemoveReturn;
import me.ulrich.clans.data.CommandData;
import me.ulrich.clans.data.CommandData_show;
import me.ulrich.clans.data.HomesData;
import me.ulrich.clans.packets.interfaces.ClanAPI;

public class ClanAPIManager implements ClanAPI {
	
	private Clans plugin;

	public ClanAPIManager(Clans plugin) {
		this.plugin = plugin;
	}

	@Override
	public void check_actions(ClanActions action, UUID clanid) {}
	@Override
	public UUID getClanByTag(String tag) {
		return null;
	}
	
	@Override
	public HashMap<String, CommandData> getClanCommander() {
		return null;
	}

	@Override
	public HashMap<String, CommandData> getUClanCommander() {
		return null;
	}

	@Override
	public List<String> getProxieds() {
		return null;
	}
	
	@Override
	public void reloadClanData(UUID uuid) {}

	@Override
	public void updateClanData(ClanData clan) {}

	@Override
	public void unRegisterCommand(String command) {}

	@Override
	public void insertCommand(String command, String permission, String alias, int cooldown,
			CommandData_show data) {}

	@Override
	public boolean tagExists(String tag) {
		return false;
	}

	@Override
	public boolean isRival(UUID player1, UUID player2) {
		return false;
	}

	@Override
	public boolean isAlly(UUID player1, UUID player2) {
		return false;
	}

	@Override
	public boolean promotePlayer(UUID clanUUID, UUID promoted) {
		
		return false;
	}
	
	@Override
	public RivalRemoveReturn rivalRemoveSend(UUID clanUUID1, UUID clanUUID2, boolean mult) {
		return null;
	}

	@Override
	public void clanChatSendOffline(UUID sender, String message) {}
	

	@Override
	public void clanMessageSend(UUID id, String text) {}
	

	@Override
	public boolean demotePlayer(UUID clanUUID, UUID demoted) {
		return false;
	}

	@Override
	public boolean kickPlayer(UUID clanUUID, UUID kicked) {
		return false;
	}

	@Override
	public boolean changeLeader(UUID clanUUID, UUID newleader) {
		return false;
	}

	@Override
	public boolean leaveClan(UUID player) {
		return false;
	}

	@Override
	public boolean modDesc(ClanData clanData, String newDescription, Player sender) {
		return false;
	}

	@Override
	public boolean modTag(ClanData clanData, String newTag, Player sender) {
		return false;
	}

	@Override
	public boolean toggleGlobalFF(CommandSender player) {
		return false;
	}

	@Override
	public boolean toggleGlobalFF(Player player) {
		return false;
	}

	@Override
	public boolean toggleFF(ClanData clanData) {
		return false;
	}

	@Override
	public boolean isLeader(UUID player) {
		return false;
	}

	@Override
	public boolean isMod(UUID uuid) {
		return false;
	}

	@Override
	public boolean deleteHome(UUID clanUUID, String homeName) {
		return false;
	}

	@Override
	public boolean setHome(UUID player, Location location, String name) {
		return false;
	}

	@Override
	public boolean hasHome(UUID player, String homeName) {
		return false;
	}

	@Override
	public Location getHome(UUID player, String homeName) {
		return null;
	}

	@Override
	public HomesData getHomeData(UUID player, String homeName) {
		return null;
	}

	@Override
	public boolean deleteClan(UUID clanUUID) {
		return false;
	}

	@Override
	public boolean deletePlayerClan(UUID player) {
		return false;
	}

	@Override
	public ClanData createNewClan(Player player, String tag, String desc) {
		return null;
	}

	@Override
	public boolean clanExists(UUID clanUUID) {
		return false;
	}

	@Override
	public ClanData getClan(UUID clanUUID) {
		return null;
	}

	@Override
	public HashMap<UUID, Float> getTopClans(PlaceholderTop checktype) {
		return null;
	}

	@Override
	public boolean resetClanKDR(ClanData clanKDR, CommandSender sender) {
		return false;
	}

	@Override
	public boolean addExtraChest(UUID clanUUID, int amount, CommandSender sender) {
		return false;
	}

	@Override
	public boolean addSlot(String tag, int amount, CommandSender sender) {
		return false;
	}

	@Override
	public boolean removeSlot(String tag, int amount, CommandSender sender) {
		return false;
	}

	@Override
	public boolean setSlot(String tag, int amount, CommandSender sender) {
		return false;
	}

	@Override
	public boolean addPoint(UUID clanid, int amount, CommandSender sender) {
		return false;
	}

	@Override
	public boolean removePoint(String tag, int amount, CommandSender sender) {
		return false;
	}

	@Override
	public boolean setPoint(String tag, int amount, CommandSender sender) {
		return false;
	}

	@Override
	public int getPointsNextLevel(ClanData clanData) {
		return 0;
	}

	@Override
	public void checkClanLevelUp(ClanData clanData, CommandSender player) {}

	@Override
	public int slotsCount(ClanData clanData) {
		return 0;
	}

	@Override
	public int allyRivalCount(ClanData clanData, RivalAllyCount type) {
		return 0;
	}

	@Override
	public boolean hasClanModerationOnline(UUID clanUUID) {
		return false;
	}

	@Override
	public String parseText(UUID player, String text) {
		return null;
	}

	@Override
	public boolean hasAddonEnabled(String addonName) {
		return false;
	}

	@Override
	public HashMap<UUID, ClanData> getClanData() {
		return null;
	}

	@Override
	public List<Player> getChatspy() {
		return null;
	}

	@Override
	public boolean isGlobalFF() {
		return false;
	}

	@Override
	public List<ClanData> getRivalries(UUID clanUUID) {
		return null;
	}

	@Override
	public List<ClanData> getAlliances(UUID clanUUID) {
		return null;
	}


	
}