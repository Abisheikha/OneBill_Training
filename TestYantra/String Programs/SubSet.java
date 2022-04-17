package com.ob.assignment;

import java.util.Scanner;

public class SubSet {
	public static void subset(String str)
	{
		String str1[]=new String[str.length()*(str.length()+1)/2];
		int i,j,k,l=0;
		for(i=0;i<str.length();i++)
		{
			k=0;
			char arr[]=new char[str.length()];
			for(j=i;j<str.length();j++)
			{
			    arr[k]=str.charAt(j);
			    str1[l]=String.valueOf(arr);
			    k++;
			    l++;
			}
		}
		for(i=0;i<l;i++)
			System.out.println(str1[i]+" ");
	}
	public static void main(String[] args)
	{
		 String str;
	     System.out.println("enter the string");
	     Scanner sc=new Scanner(System.in);
	     str=sc.nextLine();
	     subset(str);
	}
	

}