package com.tyss.assignment;

/**
 * @author Abisheikha
 * 
 *         Multilevel Inheritance : A superclass having one subclass and that
 *         subclass is a superclass to another subclass.
 */
public class MultilevelInheritance {
	public static void main(String[] args) {
		Watch watch = new Watch();
		watch.alarm();
		watch.time();
		watch.price = 700;
		System.out.println("Watch price: " + watch.price);
		System.out.println("Watch color: " + watch.color);
		SmartWatch smartWatch = new SmartWatch(2000, "black"); // It inherits the properties of watch
		System.out.println("Smart Watch Price: " + smartWatch.price);
		System.out.println("Smart Watch color: " + smartWatch.color);
		smartWatch.heartrate();
		smartWatch.energylevel();
		MiSmartBand miSmartBand = new MiSmartBand(20, 23.1f); // It inherits the properties of smartwatch
		System.out.println("Battery life if Mi smart watch is " + miSmartBand.BatteryLife);
		System.out.println("Screen size of Mi Smart watch is " + miSmartBand.ScreenSize);
		System.out.println("miSmartBand calories " + miSmartBand.calories);
		System.out.println("miSmartBand no. of steps " + miSmartBand.NoOfSteps);
		miSmartBand.SpecialFeature();

	}
}
