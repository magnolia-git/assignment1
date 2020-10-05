package com.meritamerica.assignment1;

public class CheckingAccount {
	
	double balance;
	
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public double getInterestRate() {
		return 0.0;
	}
	
	public boolean withdraw(double amount) {
		if (amount > getBalance()) {
			System.out.println("Insufficient funds.");
			return false;
		} else {
			
			return true;
		}
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Cannot add a value of $0 or less!");
			return false;
		} else {
			
			return true;
		}
	}
	
	public double futureValue(int years) {
		return 0.0;
	}
	
	public String toString() {
		
		return  "Checking Account Balance: $" + getBalance() + "\n" +
				"Checking Account Interest Rate: " + getInterestRate() + "\n" +
				"Checking Account Balance in 3 years: $" + futureValue(3);
		
	}
	
}