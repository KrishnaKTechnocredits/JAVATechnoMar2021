//Write a method which will return ascii value of given character.
//Hint : Method signature should be int getAsciiOfChar(char ch)

package prashant.Assignment_18;

import java.util.Scanner;

//Method Returns Ascii value of given Character //
public class AsciiValuetoChar {

	int getAsciiOfChar(char ch) {
		int asciiVal = ch;
		return asciiVal;
	}

	public static void main(String[] args) {
		AsciiValuetoChar getchar = new AsciiValuetoChar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character for which you want to display ascii Value");
		char ch = sc.next().charAt(0);
		int asciiValue = getchar.getAsciiOfChar(ch);
		System.out.println("Ascii Value of Character" + " " + ch + " is " + asciiValue);
		sc.close();
	}

}
