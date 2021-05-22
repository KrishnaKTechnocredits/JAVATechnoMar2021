package technocredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Example8 {

	void m1(int y) {
		int x = 10/y;
	}
	
	void m3() throws FileNotFoundException, NullPointerException, ArrayIndexOutOfBoundsException, StringIndexOutOfBoundsException{
		FileInputStream input = new FileInputStream(new File("D://mmk.txt"));
	}
	
	
	void m2() {
		try {
			m1(0);
		}catch(RuntimeException ae) {
			System.out.println("Hi");
		}
		System.out.println("Hello");
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		new Example8().m3();
	}
}
