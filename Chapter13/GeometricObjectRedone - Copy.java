package chapter13;

public abstract class GeometricObjectRedone {

	private String color = "white";
	private boolean filled = false;
	protected java.util.Date dateCreated;
	
	
	abstract double getArea();
	
	abstract double getPerimeter();

	String getColor() {
		
		return color;
		
	}
	
	void setColor(String color) {
		
		this.color = color;
		
	}
	
	boolean isFilled() {
		
		return filled;
		
	}
	
	void setFilled(boolean filled) {
		
		this.filled = filled;
		
	}
	
	java.util.Date getDateCreated() {
		
		return dateCreated;
		
	}
	
	public String toString() {
		
		return "Created on " + dateCreated + "\nColor " + color + "\nFilled: " + filled;
		
	}
	
}
