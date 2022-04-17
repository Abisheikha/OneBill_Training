package com.ob.accessspecifier;
/**
* @author Abisheikha
*/
public class Sample {
	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.display();
		System.out.println(demo.x);
		//demo.disp();//private
		demo.dis();
		demo.d();
	}
}
