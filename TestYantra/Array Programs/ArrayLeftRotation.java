package com.ob.assignment;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Abisheikha
 */
public class ArrayLeftRotation {
	public static void main(String[] args) {
		int i,j;
		System.out.println("Enter number of elements: ");
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter array elements: ");
		for (i = 0; i < num; i++) {
			arr[i] = ip.nextInt();
		}
		for(i=0;i<2;i++) {
			int temp=arr[0];
			for(j=0;j<num-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[j]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
