package com.ob.methodoveriding;

/**
 * @author Abisheikha
 */
public class Audi extends Car {
	@Override
	public void drive() {
		System.out.println("It drives by 8 cylinder engine");
	}

	public void brake() {
		System.out.println("Brake is applied smoothly");
	}
}
