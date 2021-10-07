package kasus2;

public class Item {
	private String name;
	private Item() {
		name = "Ipin";
	}
	public Item(String name) {
		// memanggil constructor yang sama pada class yg sama
		this(); 
		System.out.println(this.name);
	}
}
