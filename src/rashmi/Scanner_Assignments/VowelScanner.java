package rashmi.Scanner_Assignments;

import java.util.Scanner;

public class VowelScanner {

	static void isVowel(char ch) {
		switch (ch) {
		case 'A':
		case 'a':
		case 'E':
		case 'e':
		case 'I':
		case 'i':
		case 'O':
		case 'o':
		case 'U':
		case 'u':
			System.out.println(ch + " is a vowel");
			break;

		default:
			System.out.println(ch + " is not a vowel");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character : ");
		String input = scanner.next();
		char ch = input.charAt(0);
		VowelScanner.isVowel(ch);
		System.out.println("\nEnter the character : ");
		input = scanner.next();
		ch = input.charAt(0);
		VowelScanner.isVowel(ch);
		scanner.close();
		
	}
}
