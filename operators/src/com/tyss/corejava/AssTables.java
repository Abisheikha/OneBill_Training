package com.tyss.corejava;

import java.util.Scanner;

/*
  Program to print the tables of a given number
 */
public class AssTables {
	static void tables(int x) {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + "x" + x + "=" + i * x);
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number: ");
		int num = input.nextInt();
		tables(num);

	}

}
