package com.ob.assignment;

import java.util.Scanner;

/**
 * @author Abisheikha 
 * Java program to divide a string into N parts
 */
public class StringParts {
	static void StringInParts(String str) {
		System.out.println("Enter the number of parts: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int temp = 0, chars = (str.length() / n);
		// String res;
		String[] res1 = new String[n];
		if (str.length() % n != 0) {
			System.out.println("The string cannot be divided into equal parts..");
			return;
		} else {

			for (int i = 0; i < str.length(); i = i + chars) {
				String parts = str.substring(i, i + chars);
				res1[temp] = parts;
				temp++;
			}
		}
		for (int i = 0; i < res1.length; i++) {
			System.out.println(res1[i]);
		}

//		else {
//			for (int i = 0; i < str.length(); i++) {
//				if(i!=0 && (i%n==0))
//					System.out.println();
//				System.out.print(str.charAt(i));
//			}
//		}
	}

	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip = new Scanner(System.in);
		String str = ip.nextLine();
		StringInParts(str);

	}
}
