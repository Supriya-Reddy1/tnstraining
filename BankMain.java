package com.tnsif.Interface;

public interface BankMain {
	public static void main(String args[]) {
		BankImple ob=new BankImple();
				ob.withdraw(2000);
				ob.deposit(5000);
	}

}
