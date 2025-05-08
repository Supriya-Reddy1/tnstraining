package com.tnsif.Interface;

public class BankImple implements Bank {
	double balance=5000;
	public void withdraw(double amount) {
		if (amount<=balance) {
			balance=balance-amount;
			System.out.println("Balance after withdrawl"+balance);
		}
		else {
			System.err.println("withdraw amount exceeds");
		}
		
	}
	public void deposit(double amount) {
		if (amount>0) {
		balance=balance+amount; 
		System.out.println("Balance after deposit"+balance);
		}
		else {
			System.err.println("deposit_limit exceded");
		}
		}

}
