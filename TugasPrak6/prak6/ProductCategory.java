package prak6;

import java.util.List;

class ProductCategory {
	private String name;
	private List<Product> products; // Aggregation antara Product dan ProductCategory
	
	ProductCategory(String name, List<Product> products){
		this.name = name;
		this.products = products;
	}
	
	public String toString() {
		return name;
	}
	
}
