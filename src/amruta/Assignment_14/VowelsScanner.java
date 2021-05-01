/* Assignment - 14 : 8th April'2021

Program 1: Write Assignment- 13 Using scanner class. 

Program 2: Calculator program using Scanner class.

Program 3: Maggi and Panipuri program using Scanner class. */

package amruta.Assignment_14;

import java.util.Scanner;

public class VowelsScanner {
	
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
		VowelsScanner vowels = new VowelsScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the character");
		//String input = scanner.next();
		//char ch =input.charAt(0);
		char ch = scanner.next().charAt(0); 		// Best Practice
		System.out.println("You have entered "+ch);
		vowels.isVowel(ch);
	}

}
