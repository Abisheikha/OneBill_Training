package com.tyss.handlefileexception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileExample {

	public static void main(String[] args) {

		System.out.println("Program Started");

		try (Scanner sc = new Scanner(System.in)) {

			System.out.println("Enter file name or file path : \n");

			String fileName = sc.next();

			// In Java the path file should be in "\" this slash format

			// File file = new File("E:\\OneBillCopy\\TestFile.txt");

			File file = new File(fileName);

			try (FileReader fileReader = new FileReader(file)) {
				int read = fileReader.read();
				while (read > 0) {
					System.out.print((char) read);
					read = fileReader.read();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
