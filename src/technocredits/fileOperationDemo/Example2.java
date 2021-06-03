package technocredits.fileOperationDemo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new File(".\\src\\technocredits\\fileOperationDemo\\file1.txt"));
		while(sc.hasNextLine()) {
			String line = sc.next();
			System.out.println(line);
		}
	}
}
