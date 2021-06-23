package gauravk.Assignment_4;

import java.util.Scanner;

/*#4

Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
*/
public class CharacterToAscii {
	char charOfAsci;
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a ASCII value to find its character.");
		int c = sc.nextInt();
		CharacterToAscii characterToAscii2 = new CharacterToAscii();
		charOfAsci = characterToAscii2.getAsciiOfChar(c);
	}
	
	char getAsciiOfChar(int ch) {
		charOfAsci = (char)ch;
		return charOfAsci;
	}
	public static void main(String[] a) {
		CharacterToAscii characterToAscii1 = new CharacterToAscii();
		characterToAscii1.userInput();
		System.out.println("Character value is "+characterToAscii1.charOfAsci);
	}
}
