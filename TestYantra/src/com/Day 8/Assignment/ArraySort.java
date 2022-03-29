package com.tyss.assignmentday8;

import java.util.Scanner;

/**
* @author Abisheikha
*/
public class ArraySort {
	public static void main(String[] args) {
		int []arr;
		System.out.println("Enter array size");
		Scanner a=new Scanner(System.in);
		System.out.println("Enter array elements");
		int arraySize=a.nextInt();
		arr=new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			int num=a.nextInt();
			arr[i]=num;
		}
		for(int i=0;i<arraySize;i++) {
			for(int j=i+1;j<arraySize;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arraySize;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
