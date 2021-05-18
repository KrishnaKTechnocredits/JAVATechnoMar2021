package meenu.assignment_18;

/*Program 2:  Write a method which will return character of given Ascii value.
Hint : Method signature should be char getAsciiOfChar(int asciiValue)
*/

import java.util.Scanner;

public class CharOfAscii {
	
	char getCharOfAscii(int asciivalue) {		
		return (char)asciivalue;
	}
	
	public static void main(String[] args) {
		CharOfAscii charOfAscii = new CharOfAscii();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Ascii value : ");
		int value = scanner.nextInt();
		System.out.println("character of Ascii value "+value+" is :"+(charOfAscii.getCharOfAscii(value)));
	

	}

}
