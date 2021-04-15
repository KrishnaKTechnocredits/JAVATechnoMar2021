/*Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/
package sangeeta.CharacterClassPrograms;

import java.util.Scanner;

public class AsciiOfChar {

	int getAsciiOfChar(char ch) {
		int temp = (int) ch;
		System.out.println("ASCII value of character " + ch + " is " + temp);
		return temp;

	}

	public static void main(String[] a) {
		AsciiOfChar asciiOfChar = new AsciiOfChar();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character ");
		char ch = scanner.next().charAt(0);
		asciiOfChar.getAsciiOfChar(ch);
	}
}
