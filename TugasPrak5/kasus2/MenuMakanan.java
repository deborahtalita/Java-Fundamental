package kasus2;

public class MenuMakanan {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;
	
	// membuat constructor
	public MenuMakanan(String nama_makanan, double harga_makanan, int stok) {
		this.nama_makanan = nama_makanan;
		this.harga_makanan = harga_makanan;
		this.stok = stok;
	}
	
	// membuat getter
	public String getNama_makanan() {
		return nama_makanan;
	}
	
	public double getHarga_makanan() {
		return harga_makanan;
	}
	
	public int getStok() {
		return stok;
	}
	
	// pengurangan stok
	public void kurangStok(int jmlBeli) {
		this.stok -= jmlBeli;
	}
}
