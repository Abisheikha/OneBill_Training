package com.ob.day8has$relationship;

/**
 * @author Abisheikha
 */
public class Main {
	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		Battery battery = new Battery();
		battery.brand = "Dell";
		battery.capacity = 20000;
		battery.type = "Lithium";

		Rom rom = new Rom();
		rom.clockspeed = 2.4;
		rom.size = 16;
		rom.type = "DDR4";

		Screen screen = new Screen();
		screen.brand = "Samsung";
		screen.resolution = 1080;
		screen.size = 30;
		screen.type = "oled";

		laptop.brand = "hp";
		laptop.price = 100000;
		laptop.battery = battery;
		laptop.rom = rom;
		laptop.screen = screen;

		System.out.println(laptop);
	}
}
