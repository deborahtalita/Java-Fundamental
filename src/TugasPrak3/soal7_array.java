/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/
package TugasPrak3;

public class soal7_array //MDArrayJava
{
	public static void main(String[] args)
	{
		//One Dimensional Arrays
		int[] firstArray = {2, 5, 3};
		int[] secondArray = {9, 5, 3};
		int[] thirdArray = {2, 4, 9};
		int[] fourthArray = {10, 11, 12};
		int[] fifthArray = {13, 14, 15};
		int[] sixthArray = {16, 17, 18};
		int[] seventhArray = {19, 20, 21};
		int[] eighthArray = {22, 23, 24};
		int[] ninthArray = {25, 26, 27};
		
		//Two Dimensional Arrays
		int[][] twoDimensionalArray1 = {firstArray, secondArray, thirdArray};
		int[][] twoDimensionalArray2 = {fourthArray, fifthArray, sixthArray};
		int[][] twoDimensionalArray3 = {seventhArray, eighthArray, ninthArray};
		
		//Three Dimensional Array
		int[][][] threeDimensionalArray = {twoDimensionalArray1, twoDimensionalArray2, twoDimensionalArray3};
		printArray(threeDimensionalArray);
	
	}
	
	static void printArray(int[][][] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print("{ ");
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print("{ ");
				for(int k = 0; k < arr.length; k++) {
					System.out.print(arr[i][j][k]+" ");
				}
				System.out.print("} ");
			}
			System.out.println("}");
		}
	}
}

