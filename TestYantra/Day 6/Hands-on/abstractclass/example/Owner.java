package com.ob.abstractclass.example;

/**
 * @author Abisheikha
 * Real time example for abstraction
 */
public class Owner {
	public static void main(String[] args) {
		Pet p = new Alpha();
		p.sound();
		p.food();
		p.play();
		System.out.println();
		Pet j = new Jack();
		j.sound();
		j.food();
		j.play();
		
		Jack ja=(Jack)j;
		ja.sound();
		ja.sleep();
	}
}
