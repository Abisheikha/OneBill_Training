package com.tyss.assignment;

/**
 * @author Abisheikha
 */
public class SmartWatch extends Watch {
	float calories;
	int NoOfSteps;

	public SmartWatch(int p, String colr) {
		price = p;
		color = colr;
	}

	public SmartWatch(int steps, float cal) {
		calories = cal;
		NoOfSteps = steps;
	}

	public void heartrate() {
		System.out.println("Displays heart rate in Smart watch");
	}

	public void energylevel() {
		System.out.println("Displays energy level in Smart Watch");
	}

}
