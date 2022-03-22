package com.tyss.assignment3;
/**
* @author Abisheikha
*/
public class Student {
	String name;
	public Student(){
		name="Unknown";
	}
	public Student(String str){
		name=str;
	}
	public void PrintNames() {
		System.out.println("The name is " + name);
	}
}
