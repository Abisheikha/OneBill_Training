package com.tyss.corejava;

public class ConditionalStat {
	public static void main(String[] args) {
		
	/*	System.out.println("program start");
		//decision making statement
		if(false)
		{
			System.out.println("Inside if block");
		}
		int x=30;
		int y=10;
		if(x>y)
		{
			System.out.println("Welcome!!!");
		}
		System.out.println("program end");
	}*/
		
		
		//------if else  statement-------
	/*	int money = 12000;
		if(money>5000)
		{
			System.out.println("Lets go to goa!!!");
		}
		else
		{
			System.out.println("Lets go to chick manglur!!!");
		} 
		*/
		
		//-------------------if else if ladder-----------------
		
		int money =12000;
		if(money>10000 && money<11000)
		{
			System.out.println("Coimbatore");
		}
		else if(money>10000 && money<13000)
		{
			System.out.println("Chennai");
		}
		else if(money>15000)
		{
			System.out.println("Ooty");
		}
		else
		{
			System.out.println("Salem");
		}
}
}
