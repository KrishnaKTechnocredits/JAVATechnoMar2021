package technocredits.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Example9 {
	
	double m1() {
		int x = 10;
		return x;
	}
	
	public static void main(String[] args){
		Example10 example10 = new Example10();
		try {
			example10.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
