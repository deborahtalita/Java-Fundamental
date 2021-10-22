package prak6;

class Product {
	private int id;
	private String name;
	private String category;
	private int harga;
	
	Product (String name, int id, String category, int harga) {
		this.name = name;
		this.id = id;
		this.category = category;
		this.harga = harga;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCategory() {
		return category;
	}

	public int getHarga() {
		return harga;
	}
}


