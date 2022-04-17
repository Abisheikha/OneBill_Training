package com.ob.day10.list;

import java.util.ArrayList;

/**
* @author Abisheikha
*/
public class Demo {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		ArrayList<Integer> l=new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		
		l.addAll(list);
		
		ArrayList<Integer> li=new ArrayList<>();
		li.add(100);
		li.add(200);
		
		System.out.println(l);
		l.removeAll(li);
		System.out.println("-----After removal of 100 and 200-----");
		System.out.println(l);
	}
}
