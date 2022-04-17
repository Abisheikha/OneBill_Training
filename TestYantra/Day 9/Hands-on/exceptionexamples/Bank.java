package com.tyss.exceptionexamples;

public class Bank {

	public static void main(String[] args) {

	BankBaseProgram bankPg = new BankBaseProgram();	

	bankPg.getBalance();
	bankPg.deposit(1000);
	bankPg.withdraw(500);
	bankPg.withdraw(600);
	}

}
