package chapter12;

import java.util.Random;
import java.util.Scanner;
import java.util.*;

public class Chapter_12_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 0;
		int array [] = new int [100];
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 0; i < 100; i++) {
			
			array[i] = rand.nextInt(100);
			
		}
		
		while(true) {
			
			System.out.print("What number in the array would you like out of 100: ");
			a = scan.nextInt();
		
			try {
				
				System.out.println("The number is " + array[a - 1]);
				
			}  catch (IndexOutOfBoundsException ex) {
				
				System.out.println("That is not a working number try again.");
				
			}
			
			
		}
		
	}

}
