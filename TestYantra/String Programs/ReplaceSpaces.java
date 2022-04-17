package com.ob.assignment;

import java.util.Scanner;

/**
 * @author Abisheikha
 * to replace the spaces of a string with a specific character
 */
public class ReplaceSpaces {
	static void ReplaceSpaceInString(String str) {
		char[] str1 = str.toCharArray();
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] == ' ') {
				str1[i] = '$';
			}
		}
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip = new Scanner(System.in);
		String str = ip.nextLine();
		ReplaceSpaceInString(str);
	}
}
