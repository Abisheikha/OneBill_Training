package com.ob.objectclass;

import java.util.LinkedList;

/**
* @author Abisheikha
*/

public class Demo {
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "0";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof LinkedList<?>) {
			return true;
		}
		else {
			return false;
		}
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return 1;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("This is from finalise");
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo);
		Demo demo2 = new Demo();
		System.out.println("This is object 2 of demo"+demo2);
	//	boolean equals = demo2.equals(demo)
		//System.out.println(equals);
		demo=null;
		Demo demo3 = new Demo();
		int hashcode = demo3.hashCode();
		System.out.println(hashcode);
		demo2=null;
		demo3=null;
		System.gc();
		
	}
}
