package chapter9;

public class ShapeCreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle r1 = new Rectangle(4, 40);
		Rectangle r2 = new Rectangle(3.5, 35.9);
		
		System.out.print("Rectangle 1\nWidth: " + r1.width + "\nHeight: " + r1.height + "\nArea: " + r1.getArea() + "\nPerimeter: " + r1.getPerimeter() + "\n");
		System.out.print("\nRectangle 2\nWidth: " + r2.width + "\nHeight: " + r2.height + "\nArea: " + r2.getArea() + "\nPerimeter: " + r2.getPerimeter() + "\n");

	}

}
