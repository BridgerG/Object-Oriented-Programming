package chapter12;

import java.util.Random;
import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Chapter_12_15 {

	public static void main(String[] args) {

		int array [] = new int [100];
		
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		try{
			
			BufferedWriter bw = new BufferedWriter( new FileWriter ("C:\\Users\\btgri\\OneDrive\\Github Stuff\\Object-Oriented-Programming\\Chapter12\\Exercise12_15.txt"));
		
		
			for(int i = 0; i < 100; i++) {
			
			bw.write(rand.nextInt(1000) + " ");
			
			}
			
			bw.close();
		
		} catch (Exception ex){
			
			System.out.print("You messed up bro");
			
		}
		
		File file = new File("C:\\Users\\btgri\\OneDrive\\Github Stuff\\Object-Oriented-Programming\\Chapter12\\Exercise12_15.txt");
		
		try {
			
			Scanner sf = new Scanner(file);
			

			for(int i = 0; i < 100; i++) {
			
				array[i] = sf.nextInt();
			
			}
		
			sf.close();
		
			Arrays.sort(array);
		
			for(int i = 0; i < 100; i++) {
			
				System.out.print(array[i] + " ");
			
			}
		
		} catch (Exception ex) {
			
			System.out.print("File not found");
			
		}
	}

}
