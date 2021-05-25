package technocredits.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example7 {

	Example7() throws FileNotFoundException{
	
	}
	
	void m1() throws FileNotFoundException {
		File file = new File("D://techno//index.html");
		FileInputStream inputStream = new FileInputStream(file);
	}
	
	public static void main(String[] args) {
		try {
			Example7 example7 = new Example7();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
