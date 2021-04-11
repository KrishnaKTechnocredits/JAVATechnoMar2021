package sai.Assignment14;

import java.util.Scanner;

public class SwitchCaseScanner {

		void vowel(char alphabet) {

			switch (alphabet) {
			case 'A':
			case 'a':
				System.out.println(alphabet + " is a vowel");
				break;
			case 'E':
			case 'e':
				System.out.println(alphabet + " is a vowel");
				break;
			case 'I':
			case 'i':
				System.out.println(alphabet + " is a vowel");
				break;
			case 'O':
			case 'o':
				System.out.println(alphabet + " is a vowel");
				break;
			case 'U':
			case 'u':
				System.out.println(alphabet + " is a vowel");
				break;
			default:
				System.out.println(alphabet + " is not a vowel");

			}
		}

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			SwitchCaseScanner switchCasescanner = new SwitchCaseScanner();
			System.out.println("Enter a character");
			String input = scanner.nextLine();
			char ch1 = input.charAt(0);
			switchCasescanner.vowel(ch1);
			scanner.close();
		}

	}
