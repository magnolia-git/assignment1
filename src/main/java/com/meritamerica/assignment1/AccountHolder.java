package com.meritamerica.assignment1;

public class AccountHolder {
	
	public String firstName;
	public String middleName;
	public String lastName;
	private String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	CheckingAccount checkAccount;
	SavingsAccount saveAccount;
	
	public AccountHolder(String firstName, String middleName, String lastName, String ssn, 
						double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
		checkAccount = new CheckingAccount(checkingAccountOpeningBalance);
		saveAccount = new SavingsAccount(savingsAccountOpeningBalance);
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	private void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	private void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	private String getSSN() {
		return ssn;
	}
	
	private void setSSN(String ssn) {
		this.ssn = ssn;
	}
	
	public CheckingAccount getCheckingAccount() {
		return this.checkAccount;
	}
	
	public SavingsAccount getSavingsAccount() {
		return this.saveAccount;
	}
	
	public String toString() {
		return "Name: " + firstName + " " + middleName + " " + lastName + "\n" +
				"SSN: " + ssn + "\n" +
				getCheckingAccount().toString() + "\n" +
//				"Checking Account Interest Rate: " + getCheckingAccount().getInterestRate() + "\n" +
//				"Checking Account Balance in 3 years: $" + getCheckingAccount().futureValue(3) + "\n" +
				getSavingsAccount().toString();
//				"Savings Account Interest Rate: " + getSavingsAccount().getInterestRate() + "\n" +
//				"Savings Account Balance in 3 years: $" + getSavingsAccount().futureValue(3);
	}
	
}