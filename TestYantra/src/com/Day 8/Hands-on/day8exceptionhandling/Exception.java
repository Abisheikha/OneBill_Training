package com.ob.day8exceptionhandling;

/**
 * @author Abisheikha
 * Exception is an object thrown by jvm during the run-time and 
 * which stops the flow of execution.
 */
public class Exception {
	public static void main(String[] args) {
		int[] a;
		a = new int[4];
		try {
			System.out.println(a[5]);
			// System.out.println(a[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The index is out of range");
		}
		System.out.println("program end");
	}
}
