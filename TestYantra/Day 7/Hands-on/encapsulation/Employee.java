package com.ob.encapsulation;

/**
 * @author Abisheikha
 */
public class Employee {
	private String name = "abi";
	private int age = 20;
	private double salary = 50000;
	private String designation = "Trainee";
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
