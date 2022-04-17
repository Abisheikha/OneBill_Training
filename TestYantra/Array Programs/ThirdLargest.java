package com.ob.assignment;

import java.util.Scanner;

/**
 * @author Abisheikha
 */
public class ThirdLargest {
	public static void secLarge(int arr[],int num){
		int first = 0;
		int second = 0;
		int third=0;
		first = arr[0];
		for (int i = 1; i < num; i++) {
			if (first < arr[i]) {
				third=second;
				second = first;
				first = arr[i];
			}
			else if(second<arr[i] && arr[i]!=first){
				third=second;
				second = arr[i];
			}
			else if(third<arr[i] && arr[i]!=second) {
				third = arr[i];
			}
		}

		System.out.println("The third largest element is "+ third);
	
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
