//Assignment 18 : 14th April'2021
//Program 1:  Write a method which will return ascii value of given character.
//Hint : Method signature should be int getAsciiOfChar(char ch)

package neha_Rathi.assignment18;

import java.util.Scanner;

public class AsciiValueOfChar {

	int getAsciiOfChar(char ch) {
		return ch;
	}

	public static void main(String[] args) {
		AsciiValueOfChar asciiValueOfChar = new AsciiValueOfChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character for which we need ASCII value:");
		String ch = sc.next();
		System.out.println("ASCII value of character " + ch + " is " + asciiValueOfChar.getAsciiOfChar(ch.charAt(0)));
	}
}
