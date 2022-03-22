package com.tyss.assignment;

/**
 * @author Abisheikha
 */
public class Watch {
	int price;
	String color;

	public Watch() {
		color = "blue";
		price = 500;
	}

	public void time() {
		System.out.println("Shows time");
	}

	public void alarm() {
		System.out.println("Alarm rings");
	}

}
