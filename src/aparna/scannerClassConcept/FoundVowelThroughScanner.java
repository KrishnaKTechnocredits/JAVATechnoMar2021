/*Assignment - 14 : 8th April'2021
Use Scanner Class for this Program
WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel

 */
package aparna.scannerClassConcept;

import java.util.Scanner;

public class FoundVowelThroughScanner {

	void foundVowel(char character) {
		switch (character) {
		case 'A':
		case 'a':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'E':
		case 'e':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'I':
		case 'i':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'O':
		case 'o':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'U':
		case 'u':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		default:
			System.out.println("Given Character " + character + " is not Vowel");
		}
	}

	void vowelFoundByAnotherWay(char character) {

		character = Character.toUpperCase(character);// Changing lower case character to Upper case
		switch (character) {
		case 'A':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'E':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'I':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'O':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		case 'U':
			System.out.println("Given Character " + character + " is Vowel");
			break;

		default:
			System.out.println("Given Character " + character + " is not Vowel");
		}
	}

	public static void main(String[] args) {
		FoundVowelThroughScanner foundVowelThroughScanner = new FoundVowelThroughScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your Character for first method:- ");

		// for first method
		String input1 = scanner.next();
		char character1 = input1.charAt(0);
		foundVowelThroughScanner.foundVowel(character1);

		String input2 = scanner.next();
		char character2 = input2.charAt(0);
		foundVowelThroughScanner.foundVowel(character2);

		// for second method
		String input3 = scanner.next();
		char character3 = input3.charAt(0);
		foundVowelThroughScanner.vowelFoundByAnotherWay(character3);

		String input4 = scanner.next();
		char character4 = input4.charAt(0);
		foundVowelThroughScanner.vowelFoundByAnotherWay(character4);
		scanner.close();
	}

}
