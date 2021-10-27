package kasus1;

public class Circle {
	// private instance variable, not accesible from outside this class
	private double radius;
	private String color;
	
	
	// Constructors (overloaded)
	/** Constructs a Circle instance with default value for radius and color */
	public Circle() {
		radius = 1.0; // 1st (default) constructor
		color = "Red";
	}
	
	/** Constructs a Circle insatance with the given radius and default color */
	public Circle (double r) {
		radius = r;
		color = "red";
	}
	
	/* task 1.1 - modify class circle */
	public Circle (double r, String clr) {
		radius = r;
		color = clr;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	/** Returns the radius */
	public double getRadius() {
		return radius;
	}
	
	/** Returns the area of this Circle instance */
	public double getArea() {
		return radius*radius*Math.PI;
	}
	
	/** Return a self-descriptive string of this instance in the form
	 * of Circle[radius=?,color=?] */
	public String toString()
	{
		return "Circle[radius=" + radius + " color=" + color + "]";
	}
}
