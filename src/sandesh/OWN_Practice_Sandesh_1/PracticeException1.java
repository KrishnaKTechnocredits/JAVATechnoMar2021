package sandesh.OWN_Practice_Sandesh_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class PracticeException1 {
	
	/*
	void m1() {
		try {
			FileInputStream fis = new FileInputStream(new File(""));
		} catch(FileNotFoundException fe) {
			System.out.println("Caught you");
		}
		
	}
	*/
	
	void isEntryAllowed(int age) {
		if(age >= 18)
			System.out.println("You are welcome");
		else
			System.out.println("Lemme call your parents");
			throw new ArithmeticException();
	}
	
	public static void main(String[] args) {
		new PracticeException1().isEntryAllowed(16); 
	}
	
	void m1() throws IOException{
		FileInputStream fis = new FileInputStream(new File(""));
	}
}
