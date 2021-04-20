package shashank_array_17_18;

import java.util.Scanner;

public class GetAsciiOfChar {

	public int getAsciiOfChar(char ch) {
		int ascii = 0;
		ascii = ch;
		return ascii;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetAsciiOfChar asciiOfChar = new GetAsciiOfChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character for which ASCII value is expected:-");
		char ch = scanner.next().charAt(0);
		int ascii = asciiOfChar.getAsciiOfChar(ch);
		System.out.println("ASCII value Of Given Character " + ch + " is " + ascii);
		scanner.close();

	}

}
