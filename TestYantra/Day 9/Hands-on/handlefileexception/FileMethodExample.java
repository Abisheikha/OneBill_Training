package com.tyss.handlefileexception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileMethodExample {

	String s = null;

	public String readFile(File fileName) throws IOException {
		s = "";
		try (FileReader fileReader = new FileReader(fileName)) {
			int read = fileReader.read();
			while (read > 0) {
				System.out.print((char) read);
				read = fileReader.read();
			}
		}
		return s;
	}
}
