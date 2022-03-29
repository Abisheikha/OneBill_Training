package com.ob.day10.assarraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
* @author Abisheikha
*/
public class List {
	public static void main(String[] args) {
			MyArrayList list=new MyArrayList();
			list.add(10);
			list.add(20);
			list.add(30);
			list.add(80);
			list.add(50);
			list.add(70);
			list.add(40);
			System.out.println(list);
			System.out.println("==========");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the index to remove element: ");
			int index=sc.nextInt();
			list.remove(index);
			
			System.out.println(list);
	}
}
