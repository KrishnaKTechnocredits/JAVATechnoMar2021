/*Assignment 18 : 14th April'2021

Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/

package simmi.assignment_18_Ascii;

import java.util.Scanner;

public class CharacterAscii {
	char getAsciiOfChar(int asciiValue) {
		char ch = (char) asciiValue;
		return ch;
	}

	public static void main(String[] args) {
		CharacterAscii characterAscii = new CharacterAscii();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the ASCII value to get the character");
		int val = scanner.nextInt();
		char character = characterAscii.getAsciiOfChar(val);
		System.out.println("The value is " + character);
		scanner.close();
	}

}
