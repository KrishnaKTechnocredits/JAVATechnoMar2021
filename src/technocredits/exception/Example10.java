package technocredits.exception;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Example10 {

	String m1() throws IOException{
		FileInputStream input = new FileInputStream(new File(""));
		try (BufferedReader br = new BufferedReader(new FileReader("")))
	    {
	        return br.readLine();
	    }
	}
}
