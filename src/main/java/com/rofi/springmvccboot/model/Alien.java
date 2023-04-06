package com.rofi.springmvccboot.model;

public class Alien {
	private int aId;
	private String aName;
	
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public Alien(int aId, String aName) {
		super();
		this.aId = aId;
		this.aName = aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + "]";
	}

}
