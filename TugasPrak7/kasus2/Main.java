package kasus2;

public class Main {

	public static void main(String[] args) {
		
		String color = "purple";
		boolean filled = true;
		double r = 7.0; // radius
		double l = 5.0; // length
		double w = 8.0; // width
		
		// Declare and allocate new instance of Shape
		Shape s1 = new Shape();
		Shape s2 = new Shape(color,filled);
		
		// Declare and allocate new instance of Circle
		Circle c1 = new Circle();
		Circle c2 = new Circle(r);
		Circle c3 = new Circle(r, color, filled);
		
		// Declare and allocate new instance of Rectangle
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle(w, l);
		Rectangle r3 = new Rectangle(w, l, color, filled);
		
		// Declare and allocate new instance of Square
		Square q1 = new Square();
		Square q2 = new Square(l);
		Square q3 = new Square(l, color, filled);
		
		System.out.println("========== Shape ==========");
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("========== Circle ==========");
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());
		System.out.println("========== Rectangle ==========");
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println(r3.toString());
		System.out.println("========== Square ==========");
		System.out.println(q1.toString());
		System.out.println(q2.toString());
		System.out.println(q3.toString());
	}

}
