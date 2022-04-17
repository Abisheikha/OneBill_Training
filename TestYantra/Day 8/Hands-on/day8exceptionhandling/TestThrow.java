package com.ob.day8exceptionhandling;

import java.lang.Exception;

/**
 * @author Abisheikha
 * Exception is an object thrown by jvm during the run-time and 
 * which stops the flow of execution.
 */
public class TestThrow {
	public static void main(String[] args) {
		System.out.println("Program started");
		try {
			throw new ArithmeticException();
		} catch (Exception e) {
			//
			System.out.println("nnn");
			e.printStackTrace();
		}
		System.out.println("Program end");
	}
}
