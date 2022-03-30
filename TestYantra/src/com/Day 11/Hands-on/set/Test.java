package com.ob.day11.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
* @author Abisheikha
*/
public class Test {
	public static <E> void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(10);
		hashSet.add(10);
		System.out.println(hashSet.add(10));//false - as the value is already present
		System.out.println(hashSet.add(50));//true - as the value is added
		hashSet.add(20);
		hashSet.add(80);
		System.out.println("--------HashSet----------");
		Iterator<Integer> iterator = hashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		System.out.println("--------LinkedHashSet----------");
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(10);
		linkedHashSet.add(30);
		linkedHashSet.add(10);
		linkedHashSet.add(40);
		linkedHashSet.add(60);
		linkedHashSet.add(90);
		
		Iterator<Integer> iterator2 = linkedHashSet.iterator();
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		}
		
		System.out.println("---------TreeSet------------");
		
		TreeSet<Integer> treeSet = new TreeSet<Integer>();
		treeSet.add(10);
		treeSet.add(40);
		treeSet.add(10);
		treeSet.add(30);
		treeSet.add(20);
		treeSet.add(50);
		Iterator<Integer> iterator3 = treeSet.iterator();
		while(iterator3.hasNext()) {
			System.out.println(iterator3.next());
		}
	}
}
