package chapter13;

import java.lang.Math;

public class Octagon extends GeometricObjectRedone implements Cloneable, Comparable<Octagon> {

	private double side = 0.1;
	
	Octagon () {
		super.dateCreated = new java.util.Date();
	}
	
	Octagon (double side, String color, boolean filled) {
		
		super.setFilled(filled);
		super.setColor(color);
		this.side = side;
		super.dateCreated = new java.util.Date();
		
	}
	@Override
	public int compareTo(Octagon o) {
		
		if (getArea() > o.getArea()) {
			
			return 1;
			
		} else if (getArea() < o.getArea()) {
			
			return -1;
		} else {
			
			return 0;
			
		}
				
	}
	public Object clone() {
		
		try {
			return super.clone();
		} 
		catch (CloneNotSupportedException ex) {
			return null;
		}
	}

	@Override
	double getArea() {

		return (2 + (4/Math.sqrt(2))) * side * side;
		
	}

	@Override
	double getPerimeter() {
		// TODO Auto-generated method stub
		return side * 8;
		
	}

	@Override
	public String toString() {
		
		return super.toString() + "\nSide Length " + side + "\nArea " + getArea();
		
	}
}
