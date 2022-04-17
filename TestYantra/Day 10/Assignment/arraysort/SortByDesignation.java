package com.ob.day10.arraysort;

import java.util.Comparator;

/**
* @author Abisheikha
*/
public class SortByDesignation implements Comparator<Employee> {
	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.designation.compareTo(o2.designation);
	}
}
