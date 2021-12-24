package me.ulrich.clans.data;

import java.util.List;

public class QuestData_item {

	/*
      item:
        material: DIRT
        name: '&6Default Island'
        lore:
        - ' '
        - ' &eGenerate a default island.'
        nbt:
          string: ''
          integer: ''
	 * */
	
	private String material;
	private String name;
	private List<String> lore;
	private String nbtString;
	private String nbtInteger;
	private int amount;
	private boolean glow;
	private String texture;
	private String clickSound;

	public QuestData_item(String clickSound, String material, String name, int amount, boolean glow, String texture, List<String> lore, String nbtString, String nbtInteger) {
		this.setMaterial(material);
		this.setName(name);
		this.setAmount(amount);
		this.setGlow(glow);
		this.setTexture(texture);
		this.setLore(lore);
		this.setNbtString(nbtString);
		this.setNbtInteger(nbtInteger);
		this.setClickSound(clickSound);
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getLore() {
		return lore;
	}

	public void setLore(List<String> lore) {
		this.lore = lore;
	}

	public String getNbtString() {
		return nbtString;
	}

	public void setNbtString(String nbtString) {
		this.nbtString = nbtString;
	}

	public String getNbtInteger() {
		return nbtInteger;
	}

	public void setNbtInteger(String nbtInteger) {
		this.nbtInteger = nbtInteger;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public boolean isGlow() {
		return glow;
	}

	public void setGlow(boolean glow) {
		this.glow = glow;
	}

	public String getTexture() {
		return texture;
	}

	public void setTexture(String texture) {
		this.texture = texture;
	}

	public String getClickSound() {
		return clickSound;
	}

	public void setClickSound(String clickSound) {
		this.clickSound = clickSound;
	}

}
