package ashtha.Assignment14;

import java.util.Scanner;

public class VowelIdentification {

	void vowel(char ch) {
		ch = Character.toUpperCase(ch);
		switch (ch) {
			case 'A':
				System.out.println(ch+" is a vowel");
				break;
			case 'E':
				System.out.println(ch+" is a vowel");
				break;
			case 'I':
				System.out.println(ch+" is a vowel");
				break;
			case 'O':
				System.out.println(ch+" is a vowel");
				break;
			case 'U':
				System.out.println(ch+" is a vowel");
				break;
			default:
				System.out.println(ch+" is not a vowel");
		}
	}
	
	public static void main(String[] args) {
		VowelIdentification vowelIdentification = new VowelIdentification();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the character");
		char character = scanner.next().charAt(0);
		vowelIdentification.vowel(character);		
	}
}
