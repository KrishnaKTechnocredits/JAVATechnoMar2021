package pavan.Assignment_18;

import java.util.Scanner;

public class AsciiOfChar {

	int getAsciiOfChar(char ch) {
		int ascii = (int) ch;
		return ascii;
	}

	public static void main(String[] args) {
		AsciiOfChar asciiOfChar = new AsciiOfChar();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a Character whose ASCII is required: ");
		char alpha = scan.next().charAt(0);
		int asciivalue = asciiOfChar.getAsciiOfChar(alpha);
		System.out.println("ASCII value: " + asciivalue);
	}

}
