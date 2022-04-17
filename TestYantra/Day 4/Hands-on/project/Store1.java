package com.tyss.project;

/**
 * @author Abisheikha
 */
public class Store1 {
	public static void main(String[] args) {
		Phone Phone = new Phone(2000, 4);// parameterized constructor
		System.out.println(Phone.price);
		System.out.println(Phone.ram);
		Phone.brand = "Nokia";

		// Phone.Phone();
		Phone.call();
		Phone.radio();
		Phone.message("message is here");

		SmartPhone SmartPhone = new SmartPhone(2000, 2, 2.2, 1);
		SmartPhone.price = 100000;
		SmartPhone.brand = "Iphone";
		SmartPhone.ram = 32;
		SmartPhone.cameraCount = 3;
		SmartPhone.camera = 6.4;

		SmartPhone.call();
		SmartPhone.play();
		SmartPhone.radio();
		SmartPhone.message("message is here");
		System.out.println(SmartPhone.price);

	}
}
