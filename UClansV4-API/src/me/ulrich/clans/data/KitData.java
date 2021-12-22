package me.ulrich.clans.data;

public class KitData {

	private String name;
	private String desc;
	private String serialized;
	private long creationDate;

	public KitData(String name, String desc, String serialized, long creationDate) {
		this.setName(name);
		this.setDesc(desc);
		this.setSerialized(serialized);
		this.setCreationDate(creationDate);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getSerialized() {
		return serialized;
	}

	public void setSerialized(String serialized) {
		this.serialized = serialized;
	}

	public long getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(long creationDate) {
		this.creationDate = creationDate;
	}
}
