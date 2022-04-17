package com.ob.assignment;

import java.util.Scanner;

/**
* @author Abisheikha
* Java program to find the transpose of a matrix
*/
public class TransposeMatrix {
	static void transpose(int arr[][], int row, int col) {
		int [][] res = new int[row][col];
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=arr[j][i];
			}
		}
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(res[i][j] +" ");
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
		int[][] arr = new int[row][col];
		System.out.println("Enter array elements: ");
		for (int i = 0; i < row; i++) {
			for(int j=0; j < col; j++) {
			arr[i][j] = ip.nextInt();
			}
		}
		transpose(arr,row,col);
	}
}
