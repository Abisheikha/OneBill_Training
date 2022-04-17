package com.tyss.problemstmt;

public class LicenseAppy {

	String name;
	int age;

	public LicenseAppy(String name, int age) {
		this.name = name;
		this.age = age;

		if (age > 18) {
			System.out.println("Eligible to apply License");
		} else {
			try {
				throw new AgeNotValidException("You are not eligible to apply for License ");
			} catch (AgeNotValidException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
