package chapter13;

import java.util.Random;

public class NoOneAskedForMakinTriangles3ButWeMadeItAnyway {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Triangle[] tri = new Triangle[5];
		
		for (int i = 0; i < 5; i++) {
			
			tri[i] = new Triangle(2, 3, 4, "Blue", false);
					
		}
		
		for (int i = 0 ; i < 5; i++) {
			
			System.out.print("Triangle " + (i + 1) + " area is " + tri[i].getArea());
			
			if (rand.nextInt(2) == 1) {
				
				System.out.print(" and ");
				tri[i].howToColor();
				System.out.print("\n");
				
			} else {
				
				System.out.print(".\n");
				
			}
		}
		

	}

}
