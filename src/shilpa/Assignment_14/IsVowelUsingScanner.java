/*Assignment - 14 : 8th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel*/

package shilpa.Assignment_14;

import java.util.Scanner;

public class IsVowelUsingScanner {

	public void vowel(char ch) {
		switch (ch) {
		case 'A':
		case 'a':
			System.out.println(ch + " is a vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(ch + " is a vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(ch + " is a vowel");
			break;
		case 'O':
		case 'o':
			System.out.println(ch + " is a vowel");
			break;
		case 'U':
		case 'u':
			System.out.println(ch + " is a vowel");
			break;
		default:
			System.out.println(ch + " is an Invalid Character");
			break;

		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		IsVowelUsingScanner isCharVowel = new IsVowelUsingScanner();
		System.out.println("Enter a character");
		String input = scanner.nextLine();
		char ch1 = input.charAt(0);
		isCharVowel.vowel(ch1);
		scanner.close();

	}

}
