package sangeeta;

import java.util.Scanner;


public class IsVowelWithScanner {


		public static void main(String[] a) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter Character: ");
			char ch = scanner.next().charAt(0);
						
			ch = Character.toUpperCase(ch);
			
			switch(ch) {
			case 'a':
			case 'A':
				System.out.println(" A is a Vowel");
				break;

			case 'e':
			case 'E':
				System.out.println(" E is a Vowel");
				break;

			case 'i':
			case 'I':
				System.out.println(" I is a Vowel");
				break;

			case 'o':
			case 'O':
				System.out.println(" O is a Vowel");
				break;

			case 'u':
			case 'U':
				System.out.println(" U is a Vowel");
				break;	

			default :
				System.out.println(" Its not a vowel");
				break;
				}

		}

}
