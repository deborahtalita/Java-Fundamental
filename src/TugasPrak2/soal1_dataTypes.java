/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
 * 
 * Reference: Java Data Types (HackerRank) by codeeasysite
*/ 


package TugasPrak2;

import java.util.Scanner;

public class soal1_dataTypes {

	public static void main(String[] args) {
		// buat scanner
		Scanner num = new Scanner(System.in);
		
		// input jumlah angka untuk test case
		System.out.println("Masukkan jumlah angka yang diinginkan:");
		int T = num.nextInt();
		
		for (int i = 0; i < T; i++) {
			try {
				// input angka yang ingin diuji
				System.out.println("Masukkan angka:");
				long n = num.nextLong();
				System.out.println(n + " can be fitted in:");
				
				if(n >= -128 && n <= 127) { System.out.println("* byte");}
				if(n >= -32768 && n <= 32767) { System.out.println("* short");}
				if(n >= -2147483648 && n <= 2147483647) { System.out.println("* int");}
				if(n >= -9223372036854775808L && n <= 9223372036854775807L) { System.out.println("* long");}
			}
			catch (Exception err) {
				System.out.println(num.next() + " can't be fitted anywhere.");
			}
		}
	}

}
