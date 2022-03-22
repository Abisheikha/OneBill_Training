package com.tyss.corejava;
/* 
  	Program to complete the series s^0, s^1, s^2,....,s^n-1.
  	explanation:
  	  -> get two inputs a and b
  	  -> get the third input to print how many number we want to print.
  	  The expression is :
  	  (a+(2^0)*b),(a+(2^0)*b+(2^1)*b),......)
 */

import java.util.Scanner;
import java.lang.Math.*;

public class AssSeries {
	static void series(int a,int b,int num)
	{
		//int res=0;
		for(double i=0;i<num;i++)
		{
			a=a+((int)Math.pow(2,i)*b);
			System.out.print(a
					);
			if(i!=num-1)
				System.out.print(",");
		}
		
	}
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Enter the value of a,b and n:");
	int a = input.nextInt();
	int b = input.nextInt();
	int n = input.nextInt();
	System.out.print("(");
	series(a,b,n);
	System.out.print(")");
}
}
