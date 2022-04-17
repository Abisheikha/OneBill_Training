package com.tyss.assignment4;
/**
* @author Abisheikha
*/
public class Main {
	public static void main(String[] args) {
		BankA bankA = new BankA();
		bankA.setBalance(1000);
		BankB bankB = new BankB();
		bankB.setBalance(2000);
		BankC bankC = new BankC();
		bankC.setBalance(3000);
		System.out.println(bankA.getBalance());
		System.out.println(bankB.getBalance());
		System.out.println(bankC.getBalance());

		
		
		
	}
}
