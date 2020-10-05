package com.meritamerica.assignment1;

public class SavingsAccount {
	
	/*
	 * Instance Variables:
	 */
	
	private double accountBalance;
	
	/*
	 * Constants:
	 */
	
	/*
	 * Constructor:
	 */
	
	public SavingsAccount(double openingBalance) {
		this.accountBalance = openingBalance;
		System.out.println("New savings account created.");
	}
	
	/*
	 * Methods:
	 */
	
	public double getBalance() {
		return this.accountBalance;
	}
	
	public double getInterestRate() {
		return 0.0; //dummy
	}
	
	public boolean withdraw(double amount) {
		if(amount <= this.accountBalance) {
			this.accountBalance -= amount;
			return true;
		} else {
			System.out.println("You have insufficient funds to complete this transaction.\n" +
								"Please call your bank if you feel this information is incorrect.");
			return false;
		}
	}
	
	public boolean deposit(double amount) {
		if(amount <= 0) {
			System.out.println("Error, please try again.");
			return false;
		} else {
			this.accountBalance += amount;
			System.out.println("Deposited $" + amount + " into your account.");
			return true;
		}
	}
	
	public double futureValue(int years) {
		return 0.0; //dummy
	}
	
	public String toString() {
		return "Savings Account Balance: " + this.accountBalance + "\n" +
				"Savings Account Interest Rate: " + "To be calculated" + "\n" +
				"Savings Account Balance in 3 years: " + "to be calculated";//futureValue(3);
	}
	
}