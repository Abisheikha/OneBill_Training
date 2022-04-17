package com.ty.upcastingdowncasting;

/**
 * @author Abisheikha
 */
public class User {
	String name;
	long number;

	public void chat() {
		System.out.println(name + " is chatting" + number);
	}

	public void share() {
		System.out.println(name + "is sharing" + number);
	}

	public void call() {
		System.out.println(name + " is calling" + number);
	}

	public User() {

	}

	public User(String name, long number) {
		super();
		this.name = name;
		this.number = number;
	}
}
