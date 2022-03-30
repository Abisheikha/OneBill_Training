package com.ob.day11.setexample;

/**
 * @author Abisheikha
 */
public class Student {
	int stud_id;
	String name;
	String dept;

	public Student(int stud_id, String name, String dept) {
		super();
		this.stud_id = stud_id;
		this.name = name;
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [stud_id=" + stud_id + ", name=" + name + ", dept=" + dept + "]";
	}

	@Override
	public boolean equals(Object obj) {
		Student std = (Student) obj;
		return this.stud_id == std.stud_id;// have unique id
	}

	@Override
	public int hashCode() {
		
		return stud_id;
	}
	
	

}
