package meenu.assignment_18;

/*Program 1:  Write a method which will return ascii value of given character.
Hint : Method signature should be int getAsciiOfChar(char ch)
*/

import java.util.Scanner;

public class CharAsciiValue {
	
	int getAsciiOfChar(char ch) {		
		return ch;
	}

	public static void main(String[] args) {
		CharAsciiValue charAsciiValue = new CharAsciiValue();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the character : ");
		String input = scanner.next();
		char ch = input.charAt(0);
		System.out.println("ASCII value of "+ch+" is :"+(charAsciiValue.getAsciiOfChar(ch)));

	}

}
