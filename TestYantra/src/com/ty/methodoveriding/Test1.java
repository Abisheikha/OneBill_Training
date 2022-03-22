package com.ty.methodoveriding;

/**
 * @author Abisheikha
 */
public class Test1 extends Test {
	@Override
	public void message() {
		System.out.println("Message received");
	}

	public int add(int x, int y) {
		return (x + y + 10);
	}
}
