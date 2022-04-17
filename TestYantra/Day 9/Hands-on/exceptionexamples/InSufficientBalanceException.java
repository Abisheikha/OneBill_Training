package com.tyss.exceptionexamples;

@SuppressWarnings("serial")
public class InSufficientBalanceException extends RuntimeException {

	String msg;

	public InSufficientBalanceException(String msg) {
		this.msg = msg;
	//	super(msg);
	}

	public String getMsg() {
		return msg;
	}
}
