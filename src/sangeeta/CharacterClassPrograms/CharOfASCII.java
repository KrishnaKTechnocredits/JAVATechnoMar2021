/*Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)*/

package sangeeta.CharacterClassPrograms;

import java.util.Scanner;

public class CharOfASCII {

	char getcharOfascii(int asciiValue) {
		char temp = (char) asciiValue;
		System.out.println("Character of ASCII value " + asciiValue + " is " + temp);
		return temp;
	}

	public static void main(String[] a) {
		Scanner scanner = new Scanner(System.in);
		CharOfASCII charOfASCII = new CharOfASCII();
		System.out.println("Enter ASCII value ");
		int asciiValue = scanner.nextInt();
		charOfASCII.getcharOfascii(asciiValue);
	}

}
