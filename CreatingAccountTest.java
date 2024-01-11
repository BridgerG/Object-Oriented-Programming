package exercise9_7;

public class CreatingAccountTest {

	public static void main(String[] args) {
		
		Account test1 = new Account(1122, 20000);
		
		test1.replaceAnnualInterestRate(4.5);
		
		test1.withdraw(2500);
		test1.deposit(3000);
		
		System.out.print("Balance: " + test1.GetBalance() + "\nMonthly Interest: " + test1.GetMonthlyInterest() + "\nDate Created: " + test1.GetDateCreated());
		
	}

}
