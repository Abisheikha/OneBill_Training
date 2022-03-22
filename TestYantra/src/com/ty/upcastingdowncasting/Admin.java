package com.ty.upcastingdowncasting;

/**
 * @author Abisheikha
 */
public class Admin extends User {
	public Admin(String name, long number) {
		super(name, number);

	}

	public void addUser(String name) {
		System.out.println("Username " + name + " addded");
	}

	public void removeUser(String name) {
		System.out.println("Username " + name + " removed");
	}

}
