package me.ulrich.clans.data;

import java.util.HashMap;

public class GuiData {

	private String id;
	private String title;
	private String opensound;
	private HashMap<String, GuiItemsData> items;
	private int rows;


	public GuiData(String id, String title, int rows, String opensound, HashMap<String, GuiItemsData> items) {
		this.setId(id);
		this.setTitle(title);
		this.setOpensound(opensound);
		this.setRows(rows);
		this.setItems(items);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOpensound() {
		return opensound;
	}

	public void setOpensound(String opensound) {
		this.opensound = opensound;
	}

	public HashMap<String, GuiItemsData> getItems() {
		return items;
	}

	public void setItems(HashMap<String, GuiItemsData> items) {
		this.items = items;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

}
