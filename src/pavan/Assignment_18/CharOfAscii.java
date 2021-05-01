package pavan.Assignment_18;

import java.util.Scanner;

public class CharOfAscii {

	char GetCharOfAscii(int ascii) {
		char ch = (char) ascii;
		return ch;
	}
	public static void main(String[] args) {
		CharOfAscii charOfAscii = new CharOfAscii();

		Scanner scan = new Scanner(System.in);
		System.out.println("Please provide the ASCII Value: ");
		int ascii = scan.nextInt();
		char char1 = charOfAscii.GetCharOfAscii(90);
		System.out.println(char1);
	}
}
