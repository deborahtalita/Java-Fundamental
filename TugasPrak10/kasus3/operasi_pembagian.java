package kasus3;

public class operasi_pembagian {
	public static void main(String[] args) {
		try {
			System.out.println(5/0);
		} catch(ArithmeticException e) {
			System.out.println("Pembagian dengan 0 tidak valid");
		}
	}
}
