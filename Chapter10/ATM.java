package chapter10_7;

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Accountnum = 4000,  imputter= 0;;
		double money = 0;
		
		Account [] ac = new Account[10];
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < 10; i++) {
			
			ac[i] = new Account(i, 100);
			
		}
		
		while(true) {
			
			System.out.print("Enter an ID: ");
			Accountnum = scan.nextInt();
			
			if (Accountnum < 10 && Accountnum > -1) {
				
				while(true) {
					
					System.out.println("\nMain menu\n1. Check Balance\n2. Withdraw\n3. Deposit\n4. Exit");
					imputter = scan.nextInt();
					
					if (imputter == 1) {
						
						System.out.println("Current balance " + ac[Accountnum].GetBalance());
						
					} else if (imputter == 2) {
						
						System.out.print("\nHow much do you want to withdraw: ");
						money = scan.nextDouble();
						
						ac[Accountnum].withdraw(money);
						
					}  else if (imputter == 3) {
						
						System.out.print("\nHow much do you want to deposit: ");
						money = scan.nextDouble();
						
						ac[Accountnum].deposit(money);
						
					} else { 
						
						break;
						
					}
					
					
				}
				
				
			} else {
				
				System.out.println("Account does not exist");
			}
			
			
		}
	}

}
