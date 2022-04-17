 
package com.ob.methodoveriding;

/**
 * @author Abisheikha
 * 
 *         Method Overiding : Changing implementation of method of superclass in
 *         subclass
 */
public class MethodOveriding {
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();
		car.brake();
		Audi audi = new Audi();
		audi.drive();
		audi.brake();
		Maruti maruti = new Maruti();
		maruti.drive();
	}
}