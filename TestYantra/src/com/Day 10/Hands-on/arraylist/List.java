package com.ob.day10.arraylist;

import java.util.ArrayList;

/**
* @author Abisheikha
*/
public class List {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		System.out.println(list.get(2));
		System.out.println("--------");
		System.out.println(list);
	}
}
