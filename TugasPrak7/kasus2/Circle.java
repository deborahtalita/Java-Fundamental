package kasus2;

public class Circle extends Shape {
	private double radius;
	
	
	// Construct a Circle instance with default value for radius, color, and filled
	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	// Construct a Circle instance with given radius and default value for color and filled
	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	
	// Construct a Circle instance with given radius, color, and filled
	public Circle(double radius, String color, boolean filled) {
		super(color,filled);
		this.radius = radius;
	}

	// Getter and Setter for radius
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	// Returns the area of this Circle instance
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	// Returns the perimeter of this Circle instance
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
	public String toString() {
		return "Circle [" + super.toString() + "], radius=" + radius + "]";
	}
}
