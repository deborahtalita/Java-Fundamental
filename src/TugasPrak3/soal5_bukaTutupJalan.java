/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/
package TugasPrak3;

import java.util.Scanner;

public class soal5_bukaTutupJalan {

	public static void main(String[] args) {
		// buat scanner
		Scanner scan = new Scanner(System.in);
		
		String input = scan.nextLine();
		// menghilangkan spasi pada input 4 plat nomor
		String plat = input.replaceAll("\\s","");
		// convert string ke long
		long platMobil = Long.parseLong(plat);
		
		long hasil = ((platMobil - 999999) % 5);
		if (hasil == 0) {
			System.out.println("berhasil"); // jika mod = 0
		} else {
			System.out.println("gagal"); // jika mod != 0
		}
		
	} 

}
