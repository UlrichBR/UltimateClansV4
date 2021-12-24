package me.ulrich.clans.data;

import java.util.List;

public class NbtData {

	private List<String> string;
	private List<String> integer;

	public NbtData(List<String> string, List<String> integer) {
		this.setString(string);
		this.setInteger(integer);
	}

	public List<String> getString() {
		return string;
	}

	public void setString(List<String> string) {
		this.string = string;
	}

	public List<String> getInteger() {
		return integer;
	}

	public void setInteger(List<String> integer) {
		this.integer = integer;
	}
}
