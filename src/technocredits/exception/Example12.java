package technocredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example12 {

	void m2() throws IOException{
		try {
			FileInputStream input = new FileInputStream(new File(""));
		} catch (FileNotFoundException fe) {
			System.out.println("2");
		}
	}
	
	void m1() throws FileNotFoundException {
		try {
			FileInputStream input = new FileInputStream(new File(""));
		} catch (FileNotFoundException fe) {
			System.out.println("2");
		}
		try {
			FileInputStream input1 = new FileInputStream(new File(""));
		} catch (FileNotFoundException fe) {

		}
		try {
			FileInputStream input2 = new FileInputStream(new File(""));
		} catch (FileNotFoundException fe) {

		}
		FileInputStream input3 = new FileInputStream(new File(""));
	}
}
