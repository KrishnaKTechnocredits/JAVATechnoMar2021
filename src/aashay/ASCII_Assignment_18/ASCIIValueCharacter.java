package aashay.ASCII_Assignment_18;
/*
 * Assignment 18 : 14th April'2021
Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

 */

import java.util.Scanner;

public class ASCIIValueCharacter {
	
	int getAsciiOfChar(char c) {
		int asciiValue = c;
		return asciiValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ASCIIValueCharacter asciiValueChar = new ASCIIValueCharacter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the character:");
		char c = scan.next().charAt(0);
		int asciiValue = asciiValueChar.getAsciiOfChar(c);
		System.out.println("Ascii value of char "+"is "+asciiValue);
		scan.close();

	}

}
