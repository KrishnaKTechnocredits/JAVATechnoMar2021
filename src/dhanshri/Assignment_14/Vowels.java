package dhanshri.Assignment_14;

import java.util.Scanner;

public class Vowels {
	void isVowel(char ch) {

		switch(ch) {

		case 'A':
		case 'a':
			System.out.println(ch+ " is a vowel");
			break;
		case 'E':
		case 'e':		
			System.out.println(ch+ " is a vowel");
			break;	
		case 'I':
		case 'i':
		    System.out.println(ch+ " is a vowel");
			break;
		case 'O':
		case 'o':	
			System.out.println(ch+ " is a vowel");
			break;	
		case 'U':
		case 'u':	
			System.out.println(ch+ " is a vowel");
			break;	
		default:
			System.out.println(ch+ " is not a vowel");
		}

	}


	public static void main(String[] args) {
		Vowels vowels = new Vowels();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character");
		String input = scanner.next();
		scanner.close();
		char character = input.charAt(7);
		vowels.isVowel(character);
}
}
