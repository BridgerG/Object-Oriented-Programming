package chapter13;

import java.util.Scanner;

public class TheSequalWeHaveAllBeenWaitingForMakinTriangles2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 0, b = 0, c = 0;
		int checker = 0;
		boolean d = false;
		String e = "";
		Scanner scan = new Scanner(System.in);
		
		System.out.print("What is the first side of your triangle? ");
		a = scan.nextDouble();
		
		System.out.print("What is the second side of your triangle? ");
		b = scan.nextDouble();
		
		System.out.print("What is the third side of your triangle? ");
		c = scan.nextDouble();
		
		System.out.print("Is the triangle filled? 1 = yes / 2 = no ");
		
		checker = scan.nextInt();
		
		if (checker == 1) {
			
			d = true;
			
		} else if (checker == 2) {
			
			
		} else {
			
			System.out.println("Not valid, will be set to false");
			
		}
		
		System.out.print("What color is your triangle? ");
		e = scan.next();
		
		Triangle tri =  new Triangle(a, b, c, e, d);
		
		System.out.print(tri.toString());
	}

}
