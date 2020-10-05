package com.meritamerica.assignment1;

public class MeritAmericaBankApp {
	public static void main(String[] args) {
		AccountHolder Bill = new AccountHolder("Masaki","Bill","Sonezaki","123121234",100,1000);
		System.out.println(Bill);
		
//		System.out.println(Bill.getFirstName());
		
		//Bill.getCheckingAccount().deposit(500);
		//Bill.getCheckingAccount().withdraw(800);
		//System.out.println(Bill.getCheckingAccount());
	}
}