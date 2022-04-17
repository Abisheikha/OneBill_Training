package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
*/
public class AddMatrices {
	static void addmatrix(int arr1[][],int arr2[][],int row , int col) {
		int[][] res_arr=new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res_arr[i][j]=arr1[i][j]+arr2[i][j];
				System.out.print(res_arr[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		System.out.println("Enter number of rows: ");
		Scanner ip = new Scanner(System.in);
		int row = ip.nextInt();
		System.out.println("Enter number of columns: ");
		int col = ip.nextInt();
		int[][] arr1 = new int[row][col];
		int[][] arr2 = new int[row][col];
		System.out.println("Enter first array elements: ");
		for (int i = 0; i < row; i++) {
			for(int j=0; j < col; j++) {
			arr1[i][j] = ip.nextInt();
			}
		}
		System.out.println("Enter second array elements: ");
		for (int i = 0; i < row; i++) {
			for(int j=0; j < col; j++) {
			arr2[i][j] = ip.nextInt();
			}
		}
		addmatrix(arr1,arr2,row,col);
	}
}
