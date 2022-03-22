package com.tyss.assignment2;
/**
* @author Abisheikha
*/
public class Member {
	String name;
	int age;
	long phoneNo;
	String address;
	int salary;
	
	public Member(String name, int age, long phoneNo, String address, int salary) {
	//	super();
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}

	public void printSalary() {
		System.out.println(salary);
	}
}
