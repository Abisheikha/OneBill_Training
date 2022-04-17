package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
*/
public class LargestElement {
	public static void main(String[] args) {
		System.out.println("Enter number of elements: ");
		Scanner ip=new Scanner(System.in);
		int num= ip.nextInt();
		int[] arr=new int[num];
		int max=arr[0];
		System.out.println("Enter array elements: ");
		for(int i=0;i<num;i++) {
			arr[i]=ip.nextInt();
			if(max < arr[i])
				max=arr[i];
		}
		System.out.println("The largest element is "+max);
	}
}
