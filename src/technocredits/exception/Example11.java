package technocredits.exception;

import java.io.FileNotFoundException;

public class Example11 {

	public static void main(String[] args) throws FileNotFoundException {
		Example12 ex12 = new Example12();
		try {
			ex12.m1();
			ex12.m2();
		} 
		catch (FileNotFoundException e) {
			System.out.println("1");
		}
		catch (Exception e) {
			System.out.println("1");
		}
		System.out.println("End");
		
		
	}
}
