package me.ulrich.clans.data;

public class ClanEnum {

	public enum ClanEvents {
		BANKCHANGE, WARWIN, WARSTART, WAREND, TELEPORT, PROXYINVITE, CREATE, DELETE, ALLYREMOVE, ALLYADD, RIVALREMOVE, RIVALADD, BALANCE, CHEST, PLAYERKICK, PLAYERJOIN, CHANGELEADER, PLAYERINVITED, CLANVERIFY, PLAYERPROMOTE, PLAYERDEMOTE, RESETPLAYERKDR, RESETCLANKDR, CLANCHAT, CLANMODDESC, CLANMODTAG, CHESTLOCK, BUYEXTRACHEST, CLANCHANGEPOINT, CLANCHANGEHOME, CLANCHANGEBANNER, CLANCHANGESETTINGS, CLANCHANGEFF, PLAYERLOGIN, ALLYSEND, RIVALSEND ;
	}
	
	public enum EnumExpand {
		VERT, UP, DOWN;
	}
	
	public enum BarActions{
		REGROUP, INVITE, CHAT, ALLY, RIVAL, CUSTOM;
	}
	
	public enum MemberRoles{
		MEMBER, MODERATOR, LEADER;
	}
	
	public enum ImportPlugins{
		ADVANCEDCLANS;
	}
	public enum MoneyType{
		VAULT, PLAYERPOINTS, DISABLED;
	}
	public enum ImportStorage{
		MYSQL, SQLITE;
	}
	
	public enum MultiserverMode{
		BUNGEECORD, ERROR;
	}
	
	public enum ClanStorage{
		MYSQL, SQLITE, YAML;
	}
	
	public enum MsgUsage{
		help, usage, error, success;
	}
	
	public enum InviteResponse{
		SENDED, ALREADY, ERROR;
	}
	
	public enum SyncName {
		NULL, UPDATE, CHEST, BROADCAST, CLANCHAT, INVITE, ALLYINVITE, RIVALREMOVE;
	}
	
	public enum AllyInviteReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum RivalRemoveReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_SENDED;
	}
	public enum WarReturn {
		SENDED, MODERATION_OFFLINE, ERROR, ALREADY_INVITED;
	}
	public enum EventState {
		STOPED, INLOBBY, STARTED, ENDING, CANCELED, INWAIT;
	}
	
	public enum BuyChestResponse {
		NEEDMONEY, ERROR, SUCCESS;
	}
	
	public enum EventPoint {
		NULLED, SPAWN1, SPAWN2, EXIT, LOBBY;
	}
	public enum EventCause{
		NULLED, LESS_THAN_2, WINNER, LESS_PLAYERS_DIFFERENCE, CLAN_NOT_FOUND, CONTINUE;
	}
	
	public enum PlaceholderTop{
		KILL, DEATH, KDR, MEMBER, BANK, LEVEL, WAR, ALL;
	}
	
	public enum ClanActions{
		CREATE, NEWMEMBER, REMOVEMEMBER, WARWIN, WARLOSE, NEWALLIANCE, REMOVEALLIANCE, NEWRIVAL, REMOVERIVAL, PROMOTEMEMBER, DEMOTEMEMBER;
	}
	
	public enum RivalAllyCount{
		RIVAL, ALLY;
	}
	
	public enum SettingsType{
		WARINVITE, ALLYSHAREDCHAT, JOINLEAVE, ALLYSHAREDHOME, CLANFF;
	}
	
	public enum SettingsFlagsAccept {
		TRUE, FALSE, TOGGLE;
	}
	
	public enum QuestMissionType {
		DAILY, ONCE;
	}
	
	public enum ClanLangs{
		en_us;
	}
	
	public enum QuestType {
		BREAK,
		PLACE,
		FISHING,
		CRAFTING,
		SMELT,
		EAT,
		ENCHANTING,
		REPAIR,
		KILL,
		KILL_ENTITY,
		DYE,
		SHEAR,
		TAME,
		BREED,
		MILK,
		VTRADE,
		COLLECT,
		BAKE,
		STRIPLOGS,
		PICKUP,
		EXPLODE,
		CLANWAR,
		CLANLEVEL,
		EXP,
		MYTHIC,
		ENDERPEARL,
		THROWN,
		ELYTRA,
		;
	}
	
	public enum QuestStatus{
		FINISHED, INCOURSE;
	}
	
	public enum QuestWarn {
		EXPIRED, FINISHED, EARNED,
		;
	}
}
