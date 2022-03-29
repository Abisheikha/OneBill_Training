package com.tyss.assignmentday9;

import java.util.Scanner;

/**
* @author Abisheikha
* ----Fibonacci series------
*/
public class FibonacciProb2 {
	public static void main(String[] args) {
		int num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		num=scan.nextInt();
		int a=0;
		int b=1;
		int c=a+b;
		System.out.println(a);
		System.out.println(b);
		for(int i=0;c<=num;i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
}
