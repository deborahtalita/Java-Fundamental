package kasus_1;

public abstract class Shape {
	protected String shapeName;
	
	public Shape(String shapeName) {
		this.shapeName = shapeName;
	}
	
	abstract double area();
	
	public String toString() {
		return shapeName;
	}
}