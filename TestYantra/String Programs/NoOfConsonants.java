package com.ob.assignment;

import java.util.Scanner;

/**
 * @author Abisheikha 
 * to find the total number of consonants present in a string
 */
public class NoOfConsonants {
	static void consonants(String str) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {
				if (!(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I'
						|| str.charAt(i) == 'O' || str.charAt(i) == 'U')) {
					count++;
				}
			}
		}
		System.out.println("The number of consonants is " + count);
	}

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip = new Scanner(System.in);
		String str = ip.nextLine();
		consonants(str);
	}
}
