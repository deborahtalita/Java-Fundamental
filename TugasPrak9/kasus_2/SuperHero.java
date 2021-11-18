package kasus_2;

import java.util.*;

public abstract class SuperHero implements Comparable<SuperHero>{
	private int powerLevel;
	private String name;
	private List<Power> powerList;
	
	public SuperHero(String name, int powerLevel) {
		this.name = name;
		this.powerLevel = powerLevel;
		powerList = new ArrayList<Power>();
	}
	
	public int getPowerLevel() {
		return powerLevel;
	}

	public String getName() {
		return name;
	}
	
	void addPower(Power power) {
		powerList.add(power);
	}
	
	abstract void identity();
	
	void showPowers() {
		System.out.println("TIME TO SHOW YOU MY POWERS");
		for(Power pList : powerList) {
			pList.doPower();
		}
	}
	
	public int compareTo(SuperHero sh1) {
		return this.powerLevel - sh1.getPowerLevel();
	}
}
