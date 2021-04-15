package sangeeta;

import java.util.Scanner;

public class FrequencyOfCharacter {

	void getCharfrequency(String str, char targetChar) {
		int count = 0;
		int length = str.length();

		str = str.toUpperCase();
		targetChar = Character.toUpperCase(targetChar);

		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == targetChar)
				count++;
		}
		System.out.println("Number of characters are "+count);
	}

	public static void main(String[] a) {
		FrequencyOfCharacter frequencyOfCharacter = new FrequencyOfCharacter();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String");
		String str = scanner.next();
		System.out.println("Enter Character");
		String input = scanner.next();
		char targetChar = input.charAt(0);
		frequencyOfCharacter.getCharfrequency(str, targetChar);
	}

}
