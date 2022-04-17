package com.ob.assignment;

import java.util.Scanner;

/**
 * @author Abisheikha
 */
public class SecondLargestElement {
	public static void secLarge(int arr[],int num){
		int first = 0;
		int second = 0;
		first = arr[0];
		for (int i = 1; i < num; i++) {
			if (first < arr[i]) {
				second = first;
				first = arr[i];
			}
			else if(second<arr[i] && arr[i]!=first){
				second = arr[i];
			}
		}

		System.out.println("The second largest element is "+ second);
	
	}
	public static void main(String[] args) {
		System.out.println("Enter number of elements: ");
		Scanner ip = new Scanner(System.in);
		int num = ip.nextInt();
		int[] arr = new int[num];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < num; i++) {
			arr[i] = ip.nextInt();
		}
		secLarge(arr,num);
		
	}
}
