package com.tyss.assignment2;
/**
* @author Abisheikha
*/
public class Manager extends Member{
	String department;
	public Manager(String name, int age, long phoneNo, String address,int salary,String department) {
		super(name,age,phoneNo,address,salary);
		this.department=department;
}
}
