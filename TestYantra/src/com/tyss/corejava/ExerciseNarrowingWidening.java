package com.tyss.corejava;

/**
 * @author Abisheikha 
 * Narrowing and widening
 */
public class ExerciseNarrowingWidening {
	public static void main(String[] args) {
		/*---widening---*/
		byte x = 10;
		byte y = 20;
		byte z = (byte) (x + y); // byte z=x+y; will result in error
		System.out.println(z);

		int a = 100;
		long b = a; // if long a =100; it cannot be stored in int datatype if done there will be
					// data loss
		System.out.println(b);

		/*-----Narrowing------*/
		long c = 2000;
		int d = (int) c;// there will be data loss
		System.out.println(d);

	}
}
