package com.tyss.project;

/**
 * @author Abisheikha
 */
public class SmartPhone extends Phone {
	// int price;
	// int ram;
	// String brand;
	double camera;
	int cameraCount;

	public SmartPhone() {
		super();
		System.out.println("from smartphone sub class");
	}
	/*-------------Parameterized super keyword---*/

	public SmartPhone(int price, int ram, double c, int cc) {
		super(price, ram);// super calling statement
		camera = c;
		cameraCount = cc;
		// System.out.println("from smartphone sub class");
	}

	public SmartPhone(int price, int ram) { // constructor overloading
		super(price, ram);// super calling statement //constructor chaining- constructor calling another
							// constructor
	}

	public void play() {
		System.out.println("Playing game");
	}

	public void selfie() {
		System.out.println("Take a picture !!!");
	}
}
