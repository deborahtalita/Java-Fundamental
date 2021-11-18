package kasus_1;

public class Cylinder extends Shape {
	private double radius;
	private double height;
	
	// Constructor: Sets up the rectangle
	public Cylinder(double r, double h) {
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	// Returns the surface area of the rectangle
	public double area() {
		return Math.PI*radius*radius*height;
	}
	
	// Returns the sphere as a String
	public String toString() {
		return super.toString() + " of radius " + radius + " and height " + height;
	}	
}
