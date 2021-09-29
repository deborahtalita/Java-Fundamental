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
		
		System.out.println("================================");
		for(int i = 0; i < 3; i++)
		{
			String word = scan.next();
			int num = scan.nextInt();
			System.out.printf("%-15s%03d\n", word, num);
		}
		System.out.println("================================");
	}

}
