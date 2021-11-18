package kasus_2;

import java.util.*;

public class AvangedSimulator {
	public static void main (String[] args) {
		List<SuperHero> superHero= new ArrayList<SuperHero>();
		SuperHero s1 = new FlyingDutchMan("Shirai", 225);
		SuperHero s2 = new ManRay("Gennichiro", 0);
		SuperHero s3 = new ManRay("Gyoubu Masataka Oniwa", 553);
		SuperHero s4 = new DirtyBubble("Arnastria", 666);
		SuperHero s5 = new FlyingDutchMan("Tatenari", 36556);
		
		superHero.add(s1);
		superHero.add(s2);
		superHero.add(s3);
		superHero.add(s4);
		superHero.add(s5);
		
		Collections.sort(superHero);
		
		for(SuperHero sH : superHero) {
			System.out.println("==============================");
			sH.identity();
			sH.showPowers();
			System.out.println("==============================");
		}
	}
}
