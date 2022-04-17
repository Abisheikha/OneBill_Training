package com.ob.assignment;
import java.util.Scanner;

public class MergeSort {
	public static void mergesort(int arr[],int lb,int ub)
	{
		int mid;
		if(lb<ub)
		{
		  mid=(lb+ub)/2;
		  mergesort(arr,lb,mid);
		  mergesort(arr,mid+1,ub);
		  merge(arr,lb,mid,ub);
		}
		  
	}
	public static void merge(int arr[],int lb,int mid,int ub)
	{
	   int i=lb,j=mid+1,k=lb,arr1[]=new int[ub+1];
	   while(i<=mid&&j<=ub)
	   {
		   if(arr[i]<=arr[j])
		   {
			   arr1[k]=arr[i];
			   i++;
			   k++;
		   }
		   else
		   {
			   arr1[k]=arr[j];
			   j++;
			   k++;
		   }
	   }
	   while(i<=mid)
	   {
		   arr1[k]=arr[i];
		   i++;
		   k++;
	   }
	   while(j<=ub)
	   {
		   arr1[k]=arr[j];
		   j++;
		   k++;
	   }
	   for(i=lb;i<=ub;i++)
		   arr[i]=arr1[i];
		
	}
	public static void main(String[] args)
	{
		int arr[],n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no. of elements in the array");
		n=sc.nextInt();
		arr=new int[n];
		System.out.println("enter the array elements:");
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		mergesort(arr,0,n-1);
		System.out.println("after sorting");
		for(i=0;i<n;i++)
			System.out.println(arr[i]);
		
	}

}