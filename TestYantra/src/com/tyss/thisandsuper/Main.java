package com.tyss.thisandsuper;

/**
 * @author Abisheikha
 * 
 *         this -> refers to current class object super -> refers to super class
 *         object
 */
public class Main {
	public static void main(String[] args) {
		Child child = new Child(10, 20, 30, 40, 50, 60, 70);

		System.out.println(child.x);
		System.out.println(child.y);
		System.out.println(child.z);
		System.out.println(child.a);
		System.out.println(child.b);
		System.out.println(child.c);
		System.out.println(child.d);

	}
}
