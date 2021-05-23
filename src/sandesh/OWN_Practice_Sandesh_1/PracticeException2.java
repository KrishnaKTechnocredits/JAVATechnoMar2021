package sandesh.OWN_Practice_Sandesh_1;

import java.io.FileNotFoundException;
import java.io.IOException;

public class PracticeException2 {
	
	static{
		PracticeException1 pe1 = new PracticeException1();
		
		try {
			pe1.m1();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	/*
	public static void main(String[] args) {
		PracticeException1 pe1 = new PracticeException1();
		try {
			pe1.m1();
		} catch (IOException fnoe) {
			// TODO: handle exception
		}
		
	}
	*/
	public static void main(String[] args) {
		
	}
}
