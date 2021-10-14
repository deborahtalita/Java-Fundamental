package kasus2;

public class Restaurant {
	private MenuMakanan[] menu;
	private static byte id=0;
	
	// membuat constructor
	public Restaurant() {
		menu = new MenuMakanan[10];
	}
	
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.menu[id] = new MenuMakanan(nama, harga, stok);
	}
	
	public void tampilMenuMakanan() {
		System.out.println("Menu makanan :");
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.println(menu[i].getNama_makanan() + "[" + menu[i].getStok() + "]" + "\tRp. " + menu[i].getHarga_makanan());
			}
		}
	}

	public boolean isOutOfStock(int id) {
		if(menu[id].getStok() == 0) {
			return true;
		} else {
			return false;
		}
	}

	public static void nextId() {
		id++;
	}
	
	public void pemesanan(String namaMakanan, int jmlMakanan) {
		for (int i = 0; i <= id; i++) {
			if(namaMakanan.equalsIgnoreCase(menu[i].getNama_makanan())) { // menyamakan nama makanan
				if(jmlMakanan <= menu[i].getStok()) {	// mengecek jml stok tersedia					
					menu[i].kurangStok(jmlMakanan);
					System.out.println(menu[i].getNama_makanan() + " dibeli sebanyak " + jmlMakanan + " buah"); 
					System.out.println("Total Harga : Rp." + menu[i].getHarga_makanan()*jmlMakanan);
				}
				else {
					System.out.println("Stok " + menu[i].getNama_makanan() + " tidak mencukupi!");
				}
			}
		}
	}
}