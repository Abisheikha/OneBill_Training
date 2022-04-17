package com.tyss.project;

/**
 * @author Abisheikha
 */
public class Store {
	public static void main(String[] args) {
		// Phone Phone=new Phone(2000,4);
		// System.out.println(Phone.price);
		// System.out.println(Phone.ram);

		Phone Phone = new Phone();// non parameterized constructor
		Phone.price = 2000;
		Phone.brand = "Nokia";
		Phone.ram = 4;

		// Phone.Phone();
		Phone.call();
		Phone.radio();
		Phone.message("message is here in phone");

		// SmartPhone SmartPhone= new SmartPhone();//for non parameterized
		SmartPhone SmartPhone = new SmartPhone(2000, 4, 64.1, 3);// parameterized
		System.out.println("SmartPhone camera: " + SmartPhone.camera);
		System.out.println("SmartPhone camera count: " + SmartPhone.cameraCount);

		SmartPhone SmartPhone3 = new SmartPhone(2230, 1);
		System.out.println("SmartPhone price: " + SmartPhone3.price);
		/*
		 * SmartPhone SmartPhone1= new SmartPhone(1000,2);
		 * System.out.println(SmartPhone1.price);
		 * 
		 * SmartPhone SmartPhone3= new SmartPhone(64.3,3);//parameterized
		 * System.out.println(SmartPhone3.camera);
		 * System.out.println(SmartPhone3.cameraCount);
		 */

		SmartPhone.price = 100000;
		SmartPhone.brand = "Iphone";
		SmartPhone.ram = 32;
		SmartPhone.cameraCount = 3;
		SmartPhone.camera = 6.4;

		SmartPhone.call();
		SmartPhone.play();
		SmartPhone.radio();
		SmartPhone.message("message is here in smartphone");
		// System.out.println(SmartPhone.price);
		Samsung samsung = new Samsung();
		samsung.fold();

	}
}
