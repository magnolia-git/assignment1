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
		return 0.0001;
	}
	
	public boolean withdraw(double amount) {
		if (amount > getBalance()) {
			System.out.println("Insufficient funds.");
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	
	public boolean deposit(double amount) {
		if (amount <= 0) {
			System.out.println("Cannot add a value of $0 or less!");
			return false;
		} else {
			balance += amount;
			return true;
		}
	}
	
	public double truncateValue(double toTruncate) {
		toTruncate *= 100; 
		int truncatedInt = (int)toTruncate;
		double truncatedDouble = (double)truncatedInt / 100;
		return truncatedDouble;
	}
	
	public double futureValue(int years) {
		return getBalance() * (Math.pow(1 + getInterestRate(), years));

	}
	
	public String toString() {
		
		return  "Checking Account Balance: $" + getBalance() + "\n" +
				"Checking Account Interest Rate: 0.0001\n" +
				"Checking Account Balance in 3 years: $" + truncateValue(futureValue(3));
	}
	
}