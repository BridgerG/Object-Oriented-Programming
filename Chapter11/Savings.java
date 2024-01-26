package checkandsavings;

public class Savings extends Account{
	
	Savings() {
	}
	
	Savings(int id, double balance) {
		
		super.replaceID(id);
		super.replaceBalance(balance);
		
	}
	
	@Override
	void withdraw(double cost) {
		
		if (super.GetBalance() - cost > 0) {
			
			super.withdraw(cost);
			
		} else {
			
			System.out.print("This would overdraft you: Transaction Cancled");
			
		}
	
	}

	@Override
	public String toString() {
		
		return super.toString() + "\nCannot be overdrawn";
		
	}
}
