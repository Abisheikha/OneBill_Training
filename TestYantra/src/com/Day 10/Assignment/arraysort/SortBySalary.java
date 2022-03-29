package com.ob.day10.arraysort;

import java.util.Comparator;

/**
* @author Abisheikha
*/
public class SortBySalary implements Comparator<Employee>{
	
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.salary-o2.salary;
	}
}
