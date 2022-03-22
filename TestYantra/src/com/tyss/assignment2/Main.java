package com.tyss.assignment2;
/**
* @author Abisheikha
* 
* 1.Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee'
 and 'Manager' classes have data members 'specialization' and 'department' 
 respectively. Now, assign name, age, phone number, address and salary to an employee
  and a manager by making an object of both of these classes and print the same.
*/
public class Main {
	public static void main(String[] args) {
		Employee employee = new Employee("Arun",30,98765432l,"Street1",20000,"IT");
		Manager manager = new Manager("Sonu",23,9876544321l,"Street2",25000,"CSE");
		System.out.print("Employee salary is ");
		employee.printSalary();
		System.out.println("Employee name is "+employee.name);
		System.out.println("Employee age is "+employee.age);
		System.out.println("Employee Phone number is "+employee.phoneNo);
		System.out.println("Employee address is "+employee.address);
		System.out.println("Employee specialization is "+employee.specialization);
		
		System.out.print("Manager salary is ");
		manager.printSalary();
		System.out.println("Manager name is "+manager.name);
		System.out.println("Manager age is "+manager.age);
		System.out.println("Manager Phone number is "+manager.phoneNo);
		System.out.println("Manager address is "+manager.address);
		System.out.println("Manager department is "+manager.department);
		
	}
}
