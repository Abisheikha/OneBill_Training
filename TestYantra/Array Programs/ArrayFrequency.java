package com.ob.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author Abisheikha
*/
public class ArrayFrequency {
	public static void main(String[] args) {
		System.out.println("Enter number of elements: ");
		Scanner ip=new Scanner(System.in);
		int num= ip.nextInt();
		int[] arr=new int[num];
		int hasharr[]=new int[100];
		int max=arr[0];
		System.out.println("Enter array elements: ");
		for(int i=0;i<num;i++) {
			arr[i]=ip.nextInt();
			++hasharr[arr[i]];	
			if(max < arr[i])
				max=arr[i];
		}
		for(int i=0;i<=max;i++) {
			if(hasharr[i]>1)
			System.out.println("The element "+ i + " is present in array for "+ hasharr[i]+" times");
		}
	}

	
}
