package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
* Java program to find the total number of punctuations present in a string
*/
public class NoOfPunctuations {
	static void punctuations(String str) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==','|| str.charAt(i)=='.' ||str.charAt(i)=='!'||
					str.charAt(i)==';'|| str.charAt(i)==':'||str.charAt(i)=='\''||
					str.charAt(i)=='"'||str.charAt(i)=='/'||str.charAt(i)=='?'||
					str.charAt(i)=='-') {
				count++;
			}
		}
		System.out.println("The number of punctuations in the given string is :"+count);
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip=new Scanner(System.in);
		String str=ip.nextLine();
		punctuations(str);
	}
}
