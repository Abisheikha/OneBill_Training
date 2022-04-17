package com.tyss.corejava;

/**
 * @author Abisheikha
 *  Method overloading : A method with same name but different
 *         arguments
 */

public class MethodOverloading {
	void add(int x, int y) {
		int sum = x + y;
		System.out.println(sum);
	}

	// different number of arguments
	static void add(int x, int y, int z) {
		int sum = x + y + z;
		System.out.println(sum);
	}

	// different type of arguments
	static void add(double x, double y) {
		System.out.println(x + y);
	}

	// sequence of arguments
	static void add(int x, double y) {
		System.out.println(x + y);
	}

	static void add(double x, int y) {
		System.out.println(x + y);
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add(5, 4);
		MethodOverloading.add(-2, 4, 1);
		MethodOverloading.add(-2.4f, 1);
		MethodOverloading.add(-2.4f, 1.4f);
		MethodOverloading.add(-5, 1.9f);
	}
}
