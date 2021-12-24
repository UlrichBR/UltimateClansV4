package me.ulrich.clans.data;

public class ClanGuiPagination {

	private boolean use;
	private String show;
	private int maxPerpage;
	private GuiItemStack item;

	public ClanGuiPagination(boolean use, String show, int maxPerPage, GuiItemStack item) {
		this.setUse(use);
		this.setShow(show);
		this.setMaxPerpage(maxPerPage);
		this.setItem(item);
	}

	public boolean isUse() {
		return use;
	}

	public void setUse(boolean use) {
		this.use = use;
	}

	public String getShow() {
		return show;
	}

	public void setShow(String show) {
		this.show = show;
	}

	public int getMaxPerpage() {
		return maxPerpage;
	}

	public void setMaxPerpage(int maxPerpage) {
		this.maxPerpage = maxPerpage;
	}

	public GuiItemStack getItem() {
		return item;
	}

	public void setItem(GuiItemStack item) {
		this.item = item;
	}
}
