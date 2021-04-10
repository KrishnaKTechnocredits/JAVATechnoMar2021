package prachi.Assignment_16;

/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2*/

import java.util.Scanner;

public class CharacterCount {
	void getCharfrequency(String str, char tchar) {
		int count = 0;
		int length = str.length();

		str = str.toUpperCase();
		tchar = Character.toUpperCase(tchar);

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == tchar)
				count++;
		}
		System.out.println("Count of selected target character '" +tchar+"' is: "+count);
	}

	public static void main(String[] a) {
		CharacterCount frequencyOfCharacter = new CharacterCount();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the input String");
		String str = scanner.nextLine();
		System.out.println("Enter the target CharacterTech");
		String input = scanner.nextLine();
		char targetChar = input.charAt(0);
		frequencyOfCharacter.getCharfrequency(str, targetChar);
	}
}
