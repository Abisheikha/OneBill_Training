package com.tyss.corejava;
/*
 * There are three types of variables:
 * local: declared within the block and accessed within the block
 * instance: declared outside the method and inside the class
 * static: declared with a static keyword. To access static variable we can access it by using class
 */
public class Variable {
	static int a=20;
	int b=25;
	public static void main(String[] args) {
		int c=10;
		System.out.println(c);  //local
		System.out.println(Variable.a); //static
		Variable t=new Variable();
		System.out.println(t.b);   //instance
	}	
}

