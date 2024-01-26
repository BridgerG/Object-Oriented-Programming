package checkandsavings;

public class Checking extends Account{
	
	private double overdraftLimit = 100;
	
	Checking() {
	}
	
	Checking(int id, double balance, double overdraftLimit) {
		
		super.replaceID(id);
		super.replaceBalance(balance);
		
		this.overdraftLimit = overdraftLimit;
		
	}
	
	double GetOverdraftLimit() {
		
		return overdraftLimit;
		
	}
	
	void replaceOverdraftLimit(double overdraftLimit) {
		
		this.overdraftLimit = overdraftLimit;
		
	}

	@Override
	void withdraw(double cost) {
		
		if (super.GetBalance() - cost > 0 - overdraftLimit) {
			
			super.withdraw(cost);
			
		} else {
			
			System.out.print("This would put you over your overdraft limit: Transaction Cancled");
			
		}
	
	}
		
	@Override
	public String toString() {
		
		return super.toString() + "\nOverdraft Limit = " + overdraftLimit;
	}
	
}
