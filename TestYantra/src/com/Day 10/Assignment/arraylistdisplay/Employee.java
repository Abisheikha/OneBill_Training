package com.ob.day10.arraylistdisplay;

import java.util.Comparator;

/**
 * @author Abisheikha
 */
public class Employee implements Comparable<Employee> {
	int id;
	String name;
	double salary;
	String designation;

	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
	}

	@Override
	public String toString() {
		return "Main [id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation + "]";
	}

//		@Override
//		public int compareTo(Employee o) {   //sort by Id
//			return this.id-o.id;// ascending order
//		}

	@Override
	public int compareTo(Employee o) {      //sort by name
		return this.name.compareTo(o.name);

	}

//		@Override
//		{
//			return o1.name.compareTo(o2.name);
//		}
//		public Object get(int index) {
//			return array[index];
//		}
//		

}
