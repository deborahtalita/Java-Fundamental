/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/
package TugasPrak3;

import java.math.BigInteger;
import java.util.Scanner;

public class soal6_bigNumber {

	public static void main(String[] args) {
		// buat scanner
		java.util.Scanner num = new Scanner(System.in);
		
		// input angka dgn tipe data string
		String u = num.nextLine();
		String v = num.nextLine();
		
		// convert string u & v ke BigInteger
		BigInteger a = new BigInteger(u);
		BigInteger b = new BigInteger(v);
		
		BigInteger tambah = a.add(b); // penjumlahan
		System.out.println(tambah);
		BigInteger kali = a.multiply(b); // perkalian
		System.out.println(kali);
	}

}
