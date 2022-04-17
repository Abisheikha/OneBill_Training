package com.tyss.assignmentday9;

import java.util.Arrays;
import java.util.Scanner;

/**
* @author Abisheikha
*/
public class ArrayProb4 {
	public int NewArray(int[] arr){
		//Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==3 && i<(arr.length-2)) {
				if(arr[i+1]==3 && arr[i+2]==3) {
					System.out.println("true");
					return 0;
				}
			}
		}
		System.out.println("false");
		return 0;
	}
	public static void main(String[] args) {
		int []arr;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter array size");
		int arraySize=scan.nextInt();
		System.out.println("Enter array elements: ");
		arr=new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			arr[i]=scan.nextInt();
		}
		ArrayProb4 a=new ArrayProb4();
		a.NewArray(arr);
	
	}
}
