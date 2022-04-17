package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
* to find Reverse of the string character by character
*/
public class StringReverse {
	static void reverse(String str) {
		char[] str1= str.toCharArray();
		int right=str1.length-1;
		char temp;
		for (int i = 0; i < (str1.length/2); i++) {
			temp=str1[i];
			str1[i]=str1[right];
			str1[right]=temp;
			--right;
		}
		System.out.println("The reversed string is: ");
		for (int i = 0; i < str1.length; i++) {
			System.out.print(str1[i]);
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();
		reverse(str);
	}
}
