package com.ob.day10.arraysort;

import java.util.Comparator;

/**
* @author Abisheikha
*/
public class Employee implements Comparator<Employee>{
	int id;
	String name;
	int salary;
	String designation;
	
	
	public Employee(int id, String name, String designation,int salary) {
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


	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
