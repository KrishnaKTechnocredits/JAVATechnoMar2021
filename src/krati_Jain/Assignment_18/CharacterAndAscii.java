package krati_Jain.Assignment_18;

import java.util.Scanner;

public class CharacterAndAscii {
	
	public static void main(String[] args) {
		CharacterAndAscii charAscii = new CharacterAndAscii();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character who's ASCII value you want to know : ");
		String inputStr = sc.next();
		char inputChar = inputStr.charAt(0);

		System.out.println("ASCII value is : " + charAscii.getCharAscii(inputChar));
		System.out.println("Enter a ASCII value who's Character you want to know : ");
		int inputInt = sc.nextInt();
		System.out.println(
				"ASCII value '" + inputInt + "' is of following character: " + charAscii.getCharOfAscii(inputInt));
		
		
		charAscii.asciiValues();
		charAscii.asciiValues97122();
	}

	
	int getCharAscii(int inputChar) {
		return inputChar;
	}
	
	char getCharOfAscii(int inputInt) {
		char ch = (char) inputInt;
		return ch;
	}
	
	void asciiValues() {
		System.out.println("--------------------------------------------------");
		for (char i = 'A'; i <= 'Z'; i++) {
			int character = i;
			System.out.println("ASCII value of character' " + i + "' is : " + character);
		}

	}
	
	void asciiValues97122() {
		System.out.println("--------------------------------------------------");
		for (int i = 97; i <= 122; i++) {
			char chracter = (char) i;
			System.out.println("ASCII value '" + i + "' is of following character : " + chracter);
		}

	}
	
}
