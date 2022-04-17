package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
* to determine whether a given string is palindrome
*/
public class StringPalindrome {
	static void palindrome(String str1) {
		char[] str= str1.toCharArray();
		int temp=str.length-1;
		for(int i=0;i<(str.length/2);i++) {
			if(str[i]!=str[temp])
			{
				System.out.println("The String is not a palindrome");
				return;
			}
			--temp;
		}
		System.out.println("The string is palindrome");
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();
		palindrome(str);
	}
}
