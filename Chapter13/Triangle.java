package chapter13;

public class Triangle extends GeometricObjectRedone implements Colorable {
	
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	Triangle() {
		
		super.dateCreated = new java.util.Date();
		
	}
	
	Triangle(double side1, double side2, double side3, String color, boolean filled) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		super.setFilled(filled);
		super.setColor(color);
		super.dateCreated = new java.util.Date();
		
	}
	
	double getSide1() {
		
		return side1;
		
	}
	
	void setSide1(double side1) {
		
		this.side1 = side1;
		
	}

	double getSide2() {
		
		return side2;
		
	}
	
	void setSide2(double side2) {
		
		this.side2 = side2;
		
	}
	
	double getSide3() {
		
		return side3;
		
	}
	
	void setSide3(double side3) {
		
		this.side3 = side3;
		
	}
	
	@Override
	double getArea() {
		
		double s = (side1 + side2 + side3)/2;
		
		s = s * (s - side1) * (s - side2) * (s - side3);
				
		return java.lang.Math.sqrt(s);
		
	}
	
	@Override
	double getPerimeter() {
		
		return side1 + side2 + side3;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + "\nPerimeter: " + getPerimeter() + "\nArea: " + getArea();
		
	}

	@Override
	public void howToColor() {

		System.out.print("color all three sides.");
		
	}

}
