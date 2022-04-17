package com.ob.day11ass.linkedhashset;

import java.util.Comparator;

/**
* @author Abisheikha
*/
public class SortByName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.name.compareTo(o2.name);
	}
	
}
