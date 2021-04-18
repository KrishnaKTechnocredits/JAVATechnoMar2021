/*
 * Program 1: Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
 */

package purva.Assignment18;
import java.util.Scanner;

public class ASCIIValueOfCharacter {

	int getAsciiOfChar(char c) {
		int asciiValue = c;
		return asciiValue;
	}

	public static void main(String[] args) {
		ASCIIValueOfCharacter asciiValueOfCharacter = new ASCIIValueOfCharacter();
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the character:");
		char c = scan.next().charAt(0);
		int asciiValue = asciiValueOfCharacter.getAsciiOfChar(c);
		System.out.println("Ascii value of char "+"is "+asciiValue);
	}

}
 


