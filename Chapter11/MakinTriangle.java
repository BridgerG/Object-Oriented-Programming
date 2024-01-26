package chapter11;

import java.util.Scanner;

public class MakinTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Triangle tri = new Triangle();
		double a = 0;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input 3 numbers that will be the sides of the trinagle: ");
		
		a = scan.nextDouble();
		tri.setSide1(a);
		
		a = scan.nextDouble();
		tri.setSide2(a);
		
		a = scan.nextDouble();
		tri.setSide3(a);
		
		System.out.print("What color is the triangle: ");
		
		String b = scan.next();
		tri.setColor(b);
		
		System.out.print("Is it filled in? 1 = yes 2 = no:");
		a = scan.nextDouble();
		
		if (a == 1) {
			
			tri.setFilled(true);
			
		} else {
			
			tri.setFilled(false);
		}
		
		System.out.print(tri.toString());
		
	}

}
