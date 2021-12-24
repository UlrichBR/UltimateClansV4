package me.ulrich.clans.data;

import java.util.HashMap;
import java.util.List;

import me.ulrich.clans.data.ClanEnum.QuestMissionType;
import me.ulrich.clans.data.ClanEnum.QuestType;

public class QuestData {

	private String id;
	private boolean status;
	private QuestData_item item;
	private HashMap<QuestType, QuestData_mission> mission;
	private QuestMissionType missiontype;
	private QuestData_rewards rewards;
	private List<String> messages;

	/*
Quest:
  'fisher':
    item:
      click_sound: ''
      material: SKULL_ITEM:3
      name: '&eComum World'
      amount: 1
      glow: true
      texture: eyJ0ZXh0dXJlcyI6eyJTS0lOIjp7InVybCI6Imh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvMjEyYTAzYTRjMTFiNGQ0NzI0NzJlN2U0NTkzZDJlMTI2YTYyNTllMzNjYzgxZjQ0ZWIwNWNmMDQyZDA3Njk2NyJ9fX0=
      lore:
      - ' '
      - ' &eUse a comum World.'
      nbt:
        string: ''
        integer: ''
    status: true
    maxlevel: '10'
    mission_type: 'ONCE'
    missions:
      'FISHING':
        amount: '100'
        whitelist:
        - 'RAW_FISH'
    rewards:
      'commands':
      - ''
      points: 0
      exp: 0
      money: 0
      
	 * */
	
	public QuestData(String id, boolean status, QuestData_item item, QuestMissionType missiontype, HashMap<QuestType, QuestData_mission> mission, QuestData_rewards rewards, List<String> messages) {
	
		this.setId(id);
		this.setStatus(status);
		this.setItem(item);
		this.setTypes(mission);
		this.setMissiontype(missiontype);
		this.setRewards(rewards);
		this.setMessages(messages);
		
	}


	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public QuestData_item getItem() {
		return item;
	}

	public void setItem(QuestData_item item) {
		this.item = item;
	}

	public HashMap<QuestType, QuestData_mission> getTypes() {
		return mission;
	}

	public void setTypes(HashMap<QuestType, QuestData_mission> mission) {
		this.mission = mission;
	}

	public QuestMissionType getMissiontype() {
		return missiontype;
	}

	public void setMissiontype(QuestMissionType missiontype) {
		this.missiontype = missiontype;
	}

	public QuestData_rewards getRewards() {
		return rewards;
	}

	public void setRewards(QuestData_rewards rewards) {
		this.rewards = rewards;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public List<String> getMessages() {
		return messages;
	}


	public void setMessages(List<String> messages) {
		this.messages = messages;
	}

	
}
