package com.ob.day11ass.linkedhashset;

import java.util.Comparator;


/**
* @author Abisheikha
*/
public class SortByDept implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.dept.compareTo(o2.dept);
	}
}
