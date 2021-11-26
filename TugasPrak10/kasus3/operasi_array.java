package kasus3;

import java.util.Scanner;

public class operasi_array {

	public static void main(String[] args) {
		int array[] = null;
		int arraySize = -5;
		int output;
		
		Scanner scan = new Scanner(System.in);
		
		int i = scan.nextInt();
		
		try {
			switch(i) {
			case 1:
				// Array Null
				output = array[0];
				break;
			case 2:
				// Array dengan size negatif
				array = new int[arraySize];
				output = array[arraySize];
				break;
			case 3:
				// Isi index diakses diluar dari sizenya
				array = new int[6];
				output = array[6];
				break;
			}
		} 
		catch (NullPointerException ex1){
			System.out.println(ex1.getMessage());
		}
		catch (NegativeArraySizeException ex2) {
			System.out.println("An array with a negative size is invalid");
		}
		catch (ArrayIndexOutOfBoundsException ex3) {
			System.out.println(ex3.getMessage());
		}
	}
}
