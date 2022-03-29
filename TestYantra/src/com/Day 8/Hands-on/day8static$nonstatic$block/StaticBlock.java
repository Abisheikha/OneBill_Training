package com.ob.day8static$nonstatic$block;

/**
 * @author Abisheikha 
 * Static block runs when class is loaded into the memory as
 * it is bind to the class.
 */
public class StaticBlock {
	static int a, b;
	static {
		System.out.println("First static block");
		a = 10;
		b = 20;
		System.out.println(a);
		System.out.println(b);
	}
	static {
		System.out.println("Second static block");
		a = 200;
		b = 300;
	}

	public static void main(String[] args) {
		System.out.println("Inside main block");
		System.out.println(a);
		System.out.println(b);
	}

}
