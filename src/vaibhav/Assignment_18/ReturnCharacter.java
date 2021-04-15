/*Java Assignment 18: 14th April 2021

Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

*/


package vaibhav.Assignment_18;

import java.util.Scanner;

public class ReturnCharacter {
	
	char getAsciiOfChar(int asciiValue) {
		return (char)asciiValue;
	}
	
	public static void main(String[] args) {
		ReturnCharacter returnCharacter = new ReturnCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the ASCII value to get the corrosponding charater : ");
		int asciiValue = scanner.nextInt();
		
		char ch = returnCharacter.getAsciiOfChar(asciiValue);
		System.out.println("Character corresponding to ASCII value " + asciiValue + " is : " + ch );
		scanner.close();
	}

}
