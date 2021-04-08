/** WAP to evaluate whether given character is vowel or not using switch case and scanner*/

package sourabh.scannerExamples;

import java.util.Scanner;

public class FindVowel {
	void findVowel(char input) {
		input= Character.toUpperCase(input);
		switch (input) {
			case 'A':
				System.out.println(input+" is vowel");
				break;
			case 'E':
				System.out.println(input+" is vowel");
				break;
			case 'I':
				System.out.println(input+" is vowel");
				break;
			case 'O':
				System.out.println(input+" is vowel");
				break;
			case 'U':
				System.out.println(input+" is vowel");
				break;	
		default:
			System.out.println(input+" is not a vowel");
			break;
		}
	}
	public static void main(String[] args) {
		FindVowel findVowel= new FindVowel();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter any character: ");
		String ch= scanner.next();
		char input= ch.charAt(0);
		findVowel.findVowel(input);
	}
}
