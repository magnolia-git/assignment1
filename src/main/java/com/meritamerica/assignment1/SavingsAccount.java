package com.meritamerica.assignment1;

public class SavingsAccount {
	
	/*
	 * Instance Variables:
	 */
	
	private double accountBalance;
	private double interestRate;
	
	/*
	 * Constants:
	 */
	
	/*
	 * Constructor:
	 */
	
	public SavingsAccount(double openingBalance) {
		this.accountBalance = openingBalance;
		this.interestRate = 0.01;
		System.out.println("New savings account created.");
	}
	
	/*
	 * Methods:
	 */
	
	public double getBalance() {
		return this.accountBalance;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public boolean withdraw(double amount) {
		if(amount <= this.accountBalance) {
			this.accountBalance -= amount;
			return true;
		} else {
			System.out.println("You have insufficient funds to complete this transaction. " +
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
		return this.accountBalance * (Math.pow(1 + this.interestRate, years));
	}
	
	private double truncate(double valueToTruncate) {
		int newValue = (int)valueToTruncate * 100;
		return valueToTruncate = newValue / 100;
	}
	
	public String toString() {
		return "Savings Account Balance: $" + this.accountBalance + "\n" +
				"Savings Account Interest Rate: " + this.interestRate + "\n" +
				"Savings Account Balance in 3 years: $" + truncate(futureValue(3));
	}
	
}