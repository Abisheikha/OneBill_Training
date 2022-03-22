package com.tyss.thisandsuper;

/**
 * @author Abisheikha
 */
public class Child extends Parent {
	int z, a, b, c, d;

	public Child(int x, int y) {
		super(x, y);
	}

	public Child(int a, int b, int c, int x, int y) {
		this(x, y);
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Child(int x, int y, int z, int a, int b, int c, int d) {
		this(a, b, c, x, y);
		this.z = z;
		this.d = d;
	}
}
