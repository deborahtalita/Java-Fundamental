package kasus2;

public class Shape {
	private String color;
	private boolean filled;
	
	// Constructs a Shape instance with default value for color and filled
	public Shape() {
		color = "green";
		filled = true;
	}
	
	// Constructs a Shape instance with given color and filled
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}

	// Getter and Setter for color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Getter and Setter for filled
	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	// toString() method
	public String toString() {
		if(this.filled == true) {
			return "A shape with color of " + color + " and filled";
		} else {
			return "A shape with color of " + color + " and not filled";
		}
	}
}
