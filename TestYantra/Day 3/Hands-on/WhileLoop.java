package com.tyss.corejava;

public class WhileLoop {
	public static void main(String[] args) {
		int i = 0;
		/*----------print odd numbers using while loop------*/
		while (i < 100) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
			i++;
		}
	}

}
