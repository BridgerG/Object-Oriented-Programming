package chapter11;

public class Triangle extends GeometricObject{
	
	private double side1 = 1;
	private double side2 = 1;
	private double side3 = 1;
	
	Triangle() {
	}
	
	Triangle(double side1, double side2, double side3) {
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
		
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
	
	double getArea() {
		
		double s = (side1 + side2 + side3)/2;
		
		s = s * (s - side1) * (s - side2) * (s - side3);
				
		return java.lang.Math.sqrt(s);
		
	}
	
	public String toString() {
		
		return super.toString() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
		
	}
}
