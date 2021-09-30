/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/

package TugasPrak3;

import java.util.Scanner;

public class soal4_gajiAgent {

	public static void main(String[] args) {
		// buat scanner
		Scanner sc = new Scanner(System.in);
		
		int gajiPokok = 500000;
		int hargaItem = 50000;
		int gajiTotal;
		
		int jmlItem = sc.nextInt(); // input jml penjualan
		
		if(jmlItem > 80) { 
			gajiTotal = gajiPokok + (jmlItem * hargaItem * 35 / 100); // bonus 35%
		} else if (jmlItem >= 40) { 
			gajiTotal = gajiPokok + (jmlItem * hargaItem * 25 / 100); // bonus 25%
		} else if (jmlItem < 15) {
			gajiTotal = gajiPokok - (-(jmlItem-15) * hargaItem * 15 / 100); // bonus 15%
		} else {
			gajiTotal = gajiPokok + (jmlItem * hargaItem * 10 / 100); // denda 10%
		}
		System.out.println(gajiTotal);
	}

}
