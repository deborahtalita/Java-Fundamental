package kasus_2;

import java.util.*;

public class DirtyBubble extends SuperHero {
	List<Power> powerList = new ArrayList<Power>();
	Power flying = new Flying();
	Power strength = new Strength();
	
	public DirtyBubble(String name, int powerLevel) {
		super(name, powerLevel);
		addPower(flying);
		addPower(strength);
	}
	
	void identity() {
		System.out.println("It's " + getName() + ", the DirtyBubble! It has the power level of " + getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAME IS "+ getName().toUpperCase());
	}
}
