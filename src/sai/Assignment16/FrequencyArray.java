package sai.Assignment16;

/*
 * Assignment - 16 : 9th April'2021

Find the frequency of character from a given String array.
Note: Take String and character from the user.

 */

import java.util.Scanner;

public class FrequencyArray {

	void getFrequencyOfCharacter(String str, char targetChar) {
		int count = 0;
		str = str.toUpperCase();
		targetChar = Character.toUpperCase(targetChar);
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetChar)
				count++;
		}
		System.out.println("Count of " + targetChar + " is: " + count);
	}

	public static void main(String[] args) {
		FrequencyArray frequencyArray = new FrequencyArray();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any String: ");
		String str = scanner.next();
		System.out.println("Enter any Character: ");
		char targetCh = scanner.next().charAt(0);
		frequencyArray.getFrequencyOfCharacter(str, targetCh);
	}
}
