package prachi.Assignment14;

import java.util.Scanner;

/*Program 1:  Write Assignment- 13 Using scanner class. */
public class ScannerSwitchCase {
	
	char letter;

	void isVowel() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any letter: ");
		String str =scanner.next();
		char input = str.charAt(0);
		switch(input) {
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
			System.out.println(input+" is a vowel");
			System.out.println("-------------------------------------");
			break;
		default:
			System.out.println(input+" is not a vowel.");
			System.out.println("-------------------------------------");
		}
	}

	public static void main(String[] args) {
		ScannerSwitchCase switchScan = new ScannerSwitchCase();
		switchScan.isVowel();
		switchScan.isVowel();
		switchScan.isVowel();
	}
}

