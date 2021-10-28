package kasus2;

public class Rectangle extends Shape {
	private double width;
	private double length;
	
	// Construct a Rectangle instance with default value for width, length, color, and filled
	public Rectangle() {
		super();
		this.width =  1.0;
		this.length = 1.0;
	}
	
	// Construct a Rectangle instance with given width and length also default value for color and filled
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	// Construct a Rectangle instance with given length, width, color, and filled
	public Rectangle (double width, double length, String color, boolean filled) {
		super(color,filled);
		this.width = width;
		this.length = length;
	}

	
	// Getter and Setter for width
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	// Getter and Setter for length
	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
	
	
	// Returns the area of this Rectangle instance
	public double getArea() {
		return length*width;
	}
	
	// Returns the perimeter of this Rectangle instance
	public double getPerimeter() {
		return 2*(length+width);
	}
	
	public String toString() {
		return "Rectangle[" + super.toString() + "], width=" + width + ",length=" + length + "]";
	}
}
