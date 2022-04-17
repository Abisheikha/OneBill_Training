package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
*/
public class Matrixmultiplication {
	static void multiply(int arr1[][],int arr2[][],int row1,int col1,int row2,int col2) {
		int[][] res_arr= new int[row1][col2];
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				for(int k=0;k<row2;k++) {
				res_arr[i][j]+=arr1[i][k]*arr2[k][j];
				}
				System.out.print(res_arr[i][j] + " ");
			}
			System.out.println();
		}
	}
public static void main(String[] args) {
	System.out.println("Enter number of rows and columns of first matrix: ");
	Scanner ip = new Scanner(System.in);
	int row1 = ip.nextInt();
	int col1 = ip.nextInt();
	System.out.println("Enter number of rows and columns of second matrix: ");
	int row2 = ip.nextInt();
	int col2 = ip.nextInt();
	int[][] arr1 = new int[row1][col1];
	int[][] arr2 = new int[row2][col2];
	if(col1!=row2) {
		System.out.println("The multiplication cannot be performed");
	}
	else {
	System.out.println("Enter first array elements: ");
	for (int i = 0; i < row1; i++) {
		for(int j=0; j < col1; j++) {
		arr1[i][j] = ip.nextInt();
		}
	}
	System.out.println("Enter second array elements: ");
	for (int i = 0; i < row2; i++) {
		for(int j=0; j < col2; j++) {
		arr2[i][j] = ip.nextInt();
		}
	}
	multiply(arr1,arr2,row1,col1,row2,col2);
	}
	
}
}
