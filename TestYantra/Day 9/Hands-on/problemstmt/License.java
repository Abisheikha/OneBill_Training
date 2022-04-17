package com.tyss.problemstmt;

import java.util.*;

public class License {

	public static void main(String[] args) {

		try (Scanner scan = new Scanner(System.in)) {

			System.out.println("Enter the Name : ");
			String name = scan.next();
			System.out.println("Enter the Age : ");
			int age = scan.nextInt();

			new LicenseAppy(name, age);

		} catch (Exception e) {
			e.printStackTrace();
			//System.out.println(e);
		}

	}

}
