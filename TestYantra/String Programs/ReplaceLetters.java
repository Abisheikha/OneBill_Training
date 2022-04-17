package com.ob.assignment;

import java.util.Scanner;

/**
 * @author Abisheikha
 * to replace lower-case characters with upper-case and vice-versa
 */
public class ReplaceLetters {
	static void ReplaceUpperToLower(String str) {
		char[] str1 = str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if ((str1[i] >= 65 && str1[i] <= 90)) {
				str1[i] += 32;
			} else if (str1[i] >= 97 && str1[i] <= 122) {
				str1[i] -= 32;
			}
		}
		System.out.println("The modified string is: ");
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip = new Scanner(System.in);
		String str = ip.nextLine();
		ReplaceUpperToLower(str);
	}
}
