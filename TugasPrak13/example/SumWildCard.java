package example;

import java.util.Arrays;
import java.util.List;

public class SumWildCard {
	public static int sumNumber(List<? extends Number> list) {
		int sum = 0;
		for (Number i: list) {
			sum += i.intValue();
		}
		return sum;
	}
	
	public static void main (String args[]) {
		List<Integer> list = Arrays.asList(5,7,8,10);
		System.out.println("Total: " + sumNumber(list));
	}
}
