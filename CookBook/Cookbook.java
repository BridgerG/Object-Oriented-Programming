package crustycookbook;

import java.io.*;
import java.util.Scanner;

public class Cookbook {

	private Scanner scan = new Scanner(System.in);
	
	private int i = 0;
	private int sdn = -1;
	private int i2 = 0;
	
	private BufferedReader basedoc = null;
	private BufferedWriter addition  = null;
	
	private String account = null;
	private String directory[] = new String[] {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	private String subdirectory[] = new String[] {"","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","","",""};
	private File file = null;
	
	private String place = "C:\\Users\\btgri\\OneDrive\\JAVA STUFF\\Cookbook\\src\\crustycookbook\\";
	private String nextplace = null;
	
	//Requires the input of the fills name, can be called account name as well//
	Cookbook(String a) throws IOException {
		
		file = new File(place + a + ".txt");
		
		if (file.exists() != true) {

			file.createNewFile();
		}
		
		try {
			basedoc = new BufferedReader(new FileReader(place + a + ".txt"));
		} catch (FileNotFoundException e) {
			System.out.print("FUCK ME");
			return;
		}
				
		while (basedoc.readLine() != null) {
			i++;
		}
		basedoc.close();
		
		try {
			basedoc = new BufferedReader(new FileReader(place + a + ".txt"));
		} catch (FileNotFoundException e) {
			System.out.print("FUCK ME TOO");
			return;
		}
		
		for(int s = 0; s != i; s++) {
			
			directory[s] = basedoc.readLine();			
		}
		
		basedoc.close();
		account = a + ".txt";
		
	}
	
	//Adds a section to add recipes too.//
	void additionBase(String a) throws IOException {
		
		addition = new BufferedWriter(new FileWriter(place + a + ".txt"));
		addition.close();
		
		addition = new BufferedWriter(new FileWriter(place + account));
		
		for (int b = 0; b != i; b++) {
			
			addition.append(directory[b]);
			addition.newLine();

		}
		
		addition.append(a);
		
		directory[i] = a;
		i++;
		
		addition.close();
		
	}
	
	//Will delete the numbers entire Base document//
	void deleteBase(int a) throws IOException {
		
		accessSecondary(a);
		
		while (i2 != 0) {
			
			deleteSecondary(i2);
			i2--;
			
		}
		
		file = new File(place + directory[a] + ".txt");
		file.delete();
		
		for (int b = a; b != i; b++) {
					
			directory[b] = directory[b + 1];
		
		}
		
		i--;
		
		addition = new BufferedWriter(new FileWriter(place + account));
		
		for (int b = 0; b != i; b++) {
			
			addition.append(directory[b]);
			addition.newLine();

		}
		
		
		
	}
	
	//Makes a string that is a list of all with the number to input into the accessSecondary to get the secondary folder as well as the number to use delete, also make a list of what actions can be done as additional numbers after//
	String listBase() {
			
			String list = "";
			
			for(int s = 0; s != i; s++) {
				
				list = list + s + ") " + directory[s] + "\n";
				
			}
			
			int s = i;
			list = list  + s + ") Add new section\n";
			
			s++;
			list = list + s + ") Delete section\n";
			
			s++;
			list = list + s + ") Exit\n";
			
			return list;
		}
			
	//This is used to make all of the Secondary things work//
	void accessSecondary(int a) throws IOException {
		
		nextplace = place + directory[a] + ".txt";
		sdn = a;
		
		try {
			basedoc = new BufferedReader(new FileReader(nextplace));
		} catch (FileNotFoundException e) {
			System.out.print("FUCK ME");
			return;
		}
				
		while (basedoc.readLine() != null) {
			i2++;
		}
		basedoc.close();
		
		
		try {
			basedoc = new BufferedReader(new FileReader(nextplace));
		} catch (FileNotFoundException e) {
			System.out.print("FUCK ME TOO");
			return;
		}
		
		for(int s = 0; s != i2; s++) {
			
			subdirectory[s] = basedoc.readLine();	
			
		}
		basedoc.close();
		
	}
	
	//This make the file that will be accessed by its name, add that name too the subdirectory and the account. Then it will write the entire recipe as inserted//
	void additionSecondary (String name, String recipe) throws IOException {
		
		//This makes the file with the recipe//
		addition = new BufferedWriter(new FileWriter(place + name + " " + directory[sdn] + " recipe.txt"));
		addition.write(name + "\n");
		addition.write(recipe);
		addition.close();
		
		//This adds it to the List//
		subdirectory[i2] = name;
		i2++;
		
		//This adds it to the subdirectory folder for permanent use//
		addition = new BufferedWriter(new FileWriter(nextplace));
		
		for (int b = 0; b != i2; b++) {
			
			addition.append(subdirectory[b]);
			addition.newLine();

		}
		
		addition.close();
		
	}
	
	//This will remove the file from the subdirectory and delete it from files//
	void deleteSecondary (int a) throws IOException {
		
		file = new File(place + subdirectory[a] + " " + directory[sdn] + " recipe.txt");
		file.delete();
		
		for (int b = a; b != i; b++) {
					
			subdirectory[b] = subdirectory[b + 1];
		
		}
		
		i2--;
		
		addition = new BufferedWriter(new FileWriter(nextplace));
		
		for (int b = 0; b != i; b++) {
			
			addition.append(directory[b]);
			addition.newLine();

		}
	}
	
	//This will edit the contents of a selected file while keeping it name, it requires the number from the list along with the new contents//
	void editRecipe (int a, String recipe) throws IOException {
		
		addition = new BufferedWriter(new FileWriter(place + subdirectory[a] + " " + directory[sdn] + " recipe.txt"));
		addition.write(subdirectory[a]);
		addition.write(recipe);
		addition.close();
		
	}
	
	//The way you grab the recipe//
	String getRecipe (int a) throws IOException {
		
		String list = "";
		int rlength = 0;
		
		try {
			basedoc = new BufferedReader(new FileReader(place + subdirectory[a] + " " + directory[sdn] + " recipe.txt"));
		} catch (FileNotFoundException e) {
			System.out.print("FUCK ME");
			return "";
		}
				
		while (basedoc.readLine() != null) {
			rlength++;
		}
		basedoc.close();
		
		
		try {
			basedoc = new BufferedReader(new FileReader(place + subdirectory[a] + " " + directory[sdn] + " recipe.txt"));
		} catch (FileNotFoundException e) {
			System.out.print("FUCK ME TOO");
			return "";
		}
		
		for(int s = 0; s != rlength; s++) {
			
			list = list + "\n" + basedoc.readLine();
			
		}
		basedoc.close();
		return list;
		
		
	}
	
	//Makes a list of all recipes in the sub directory//
	String listSecondary() {
		
		String list = "";
		
		for(int s = 0; s != i2; s++) {
			
			list = list + s + ") " + subdirectory[s] + "\n";
			
		}
		
		int s = i2;
		list = list  + s + ") Add new recipe\n";
		
		s++;
		list = list + s + ") Delete recipe\n";
		
		s++;
		list = list + s + ") Edit recipe\n";
		
		s++;
		list = list + s + ") Go back\n";
		
		return list;
				
	}	
	
	int getListLengthBase() {
		
		return i;
		
	}
	
	int getListLengthSecondary() {
		
		return i2;
		
	}
}