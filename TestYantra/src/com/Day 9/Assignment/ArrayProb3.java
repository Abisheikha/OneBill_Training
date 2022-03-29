package com.tyss.assignmentday9;
import java.util.Arrays;
/**
* @author Abisheikha
*/
import java.util.Scanner;
public class ArrayProb3 {
	int[] b=new int[2];
	public void NewArray(int[] arr){
		if(arr.length<2) {
			System.out.println(Arrays.toString(arr));
		}
		else {
			b[0]=arr[0];
			b[1]=arr[1];
			System.out.println(Arrays.toString(b));
		}
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
		ArrayProb3 a=new ArrayProb3();
		a.NewArray(arr);
		
	}
}
