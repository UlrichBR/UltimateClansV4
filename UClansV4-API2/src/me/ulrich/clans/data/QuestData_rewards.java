package me.ulrich.clans.data;

import java.util.List;

public class QuestData_rewards {

	/*
    rewards:
      'commands':
      - ''
      points: 0
      exp: 0
      money: 0
	 * */
	
	private List<String> commands;
	private int points;
	private int exp;
	private int money;

	public QuestData_rewards(List<String> commands, int points, int exp, int money) {
		this.setCommands(commands);
		this.setPoints(points);
		this.setExp(exp);
		this.setMoney(money);
	}

	public List<String> getCommands() {
		return commands;
	}

	public void setCommands(List<String> commands) {
		this.commands = commands;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

}
