package com.tyss.corejava;
/*-------------Method: Method is a block of code which executes when invoked/called -------------------*/

public class MulMethod {
	static float mul(float a,float b)
	{
		float c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		float res= MulMethod.mul(5.4f, 4);
		System.out.println(res);
		
		float res1= MulMethod.mul(-2.3f, 4);
		System.out.println(res1);
	}
	

}
