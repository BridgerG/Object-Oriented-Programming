package chapter11;

public class GeometricObject {
	
	private String color = "white";
	private boolean filled = false;
	private java.util.Date dateCreated;
	
	GeometricObject() {
		
		dateCreated = new java.util.Date();
		
	}
	
	GeometricObject(String color, boolean filled) {
		
		this.color = color;
		this.filled = filled;
		dateCreated = new java.util.Date();
		
	}
	
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
		
		return "Created on " + dateCreated + "\nColor " + color + " and filled: " + filled;
		
	}
	

}
