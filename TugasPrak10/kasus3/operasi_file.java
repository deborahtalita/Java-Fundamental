package kasus3;

import java.io.File;
import java.util.Scanner;

public class operasi_file {
	public static void main(String[] args) {
		try {
			File exFile = new File("notes.txt");
			Scanner fileReader = new Scanner(exFile);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
