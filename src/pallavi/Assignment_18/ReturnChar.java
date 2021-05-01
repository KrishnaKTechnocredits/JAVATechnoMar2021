package pallavi.Assignment_18;

import java.util.Scanner;

public class ReturnChar {

	char getAsciiOfChar(int asciiValue) {

		return (char) asciiValue;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		int num = sc.nextInt();
		sc.close();
		System.out.println(new ReturnChar().getAsciiOfChar(num));
	}

}
