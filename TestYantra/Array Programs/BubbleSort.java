package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
*/
public class BubbleSort {
	static void bubblesort(int arr[], int num){
		int temp;
		for(int i=0;i<num-1;i++) {
			for(int j=0;j<num-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("Array after sorting is: ");
		for(int i=0;i<num;i++) {
			System.out.println(arr[i]);
		}
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
	bubblesort(arr,num);
}
}
