package prak6;

import java.util.ArrayList;
import java.util.List;

public class RelationMain {

	public static void main(String[] args) {
		
		// membuat instances dari product
		Product p1 = new Product("HP", 1, "Teknologi",3000000);
		Product p2 = new Product("TV", 2, "Teknologi",7000000);
		Product p3 = new Product("Komik", 3, "Buku", 35000);
		Product p4 = new Product("Cincin", 4, "Aksesoris", 750000);
		
		// membuat list product sesuai category		
		List<Product> teknologi_catg = new ArrayList<Product>();
		teknologi_catg.add(p1);
		teknologi_catg.add(p2);
		
		List<Product> buku_catg = new ArrayList<Product>();
		buku_catg.add(p3);
		
		List<Product> aksesoris_catg = new ArrayList<Product>();
		aksesoris_catg.add(p4);
		
		// input category product
		ProductCategory teknologi = new ProductCategory("Teknologi",teknologi_catg);
		ProductCategory buku = new ProductCategory("Buku", buku_catg);
		ProductCategory aksesoris = new ProductCategory("Aksesoris", aksesoris_catg);
		
		
		// membuat list category product
		List<ProductCategory> prodCategory = new ArrayList<ProductCategory>();
		prodCategory.add(teknologi);
		prodCategory.add(aksesoris);
		prodCategory.add(buku);
		
		// membuat instance dari Factory
		Factory factory = new Factory("PT ABC", prodCategory);
		System.out.println("Nama Factory: "+factory.getName());
		
		// display category produk
		System.out.println("Kategori Produk:");
		prodCategory.forEach(System.out::println);
		
		
		// input distributor
		Distributor d1 = new Distributor("Kota Bandung", 1);
		Distributor d2 = new Distributor("Kota Semarang", 2);
		Distributor d3 = new Distributor("Kota Karawang", 3);

		// membuat list distributor
		List<Distributor> dist = new ArrayList<Distributor>();
		dist.add(d1);
		dist.add(d2);
		dist.add(d3);
		
		
		// membuat instance dari Factory untuk distributor
		Factory factory_dist = new Factory(dist);
		Status stat = new Status();
		System.out.println("\nTotal Distributor : "+factory_dist.getTotalDistributor());
		factory.distStatus(stat);
		
		
		// input supplier
		Supplier s1 = new Supplier("PT Cahaya");
		// association antara Factory dan Supplier
		System.out.println("\n"+s1.getName()+ " adalah supplier dari " + factory.getName());
		
	}
}
