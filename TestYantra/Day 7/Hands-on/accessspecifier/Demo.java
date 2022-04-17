package com.ob.accessspecifier;
/**
* @author Abisheikha
*/
public class Demo {
	public int x=10;
	private int y=20;
	protected int z=30;
	int a=50;
	public void display() {
		System.out.println("x+y= "+(x+y));
	}
	private void disp() {
		System.out.println("x+y= "+(x-y));
	}
	protected void dis() {
		System.out.println("x+y= "+(x*y));
	}
	void d() {
		System.out.println("x+y= "+(x/y));
	}
	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo.x);
		System.out.println(demo.y);
		System.out.println(demo.z);
		System.out.println(demo.a);
		demo.display();
		demo.disp();
		demo.dis();
		demo.d();
	}
}
