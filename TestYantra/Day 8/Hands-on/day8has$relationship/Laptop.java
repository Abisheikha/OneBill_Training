package com.ob.day8has$relationship;

/**
 * @author Abisheikha
 */
public class Laptop {
	String brand;
	int price;
	Battery battery;
	Laptop laptop;
	Rom rom;
	Screen screen;

	@Override
	public String toString() {
		return "Laptop [brand=" + brand + ", price=" + price + ", battery=" + battery + ", laptop=" + laptop + ", rom="
				+ rom + ", screen=" + screen + "]";
	}

}
