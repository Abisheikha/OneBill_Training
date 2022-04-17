package com.tyss.project;

/**
 * @author Abisheikha
 */
public class Phone {
	int price;
	String brand;
	int ram;

	public Phone() {
		System.out.println("Superclass : Phone");
	}

	public Phone(int p, int r) {
		price = p;
		ram = r;
	}

	public void call() {
		System.out.println("phone is ringing!!");
	}

	public void radio() {
		System.out.println("Playing a song");
	}

	public void message(String msg) {
		System.out.println(msg);
	}
}