//Program 2:  Write a method which will return character of given Ascii value.
//Hint : Method signature should be char getAsciiOfChar(int asciiValue)

package prashant.Assignment_18;

import java.util.Scanner;

public class ChartoAsciiValue {

	// Method Returns Char value of given Ascii value //
	char getAsciiOfChar(int asciiValue) {
		char ch = (char) asciiValue;
		return ch;
	}

	public static void main(String[] args) {
		ChartoAsciiValue getascii = new ChartoAsciiValue();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Ascii Value for which you want to display Character");
		int ascii = sc.nextInt();
		char Char = getascii.getAsciiOfChar(ascii);
		System.out.println("Character of given Ascii Value  " + ascii + " is" + " " + Char);
		sc.close();
	}

}
