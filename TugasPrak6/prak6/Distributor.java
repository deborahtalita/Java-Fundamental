package prak6;

class Distributor {
	String kota;
	int idSupir;
	int status;
	
	Distributor(String kota, int idSupir){
		this.kota = kota;
		this.idSupir = idSupir;
	}
}

class Status {
	public void on_process() {
		System.out.println("Barang sedang dalam perjalanan");
	}
	public void manifest() {
		System.out.println("Barang akan segera didistribusikan");
	}
	public void delivered() {
		System.out.println("Semua barang telah sampai di tujuan");
	}
}
