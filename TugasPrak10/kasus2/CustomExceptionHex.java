package kasus2;

import java.util.*;

public class CustomExceptionHex {
	public static int HexDecToDec(String str) throws ExceptionHexDec{
		if (str.matches("-?[0-9a-fA-F]+")) {
			return Integer.parseInt(str, 16);
		} else {
			throw new ExceptionHexDec("Input bukan hexadecimal!");
		}
	}
	
	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			String number = scan.next();
			int hex = HexDecToDec(number);
			System.out.println("Bilangan decimal dari " + number + ": " + hex);
		}
		catch (ExceptionHexDec e){
			System.out.println(e.getMessage());
		}
	}
}
