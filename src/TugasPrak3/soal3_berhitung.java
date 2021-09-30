/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/
package TugasPrak3;

import java.util.Scanner;

public class soal3_berhitung {

	public static void main(String[] args) {
		// buat scanner
		Scanner scan = new Scanner(System.in);
		int hasil = 0;
		String op = scan.nextLine();
		
		// split angka dan operator dengan delimiter spasi
		String[] operation = op.split("[ ]");
		
		// convert string ke int
		int A = Integer.parseInt(operation[0]);
		int B = Integer.parseInt(operation[2]);
		
		String operator = operation[1];
		
		if((A >= 1 && A <= 1000) && (B >= 1 && B <= 1000)) {
			switch(operator) {
				case "+": hasil = A+B; break;
				case "-": hasil = A-B; break;
				case "*": hasil = A*B; break;
				case "/": hasil = A/B; break;
				case "%": hasil = A%B; break;
			}
			System.out.println(hasil);
		} else {
			System.out.println("error");
		}
	}

}
