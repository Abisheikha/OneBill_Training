package com.tyss.assignment1;

import java.util.Scanner;

/**
* @author Abisheikha
* ---Print the tables of given number
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
