package com.tyss.assignmentday9;

import java.util.Scanner;

/**
* @author Abisheikha
*/
public class ArrayProb1 {
public static void main(String[] args) {
	int []arr;
	int sum=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter size");
	int size = scan.nextInt();
	arr=new int[size];
	System.out.println("Enter elements");
	for(int i=0;i<size;i++) {
		arr[i]=scan.nextInt();
		sum+=arr[i];
	}
	System.out.println("The result is");
	System.out.println(sum);
}
}
