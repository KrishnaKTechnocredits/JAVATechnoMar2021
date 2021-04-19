package shashank_array;

import java.util.Scanner;

public class GetCharOfAscii {

	public char getCharOfAscii(int ascii) {
		char ch = ' ';
		ch = (char) ascii;
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetCharOfAscii asciiOfChar = new GetCharOfAscii();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter ASCII value for which Character is expected:-");
		int ascii = scanner.nextInt();
		char ch = asciiOfChar.getCharOfAscii(ascii);
		System.out.println("ASCII Value Of Given number " + ascii + " is " + ch);
		scanner.close();

	}

}
