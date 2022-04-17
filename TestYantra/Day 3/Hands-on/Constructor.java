package com.tyss.corejava;

/**
 * @author Abisheikha
 * Constructor is a special kind of method which does not have any return type and 
 * it is used for creation of object
 */

public class Constructor {
	Constructor(){
		System.out.println("Constructor called");
	}
	public static void main(String[] args) {
		Constructor con= new Constructor();
		System.out.println(Variable.a);
		//Object creation
		Variable v = new Variable();
		System.out.println(v.b);
	}
}
