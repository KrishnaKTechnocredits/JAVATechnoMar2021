/*Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)*/

package simmi.assignment_18_Ascii;

import java.util.Scanner;

public class Ascii {

	int getAsciiOfChar(char ch) {
		int value = ch;
		ch = (char) value;
		return ch;
	}

	public static void main(String[] args) {
		Ascii ascii = new Ascii();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character to check the ASCII value ");
		char character = scanner.next().charAt(0);
		int val = ascii.getAsciiOfChar(character);
		System.out.println("ASCII value of is " + val);
		scanner.close();
	}

}
