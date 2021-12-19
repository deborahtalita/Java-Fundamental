package example;

// Java Generic Method
public class Array{
	
	public static <T> void printArray(T[] arr) {
		System.out.println("Isi array:");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println(" ");
	}
	
	public static void main(String args[]) {
		String buah[] = { "apel", "nanas", "mangga"};
		Integer num[] = { 8, 2, 1, 5, 7, 9, 0 };
		
		printArray(buah);
		printArray(num);
	}
}
