/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2  Incomprehensibilities  Unimaginatively
 */
package aparna.characterCountThroughScanner;

import java.util.Scanner;

public class CharacterCountThroughScanner {

	void getCharacterFrequency(String inputString, char targetCharacter) {
		int count = 0;
		// int inputStringLength = inputString.length();
		inputString = inputString.toUpperCase();
		targetCharacter = Character.toUpperCase(targetCharacter);

		for (int index = 0; index < inputString.length(); index++) {
			if (inputString.charAt(index) == targetCharacter) {
				count++;
			}

		}
		System.out.println("Given Character is " + targetCharacter + " and its total Count in given String "
				+ inputString + " is " + count);
	}

	public static void main(String[] args) {
		CharacterCountThroughScanner characterCountThroughScanner = new CharacterCountThroughScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Word :- ");
		String inputString = scanner.next();
		System.out.println("Enter character whose count you want :- ");
		String characterValueEntered = scanner.next();
		char targetCharacter = characterValueEntered.charAt(0);
		characterCountThroughScanner.getCharacterFrequency(inputString, targetCharacter);
		scanner.close();
	}

}
