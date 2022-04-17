package com.ob.assignment;
import java.util.LinkedHashSet;
import java.util.Scanner;


/**
* @author Abisheikha
*/
public class RemoveDuplicates {
	static void duplicates(int arr[], int arr_size) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		for(int i=0;i<arr_size;i++) {
			linkedHashSet.add(arr[i]);
		}
		System.out.println(linkedHashSet);
	}
	public static void main(String[] args) {
		System.out.println("Enter number of elements: ");
		Scanner ip = new Scanner(System.in);
		int arr_size = ip.nextInt();
		int[] arr = new int[arr_size];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < arr_size; i++) {
			arr[i] = ip.nextInt();
		}
		duplicates(arr,arr_size);
	}
}
