package com.tyss.assignment4;
/**
* @author Abisheikha
*/
public abstract class Bank {
	long Balance;
	abstract long getBalance();
	void setBalance(long Balance) {
		this.Balance = Balance;
	}
	
}
