package com.ob.day11ass.linkedhashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;


/**
* @author Abisheikha
*/
public class Demo {
	public static void main(String[] args) {
		Student student1 = new Student(2, "Abi", "IT");
		Student student2 = new Student(5, "Bhuvi", "CSE");
		Student student3 = new Student(3, "Sree", "ECE");
		Student student4 = new Student(4, "Priya", "ECE");
		Student student5 = new Student(3, "Sree", "IT");
		Student student6 = new Student(1, "Nivi", "EEE");
		LinkedHashSet<Student> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(student1);
		linkedHashSet.add(student2);
		linkedHashSet.add(student3);
		linkedHashSet.add(student4);
		linkedHashSet.add(student5);
		linkedHashSet.add(student6);
		
		for (Student student : linkedHashSet) {
			System.out.println(student);
		}
		System.out.println("\n====After sorting===");
		ArrayList<Student> arrayList = new ArrayList<>(linkedHashSet);
		Collections.sort(arrayList);
		for (Student student : arrayList) {
			System.out.println(student);
		}
		System.out.println("\n========After sorting by name=====");
		Collections.sort(arrayList, new SortByName());
		for (Student student : arrayList) {
			System.out.println(student);
		}
		System.out.println("\n========After sorting by dept=====");
		Collections.sort(arrayList, new SortByDept());
		for (Student student : arrayList) {
			System.out.println(student);
		}

	}
}
