package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
*/
public class ArrayDuplicates {
	public static void main(String[] args) {
		int i;
		System.out.println("Enter number of elements: ");
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int[] arr = new int[num];
		int hasharr[]=new int[100];
		int max=arr[0];
		System.out.println("Enter array elements: ");
		for(i=0;i<num;i++) {
			arr[i]=ip.nextInt();
			++hasharr[arr[i]];	
			if(max < arr[i])
				max=arr[i];
		}
		System.out.println("The duplicate elements are ");
		for(i=0;i<=max;i++) {
			if(hasharr[i]>1)
			System.out.print(i+" ");
		}
	}
}
