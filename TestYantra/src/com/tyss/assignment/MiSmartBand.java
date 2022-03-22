package com.tyss.assignment;

/**
 * @author Abisheikha
 */
public class MiSmartBand extends SmartWatch {
	int BatteryLife = 16;
	float ScreenSize = 1.78f;

	public MiSmartBand(int steps, float cal) {
		super(steps, cal); // super calling statement

	}

	public void SpecialFeature() {
		System.out.println("Feature in MiSmartBand is Blood Oxygen testing");
	}
}
