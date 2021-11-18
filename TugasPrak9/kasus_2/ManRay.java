package kasus_2;

import java.util.*;

public class ManRay extends SuperHero {
	List<Power> powerList = new ArrayList<Power>();
	Power laser = new LaserEye();
	Power strength = new Strength();
	
	public ManRay(String name, int powerLevel) {
		super(name, powerLevel);
		addPower(laser);
		addPower(strength);
	}
	
	void identity() {
		System.out.println("It's " + getName() + ", the ManRay! It has the power level of " + getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAME IS "+ getName().toUpperCase());
	}
}
