package technocredits.scannerDemo;

import java.util.Scanner;

public class Example3 {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter input :");
		String str1 = scanner.next();
		String str2 = scanner.next();
		String str3 = scanner.next();
		System.out.println(str1 + " " + str2 + " " + str3);
	}
}
