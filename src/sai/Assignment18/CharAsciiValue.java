package sai.Assignment18;
/*
 * Assignment 18 : 14th April'2021
Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

 */

public class CharAsciiValue {

	public static void main(String[] args) {
		CharAsciiValue charAsciiValue = new CharAsciiValue();
		int value = charAsciiValue.getAsciiOfChar('S');
		System.out.println("Ascii value of S is " + value);
	}

	int getAsciiOfChar(char ch) {
		return ch;
	}

}
