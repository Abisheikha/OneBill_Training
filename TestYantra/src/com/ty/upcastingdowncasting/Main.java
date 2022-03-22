package com.ty.upcastingdowncasting;

/**
 * @author Abisheikha
 * 
 *         Upcasting: An object of subclass which can be stored in the reference
 *         of super class. Downcasting: -> Storing a superclass reference into a
 *         subclass reference. -> Should explicitly tell JVM that we are down
 *         casting. -> Downcasting can be done only after upcasting.
 */
public class Main {
	public static void main(String[] args) {
		User user = new Admin("Abi", 9877654222l); // upcasting
		user.chat();
		user.call();
		Admin admin = (Admin) user; // downcasting
		admin.addUser("Abi");
		admin.removeUser("Abi");
		admin.call();
		admin.chat();

	}
}
