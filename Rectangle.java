package chapter9;

class Rectangle {
	
	double width = 1;
	double height = 1;

	/*Makes a rectangle*/
	Rectangle() {
	}
	
	/*Makes a rectangle*/
	Rectangle(double newWidth, double newHeight) {
		
		width = newWidth;
		height = newHeight;
		
	}
	
	/*Returns area of the rectangle*/
	double getArea() {
		
		return width * height;
		
	}
	
	/*Returns perimeter*/
	double getPerimeter() {
		
		return (width * 2) + (height * 2);
		
	}
	
}
