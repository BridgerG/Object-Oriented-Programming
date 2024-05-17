package crustycookbook;

import java.io.IOException;
import java.util.Scanner;

public class CookBookAction {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		Cookbook account = null;
		
		int num = 0;
		String name = "", recipe = "", recipe2 = "";
		boolean on = true, run = true, srun = true;
		
		while (on == true) {
			
			System.out.print("What is the name of your account? ");
			name = scan.nextLine();
			account = new Cookbook(name);
						
			while (run == true) {
				
				if (account.getListLengthBase() == 0) {
				
					System.out.print("What would you like your first section of your cookbook to be called? ");
					name = scan.nextLine();
					account.additionBase(name);
					continue;
				
				} else {
					
					System.out.print(account.listBase());
					System.out.print("Please select which action you wish to preform by pressing the number that is too its side. ");
					num = scan.nextInt();
					scan.nextLine();

					
					if (num == account.getListLengthBase()) {
						
						System.out.print("What is the name of the new section? ");
						name = scan.nextLine();
						account.additionBase(name);
						continue;
						
					} else if (num == account.getListLengthBase() + 1) {
						
						System.out.print("What is the number of the section you want to delete? Type an invalid number to cancel. ");
						num = scan.nextInt();
						scan.nextLine();
						
						if (num >= account.getListLengthBase()) {
							
							System.out.print("Invalid number try again.\n");
							continue;
									
						}
						
						account.deleteBase(num);
						continue;
						
					} else if (num < account.getListLengthBase()) {
						
						account.accessSecondary(num);
						
						while (srun == true) {
							
							if (account.getListLengthSecondary() == 0) {
								
								System.out.print("What is the name of your first recipe? ");
								name = scan.nextLine();
								
								System.out.print("What is the recipe? \nPress enter to make a new line. \nEnter the number 0 to end making your recipe.\n");

								while (recipe2.compareTo("0") != 0) {
									
									recipe = recipe + recipe2 + "\n";
									recipe2 = scan.nextLine();
									
								}
								
								account.additionSecondary(name, recipe);
								
								recipe = "";
								recipe2 = "";
								
								continue;
							
							} else {
								
								System.out.print(account.listSecondary());
								System.out.print("Please select which action you wish to preform by pressing the number that is too its side. ");
								num = scan.nextInt();
								scan.nextLine();

								if (num == account.getListLengthSecondary()) {
									
									System.out.print("What is the name of this recipe? ");
									name = scan.nextLine();
									
									System.out.print("What is the recipe? \nPress enter to make a new line. \nEnter the number 0 to end making your recipe. ");

									while (recipe2.compareTo("0") != 0) {
										
										recipe = recipe + recipe2 + "\n";
										recipe2 = scan.nextLine();
										
									}
									
									account.additionSecondary(name, recipe);
									
									recipe = "";
									recipe2 = "";
									
									continue;
									
								} else if (num == account.getListLengthSecondary() + 1) {
									
									System.out.print("What is the number of the section you want to delete? Type an invalid number to cancel. ");
									num = scan.nextInt();
									scan.nextLine();

									
									if (num >= account.getListLengthSecondary()) {
										
										System.out.print("Invalid number try again.\n");
										continue;
												
									}
									
									account.deleteSecondary(num);
									System.out.print("\n");
									continue;
									
								} else if (num == account.getListLengthSecondary() + 2) {
									
									System.out.print("What is the number of the section you want to edit? Type an invalid number to cancel. ");
									num = scan.nextInt();
									scan.nextLine();

									
									if (num >= account.getListLengthSecondary()) {
										
										System.out.print("Invalid number try again.\n");
										continue;
												
									}
									
									System.out.print("What is the new recipe? \nPress enter to make a new line. \nEnter the number 0 to end making your recipe. \nOld recipe below\n" + account.getRecipe(num) + "\n");

									while (recipe2.compareTo("0") != 0) {
										
										recipe = recipe + recipe2 + "\n";
										recipe2 = scan.nextLine();
										
									}
									
									account.editRecipe(num, recipe);
									recipe = "";
									recipe2 = "";
									continue;
								
								} else if (num < account.getListLengthSecondary()){
									
									System.out.print(account.getRecipe(num));
								
				
								} else {
								
									
									srun = false;
									
								}
								
								System.out.print("\n\n\n");

							}
						}
						
						srun = true;
						
					} else {
						
						run = false;
						
					}
				}
			}
			
			run = true;
			System.out.print("\n\n\n\n\n\n\n\n");
			account = null;
			
		}
	}

}
