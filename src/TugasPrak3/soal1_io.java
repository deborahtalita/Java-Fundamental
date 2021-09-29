/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/

package TugasPrak3;

import java.util.Scanner;

public class soal1_io {

	public static void main(String[] args) {
		// buat scanner
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// split string dengan delimiter
		String[] tokens = s.split("[!, ?._'@]");
		// tampilkan jumlah token
		System.out.println(tokens.length);
		for (int i = 0; i < tokens.length; i++) 
		{
			// menampilkan setiap token
			System.out.println(tokens[i]);
		}

	}
}
