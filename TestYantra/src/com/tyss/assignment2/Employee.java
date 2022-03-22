package com.tyss.assignment2;
/**
* @author Abisheikha
*/
public class Employee extends Member {
	String specialization;
	public Employee(String name, int age, long phoneNo, String address,int salary,String specialization) {
		super(name,age,phoneNo,address,salary);
		this.specialization=specialization;
	}
}
