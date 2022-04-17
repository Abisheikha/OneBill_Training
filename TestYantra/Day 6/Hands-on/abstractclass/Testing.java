package com.ob.abstractclass;
/**
* @author Abisheikha
*/
public abstract class Testing {
	int x,y;
	abstract void m1();  // abstract method : A method which has only method declaration and no body
	public Testing(int x) {
		this.x=x;
	}
	void m2() {
		System.out.println("This is method x= "+x);
	}

}
