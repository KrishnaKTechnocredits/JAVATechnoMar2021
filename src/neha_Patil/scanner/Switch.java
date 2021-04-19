package neha_Patil.scanner;

import java.util.Scanner;

public class Switch {
	
	void SwitchCase(char ch) {

		switch(ch) {

		case 'a':
		case 'A':
			System.out.println("Entered character is Vowel");
			break;
		case 'e':
		case 'E':
			System.out.println("Entered character is Vowel");
			break;
		case 'i':
		case 'I':
			System.out.println("Entered character is Vowel");
			break;
		case 'o':
		case 'O':
			System.out.println("Entered character is Vowel");
			break;
		case 'u':
		case 'U':
			System.out.println("Entered character is Vowel");
			break;

		default:
			System.out.println("Entered characte valid input");

		}
	}
	public static void main(String [] args) {
		Switch s = new Switch();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character:");
		String input = sc.next();
		char ch = input.charAt(0);
		System.out.println(ch);
		s.SwitchCase(ch);
	}

}
