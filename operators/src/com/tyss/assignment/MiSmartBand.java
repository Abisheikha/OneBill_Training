package com.tyss.assignment;
/**
* @author Abisheikha
* ---Multilevel inheritance-----
*/
public class MiSmartBand extends SmartWatch {
	int BatteryLife;//16
	float ScreenSize;//1.78 inch
//	public MiSmartBand(int steps,float cal)
	//{
	//	calories=cal;
		//NoOfSteps=steps;
//		System.out.println("constructor");
//	}
	public void SpecialFeature()
	{
		System.out.println("Feature is Blood Oxygen testing");
	}
	/*public static void main(String[] args) {
		MiSmartBand mi=new MiSmartBand(16,1.78f);
		System.out.println(mi.BatteryLife);
		System.out.println(mi.ScreenSize);
		System.out.println(mi.color);
//		System.out.println(mi.);
	//	System.out.println(mi.BatteryLife);
	}	*/
}
