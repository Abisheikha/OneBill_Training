package com.tyss.handlefileexception;

import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
import java.util.Scanner;

public class FileMain {

	public static void main(String[] args) {
		System.out.println("Program Started");

		try (Scanner sc = new Scanner(System.in)) {
			// File file = new File("E:\\OneBillCopy\\TestFile.txt");
			File file = new File("");
			FileMethodExample fileMethod = new FileMethodExample();

			String result;
			try {
				result = fileMethod.readFile(file);
				System.out.println(result);
			} catch (Exception e) {
				// e.printStackTrace();
				System.out.println(e);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Program End");

	}
}
