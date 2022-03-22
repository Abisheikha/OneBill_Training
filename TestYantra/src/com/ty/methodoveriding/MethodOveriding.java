package com.ty.methodoveriding;

/**
 * @author Abisheikha Method Overiding : Changing implementation of method of
 *         superclass in subclass
 */
public class MethodOveriding {
	public static void main(String[] args) {
		Test test = new Test();
		test.message();
		int add = test.add(10, 20);
		System.out.println(add);
		Test1 test1 = new Test1();
		test1.message();
		int add1 = test1.add(10, 20);
		System.out.println(add1);

	}
}
