package com.tyss.corejava;
import java.util.Scanner;
/*
 * To print odd and even numbers upto the given number
 */
public class AssEvenOdd {
	static void evenodd(int num)
	{
		System.out.println("Odd numbers");
		for(int i=0;i<=num;i++)
		{
			if(i%2!=0)
				System.out.println(i);
		}
		System.out.println("Even numbers");
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
				System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter number: ");
		int num= input.nextInt();
		evenodd(num);
		
	}

}
