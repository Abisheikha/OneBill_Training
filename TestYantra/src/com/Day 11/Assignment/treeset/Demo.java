package com.ob.day11ass.treeset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import com.ob.day11ass.comparablehashset.SortByName;
import com.ob.day11ass.comparablehashset.Student;

/**
* @author Abisheikha
*/
public class Demo {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Abi", "IT");
		Student student2 = new Student(3, "Bhuvi", "CSE");
		Student student3 = new Student(3, "Sree", "ECE");
		Student student4 = new Student(4, "Priya", "ECE");
		Student student5 = new Student(2, "Sree", "IT");
		Student student6 = new Student(5, "Nivi", "EEE");
		TreeSet<Student> treeSet = new TreeSet<>();
		treeSet.add(student1);
		treeSet.add(student2);
		treeSet.add(student3);
		treeSet.add(student4);
		treeSet.add(student5);
		treeSet.add(student6);
		System.out.println(treeSet);
//		ArrayList<Student> arrayList = new ArrayList<>(treeSet);
//		for (Student student : arrayList) {
//			System.out.println(student);
//		}
//		
//		System.out.println("\n----------After sorting by name------------");
//		Collections.sort(arrayList,new SortByName());
//		for (Student student : arrayList) {
//			System.out.println(student);
//		}
	}
}
