package technocredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example2 {

	void readFile() {
		File file = new File("D:\\mmkcfakjhdaskj\\test.txt");
		try {
			FileInputStream inputStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			System.out.println("Hi");
		}
	}
	
	public static void main(String[] args) {
		
	}
}
