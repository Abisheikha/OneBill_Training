package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
* to find if two strings are anagram
*/
public class Anagram {
	static void anagram(String str1,String str2) {
		int i;
		char str1_arr[]=str1.toCharArray();
		char str2_arr[]=str2.toCharArray();
		int[] count=new int[26];
		if(str1.length()==str2.length()) {
		for (i = 0; i < str1.length(); i++) {
			count[str1_arr[i]-'a']++;
			count[str2_arr[i]-'a']--;	
		}
		for(i=0;i<26;i++) {
		if(count[i]!=0) {
			System.out.println("The strings are not anagram");
			return;
		}
		}
		if(i==26)
			System.out.println("The strings are anagram");
	
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the two Strings: ");
		Scanner ip=new Scanner(System.in);
		String st1=ip.nextLine();
		String str1=st1.toLowerCase();
		String st2=ip.nextLine();
		String str2=st2.toLowerCase();
		anagram(str1,str2);
	}
}
