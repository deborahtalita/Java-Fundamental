/**
 * Nama	:	Marpaung, Deborah Talita Kum
 * NIM	:	201511014						
 * Kelas:	D3-2A
*/

package TugasPrak2;

class soal4_operators { //ConvertDataType
	static short methodOne(long l)
	{
		// konversi long l ke int
		int i = (int) l;
		System.out.println("i :"+ i);
		// konversi int i ke short
		System.out.println("short i : "+ (short) i);
		return (short) i;
	}
	public static void main(String[] args) {
		double d = 10.25;
		System.out.println("d : "+ d);
		// konversi double d ke float
		float f = (float) d;
		System.out.println("f :"+ f);
		// konversi float f ke long
		byte b = (byte) methodOne ((long) f); // konversi short ke byte
		System.out.println("b : "+b);
	}
}
