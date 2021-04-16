/*Java Assignment 18: 14th April 2021

Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

*/

package vaibhav.Assignment_18;

import java.util.Scanner;

public class ReturnASCIIValue {

	int getAsciiOfChar(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		ReturnASCIIValue returnASCIIValue = new ReturnASCIIValue();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter character to find the ASCII value : ");
		String charLine = scanner.next();

		char ch = charLine.charAt(0);
		int asciiValue = returnASCIIValue.getAsciiOfChar(ch);

		System.out.println("ASCII Value of '" + ch + "' is : " + asciiValue);
		scanner.close();
	}
}
