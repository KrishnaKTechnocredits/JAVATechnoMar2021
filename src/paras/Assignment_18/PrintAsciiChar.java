/*
 *Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)

Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)

 */

package paras.Assignment_18;

import java.util.Scanner;

public class PrintAsciiChar {
	
	int charToAscii(String input) {
		char ch = input.charAt(0);
		int ascii = (int) ch;	
		return ascii;
	}
	
	char asciiToChar(int input) {
		char ch = (char) input;	
		return ch;
	}
	
	public static void main(String[] args) {
		PrintAsciiChar printAsciiChar = new PrintAsciiChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter the Character to Return Ascii Value :");
		String input = scanner.next();
		int charToAscii = printAsciiChar.charToAscii(input);
		System.out.println("Ascii Value for Entered Character" + input.charAt(0) + " is - " + charToAscii);
		
		System.out.println("\nPlease Enter the Ascii Value to Return Character :");
		int input1 = scanner.nextInt();
		char asciiToChar = printAsciiChar.asciiToChar(input1);
		System.out.println("Ascii Value for Entered number " + input1 + " is - " + asciiToChar);
		
	}
}
