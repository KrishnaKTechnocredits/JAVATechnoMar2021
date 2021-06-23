package gauravk.Assignment_4;
/*#4

Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/

import java.util.Scanner;

public class AsciiOfCharacter {
	int asci;
	void userInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Type a character to find its ASCII value.");
		char c = sc.next().charAt(0);
		AsciiOfCharacter asciiOfCharacter2 = new AsciiOfCharacter();
		asci = asciiOfCharacter2.getAsciiOfChar(c);
	}
	
	int getAsciiOfChar(char ch) {
		asci = ch;
		return asci;
	}
	public static void main(String[] a) {
		AsciiOfCharacter asciiOfCharacter1 = new AsciiOfCharacter();
		asciiOfCharacter1.userInput();
		System.out.println("ASCII value is "+asciiOfCharacter1.asci);
	}
}
