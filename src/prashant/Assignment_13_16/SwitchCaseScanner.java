//Program 1-Write Assignment -13 using scanner class 
package prashant.Assignment_13_16;

import java.util.Scanner;

public class SwitchCaseScanner {
	void vowel(char ch) {
		switch (ch) {
		case 'A':
			System.out.println("A is a vowel");
			break;
		case 'a':
			System.out.println("a is a vowel");
			break;
		case 'E':
			System.out.println("E is a vowel");
			break;
		case 'e':
			System.out.println("e is a vowel");
			break;
		case 'I':
			System.out.println("I is a vowel");
			break;
		case 'i':
			System.out.println("i is a vowel");
			break;
		case 'O':
			System.out.println("O is a vowel");
			break;
		case 'o':
			System.out.println("o is a vowel");
			break;
		case 'U':
			System.out.println("U is a vowel");
			break;
		case 'u':
			System.out.println("u is a vowel");
			break;
		default:
			System.out.println(ch + " is not a vowel");
			break;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Character");
		String input1 = sc.next();
		char ch = input1.charAt(0);
		new SwitchCaseVowel().vowel(ch);
		sc.close();
	}
}
