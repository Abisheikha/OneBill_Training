package com.ob.interfaceclass;
/**
* @author Abisheikha
*/
public class Main {
	public static void main(String[] args) {
		Calculator cal = new Casio();
	//	Casio casio = new Casio();
		System.out.println(cal.add(10, 15));
	//	System.out.println(casio.add(10, 15));
		
		System.out.println(cal.mul(10, 15));
		System.out.println(cal.div(10, 15));
		System.out.println(cal.div(15, 5));
		
	}
}
