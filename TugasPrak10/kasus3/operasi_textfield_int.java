package kasus3;

import java.util.Scanner;

public class operasi_textfield_int {
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Input bilangan: ");
			int number = scan.nextInt();
			System.out.println("Bilangan: " + number);
		} catch (Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
