package com.tyss.assignment;
/**
* @author Abisheikha
*/
public class MultilevelInheritance {
	public static void main(String[] args) {
		Watch watch = new Watch();
		watch.alarm();
		watch.time();
		watch.price=700;
		System.out.println(watch.price);
		System.out.println(watch.color);
		SmartWatch smartWatch = new SmartWatch(2000,"black");
		System.out.println(smartWatch.price);
	//	MiSmartBand mi=new MiSmartBand(16,1.78f);
		//System.out.println(mi.);
		
	}
}
