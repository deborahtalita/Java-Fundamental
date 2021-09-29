/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/

package TugasPrak2;
import java.util.Scanner;

public class soal5_strings {
	public static void main(String[] args) {
		// buat scanner
		Scanner keyboard = new Scanner(System.in);
		// input string A
		System.out.println("Input string A :");
		String A = keyboard.next();
		// input string B
		System.out.println("Input string B :");
		String B = keyboard.next();
		
		// sum of the lengths of A and B
		int sum = A.length() + B.length();
		System.out.println(sum);
		
		// lexicography check
		System.out.println((A.compareTo(B) > 0)? "Yes" : "No");
		
		// capitalize first letter
		System.out.println(A.substring(0,1).toUpperCase() + A.substring(1)+" "+
		B.substring(0,1).toUpperCase() + B.substring(1));
	}

}
