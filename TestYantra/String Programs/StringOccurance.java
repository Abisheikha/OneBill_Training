package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
* to find maximum and minimum occurring characters in a string
*/
public class StringOccurance {
	static void MinMaxOccurance(String str) {
		char[] str1= str.toCharArray();
		int[] count=new int[26];
		for (int i = 0; i < str1.length; i++) {
			if((str1[i]>=65 && str1[i]<=90) ||(str1[i]>=97 && str1[i]<=122 )) 
			count[str1[i]-'a']++;
		}
		int min,max;
		char index_min = 0, index_max=0;
		min=max=count[0];
		for (int i = 0; i < 26; i++) {
			if(min>count[i] && count[i]!=0) 
				min =count[i];
			if(max<count[i] && count[i]!=0) 
				max =count[i];
		}
		System.out.println("The minimum occuring character("+ min+" times)is ");
		for (int i = 0; i < 26; i++) {
			if(count[i]==min) 
				System.out.println((char)(i +'a'));
		}
		System.out.println("The maximum occuring character("+ max+" times) is ");
		for (int i = 0; i < 26; i++) {
			if(count[i]==max) 
				System.out.println((char)(i +'a'));
				
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter the String: ");
		Scanner ip = new Scanner(System.in);
		String st1=ip.nextLine();
		String str=st1.toLowerCase();
		MinMaxOccurance(str);
	}
}
