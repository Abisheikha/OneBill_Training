package com.tyss.assignment3;
/**
* @author Abisheikha
* 
* Constructor question:  print the names of students by creating a Student class. 
* If no name is passed while creating an object of Student class, then the name should be 
* "Unknown", otherwise the name should be equal to the String value passed while creating object 
* of Student class.
*/
public class Main {
	public static void main(String[] args) {
		Student s1 = new Student("Abi");
		s1.PrintNames();
		Student s2 = new Student();
		s2.PrintNames();
	
		
	}
}
