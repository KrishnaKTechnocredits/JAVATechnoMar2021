package madhavi_Raut.Assignment_16;

import java.util.Scanner;

/*Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

Input : technocredits
char : e

output : e -> 2*/

public class FindCharacterFrequency {
	void findCharFrequency(String strName, char letter) {
		String name = strName.toLowerCase();
		char ch = Character.toLowerCase(letter);
		int count = 0;
		for (int index = 0; index < strName.length(); index++) {
			if (String.valueOf(ch).equals(String.valueOf(name.charAt(index))))
				count++;
		}
		System.out.println("Frequency of " + ch + " in " + name + ": " + count);
	}

	public static void main(String[] args) {
		FindCharacterFrequency findCharacterFrequency = new FindCharacterFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string.");
		String strName = scanner.nextLine();
		System.out.println("Enter a letter whose frequency has to be found.");
		char letter = scanner.next().charAt(0);
		findCharacterFrequency.findCharFrequency(strName, letter);
		scanner.close();
	}
}
