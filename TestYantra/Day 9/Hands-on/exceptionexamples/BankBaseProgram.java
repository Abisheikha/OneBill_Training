package com.tyss.exceptionexamples;

public class BankBaseProgram {

	double balance;

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("The balance after deposit is : " + balance);
		} else {
			System.out.println("Enter proper value");
		}
	}

	public void withdraw(double amount) {
		if (amount <= balance && amount > 0) {
			balance = balance - amount;
			System.out.println("The balance left : " + balance);
		} else {
			try {
				throw new InSufficientBalanceException("Insufficient Balance");
			} catch (InSufficientBalanceException e) {
				System.out.println(e);
				//e.getMessage();
			}
		}
	}

}
