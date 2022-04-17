package com.ob.day8static$nonstatic$block;

/**
 * @author Abisheikha 
 * Non static block(instance block) executes when the object is created.
 * Because it have non static members that bind with the object. 
 * Non static block doesn't get executed if we will not create an object.
 * It gets invoked only when the object is created.
 */
public class NonStaticBlock {
	{
		System.out.println("First non static block"); //
	}
	{
		System.out.println("Second non static block");
	}

	public static void main(String[] args) {
		System.out.println("From main block");
		NonStaticBlock ns = new NonStaticBlock();
		System.out.println("End");

	}
}
