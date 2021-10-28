package kasus2;

public class Square extends Rectangle {
	
	// Construct a Square instance with default value for width, length, color, and filled
	public Square() {
		super();
	}
	
	// Construct a Square instance with given side also default value for color and filled
	public Square(double side) {
		super(side,side);
	}
	
	// Construct a Shape instance with given side, color, and filled
	public Square(double side, String color, boolean filled) {
		super(side, side, color, filled);
	}
	
	
	// Getter and Setter for side
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	// Setter for width
	public void setWidth(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	// Setter for length
	public void setLength(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	// Returns the area of this Square instance
	public double getArea() {
		return getSide()*getSide();
	}
	
	// Returns the perimeter of this Square instance
	public double getPerimeter() {
		return 4*getSide();
	}
	
	public String toString() {
		return "Square[" + super.toString() + "]";
	}
}
