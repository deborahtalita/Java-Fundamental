/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/
package TugasPrak3;

import java.util.Scanner;

public class soal2_io {

	public static void main(String[] args) {
		// buat keyboard
		Scanner scan = new Scanner(System.in);
		
		// inisialisasi array
		String[] word = new String[3];
		int[] num = new int[3];
		
		for(int i = 0; i < 3; i++) {
			word[i] = scan.next(); // input string
			num[i] = scan.nextInt(); // input angka
			if (word[i].length() > 15) {
				System.out.println("string error"); // panjang string maks 15 char
			}
			if (num[i] < 0 || num[i] > 999) {
				System.out.println("number error"); // batas angka 0<num<999
			}
		}
		System.out.println("================================");
		for(int j = 0; j < 3; j++)
		{
			System.out.printf("%-15s%03d\n", word[j], num[j]);
		}
		System.out.println("================================");
	}

}
