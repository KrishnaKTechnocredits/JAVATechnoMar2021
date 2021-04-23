package shashank_assignment_14;

import java.util.Scanner;

public class VowelConsonantScanner {

	public void vowelConsonant(char ch) {

		switch (ch) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(ch + " is Vowel");
			break;
		default:
			System.out.println(ch + " is Consonant");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelConsonantScanner vowelConsonantScanner = new VowelConsonantScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter charcter");
		String str = scanner.nextLine();
		char ch = str.charAt(0);
		vowelConsonantScanner.vowelConsonant(ch);
		scanner.close();
	}

}
