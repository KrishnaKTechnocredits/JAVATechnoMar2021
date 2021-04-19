package rahul_Hiremath.assignment_14;

import java.util.Scanner;

public class Ass_14_1 {

	void checkVowel(char userCH) {
		char ch = Character.toLowerCase(userCH);
		switch (ch) {
		case 'a':
			System.out.println("'" + ch + "' is a vowel");
			break;

		case 'e':
			System.out.println("'" + ch + "' is a vowel");
			break;

		case 'i':
			System.out.println("'" + ch + "' is a vowel");
			break;

		case 'o':
			System.out.println("'" + ch + "' is a vowel");
			break;

		case 'u':
			System.out.println("'" + ch + "' is a vowel");
			break;

		default:
			System.out.println("'" + ch + "' is not a vowel");
			break;
		}
	}

	public static void main(String[] args) {

		Ass_14_1 ass_14_1 = new Ass_14_1();
		System.out.println("Please enter a character to check if vowel or not");
		Scanner sc = new Scanner(System.in);
		String getChar = sc.nextLine();
		char ch1 = getChar.charAt(0);
		ass_14_1.checkVowel(ch1);
	}
}
