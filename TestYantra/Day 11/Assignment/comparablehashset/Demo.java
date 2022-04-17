package com.ob.day11ass.comparablehashset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
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
		HashSet<Student> hashSet = new HashSet<>();
		hashSet.add(student1);
		hashSet.add(student2);
		hashSet.add(student3);
		hashSet.add(student4);
		hashSet.add(student5);
		hashSet.add(student6);
		System.out.println(hashSet);
		System.out.println("----------After sorting by id------------");
		ArrayList<Student> arrayList = new ArrayList<>(hashSet);
		Collections.sort(arrayList);
		for (Student student : hashSet) {
			System.out.println(student);
		}
		System.out.println("\n----------After sorting by name------------");
		Collections.sort(arrayList,new SortByName());
		for (Student student : arrayList) {
			System.out.println(student);
		}
	}
}
