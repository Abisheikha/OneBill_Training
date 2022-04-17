package com.tyss.problemstmt;

@SuppressWarnings("serial")
public class AgeNotValidException extends RuntimeException{

	public AgeNotValidException(String message) {
		super(message);
	}
}
