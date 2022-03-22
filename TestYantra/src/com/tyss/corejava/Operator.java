package com.tyss.corejava;

/*
 * Operators in java
 */
public class Operator {
	public static void main(String[] args) {
		int a = 10;

		// unary operators
		System.out.println("------unary-----");
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a--);
		System.out.println(++a);
		System.out.println();

		// arithmetic operators
		System.out.println("------arithmetic-----");
		float b = 5.3f;
		float c = 2.1f;
		System.out.println(b + c);
		System.out.println(b - c);
		System.out.println(b * c);
		System.out.println(b / c);
		System.out.println(b % c);
		System.out.println();

		// relational operators
		System.out.println("------relational-----");

		System.out.println(b > c); // true
		System.out.println(b < c); // false
		b = 1.1f;
		System.out.println(b >= c); // false
		System.out.println(b <= c); // true
		System.out.println(b == c); // false
		System.out.println(b != c); // true
		float d = 1.1f;
		System.out.println(b == d); // true
		System.out.println();

		// logical operators

		System.out.println("------logical-----");
		d = 3.3f;
		// b=1.1f, c=2.1f
		System.out.println(d > b && d > c); // true
		System.out.println(d < c || b < c); // true
		System.out.println();

		// bitwise operators

		System.out.println("------bitwise-----");
		System.out.println(10 | 2);
		System.out.println(10 & 2);
		System.out.println(4 | 10);

	}

}
