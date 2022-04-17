package com.ob.day11.setcomparator;

import java.util.Comparator;

/**
* @author Abisheikha
*/
public class SortById implements Comparator<Student> {
	@Override
	public int compare(Student o1, Student o2) {
		return o1.stud_id-o2.stud_id;
	}
}
