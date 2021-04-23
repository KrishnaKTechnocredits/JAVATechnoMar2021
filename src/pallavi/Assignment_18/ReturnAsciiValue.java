package pallavi.Assignment_18;

import java.util.Scanner;

public class ReturnAsciiValue {

	int getAsciiOfChar(char ch) {
		return ch;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Character");
		char ch = sc.next().charAt(0);
		sc.close();
		System.out.println(new ReturnAsciiValue().getAsciiOfChar(ch));

	}

}
