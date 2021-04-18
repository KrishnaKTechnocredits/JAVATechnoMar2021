package monali.Assignment_21;

import java.util.Scanner;


public class Program_2 {

	void addNumbers(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 32 && ch <= 47)
				sum = sum + (ch);
		}
		System.out.println("sum of digits in string is " + sum);
	}

	public static void main(String[] a) {
		Program_2 program = new Program_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string");
		String str = scanner.next();
		program.addNumbers(str);
	}
}
