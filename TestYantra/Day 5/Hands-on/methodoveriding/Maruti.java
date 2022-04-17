package com.ob.methodoveriding;

/**
 * @author Abisheikha
 */
public class Maruti extends Car {
	@Override
	public void drive() {
		System.out.println("It drives by an normal engine");
	}

	public void brake() {
		System.out.println("not so special about brake");
	}
}
