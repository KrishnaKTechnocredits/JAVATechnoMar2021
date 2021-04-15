//Program 1: Write a method which will return ascii value of given character.
//Program 2: Write a method which will return character of given Ascii value.

package krati_Shukla.ReturningValues;

import java.util.Scanner;

public class ReturnASCIIofChar {
	
	int getAsciiOfChar(String input) {
		
		char ch = input.charAt(0);
		int ascii = (int) ch;
		return ascii;
	}
	
	char getCharOfAscii(int input) {
		
		char ch = (char)input;
		return ch;
	}
	
	public static void main(String[] a) {
		ReturnASCIIofChar returnASCIIoFChar = new ReturnASCIIofChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Character for which ASCII value is required :");
		String input =  scanner.next();
		
		int value = returnASCIIoFChar.getAsciiOfChar(input);
		System.out.println("The ASCII Of " +input.charAt(0)+ " is : " +value);
		
		System.out.println("Enter the ASCII for which Character is required :");
		int ascii =  scanner.nextInt();
		char ch = returnASCIIoFChar.getCharOfAscii(ascii);
		
		System.out.println("ASCII " +ascii+ " is associated to character : " +ch);
	}
}
