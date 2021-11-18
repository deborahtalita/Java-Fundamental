package kasus_2;

import java.util.*;

public class FlyingDutchMan extends SuperHero {
	List<Power> powerList = new ArrayList<Power>();
	Power flying = new Flying();
	Power laser = new LaserEye();
	
	public FlyingDutchMan(String name, int powerLevel) {
		super(name, powerLevel);
		addPower(flying);
		addPower(laser);
	}
	
	void identity() {
		System.out.println("It's " + getName() + ", the FlyingDutchman! It has the power level of " + getPowerLevel());
		System.out.println(".....HEED ME.....");
		System.out.println("FOR MY NAAAAAAME IS "+ getName().toUpperCase());
	}
}
