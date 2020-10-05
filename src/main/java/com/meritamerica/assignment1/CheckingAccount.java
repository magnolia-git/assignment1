package com.meritamerica.assignment1;

public class CheckingAccount {
	
	double openingBalance;
	
	public CheckingAccount(double openingBalance) {
		this.openingBalance = openingBalance;
	}
	
	double getBalance() {
		
	}
	
	double getInterestRate() {
		
	}
	
	boolean withdraw(double amount) {
		
	}
	
	boolean deposit(double amount) {
		
	}
	
	double futureValue(int years) {
		
	}
	
	public String toString() {
		
		return  "Checking Account Balance: $" + getBalance() + "\n" +
				"Checking Account Interest Rate: " + getInterestRate() + "\n" +
				"Checking Account Balance in 3 years: $" + futureValue(3);
		
	}
	
}