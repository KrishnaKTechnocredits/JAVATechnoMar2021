package aashay.ASCII_Assignment_18;

import java.util.Scanner;

/*
 *  Assignment 18 : 14th April'2021

Program 2: Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)


 */

public class ReturnValueOfASCII {
	
	char getAsciiOfChar(int asciiValue) {
		char charValue = (char) asciiValue;
		return charValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnValueOfASCII returnValueOfASCII = new ReturnValueOfASCII();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter ASCII Vallue :");
		String asciiValue = scan.next();
		char charValue =  returnValueOfASCII.getAsciiOfChar(Integer.parseInt(asciiValue));
		System.out.println("Character value is:"+charValue);
		scan.close();
	}

}
