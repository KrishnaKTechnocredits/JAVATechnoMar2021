package monali.Assignment_20;

import java.util.Scanner;

public class Program_2 {
	
	void addNumbers(String str) {
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		System.out.println("sum of digits in string is "+sum);
	}
	
	public static void main(String[] a) {
		Program_2 program = new Program_2();
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter string");
		String str = scanner.next();
		program.addNumbers(str);
	}
	

}
