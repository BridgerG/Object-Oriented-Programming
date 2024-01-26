package checkandsavings;

import java.util.Date;

public class Account {

	private int id = 0;
	
	private double balance = 0;
	private double annualInterestRate = 0;
	
	private Date datecreated = new Date();
	
	Account() {
	}
	
	Account(int newID, double newBalance) {
		
		id = newID;
		balance = newBalance;
		
	}
	
	int GetID() {
		
		return id;
		
	}
	
	void replaceID(int newID){
		
		id = newID;
		
	}
	
	double GetBalance() {
		
		return balance;
		
	}
	
	void replaceBalance(double newBalance){
		
		balance = newBalance;
		
	}
	
	double GetAnnualInterestRate() {
		
		return annualInterestRate;
		
	}
	
	void replaceAnnualInterestRate(double newannualInterestRate){
		
		annualInterestRate = newannualInterestRate;
		
	}
	
	Date GetDateCreated() {
		
		return datecreated;
		
	}
	
	double GetMonthlyInterestRate() {
		
		return annualInterestRate / 12;
		
	}
	
	double GetMonthlyInterest() {
		
		return balance * ((annualInterestRate / 100) / 12);
		
	}
	
	void withdraw(double cost) {
		
		balance -= cost;
		
	}
	
	void deposit(double save) {
		
		balance += save;
		
	}
	
	public String toString() {
		
		return "ID = " + id + "\nBalance = " + balance + "\nAnnual Interest Rate = " + annualInterestRate + "\nDate created " + datecreated;
		
	}
}
