
package com.tyss.corejava;

/*
 *Switch statement
 */
public class Switch {
	public static void main(String[] args) {
		int x = 2;
		switch (x) {
		case 1:
			System.out.println("Lets go to Goa!");
			break;
		case 2:
			System.out.println("Lets go to Pune!");
		case 3:
			System.out.println("Lets go to Shimla!");
			break;
		case 4:
			System.out.println("Lets go to Delhi!");
			break;
		case 5:
			System.out.println("Lets go to Chennai!");
			break;
		default:
			System.out.println("Trip cancelled");
			break;
		}
		System.out.println("Program ends!");
	}
}
