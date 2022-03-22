package com.tyss.assignment;
/**
* @author Abisheikha
*/
public class SmartWatch extends Watch{
	float calories;//=33.3f;
	int NoOfSteps;//=10;
	public SmartWatch(int p,String colr)
	{
		price=p;
		color=colr;
	}
	public void heartrate() {
		System.out.println("displays heart rate");
	}
	public void energylevel() {
		System.out.println("displays energy level");
	}
	
}
