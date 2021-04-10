/*Java Assignment 14: 8th April'2021

1. WAP to evaluate whether given character is vowel or not using Scanner class.
sample input1 : d
sample output1 : d is not a vowel

sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/

package vaibhav.Assignment_14;

import java.util.Scanner;

public class VowelByScannerClass {

	void decideVowel(String ch) {
		// System.out.println("");
		// System.out.println("Decision done using single exicution line");
		switch (ch) {
		case "A":
		case "a":
		case "E":
		case "e":
		case "I":
		case "i":
		case "O":
		case "o":
		case "U":
		case "u":
			System.out.println(ch + " is a vowel");
			System.out.println("");
			break;
		default:
			System.out.println(ch + " is NOT a vowel");
			System.out.println("");
			break;
		}
	}

	public static void main(String[] args) {
		VowelByScannerClass vowelByScannerClass = new VowelByScannerClass();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter maximum 10 alphabets to decide it it's a vowel : ");
		String ch1 = scanner.next();
		vowelByScannerClass.decideVowel(ch1);
		String ch2 = scanner.next();
		vowelByScannerClass.decideVowel(ch2);
		String ch3 = scanner.next();
		vowelByScannerClass.decideVowel(ch3);
		String ch4 = scanner.next();
		vowelByScannerClass.decideVowel(ch4);
		String ch5 = scanner.next();
		vowelByScannerClass.decideVowel(ch5);
		String ch6 = scanner.next();
		vowelByScannerClass.decideVowel(ch6);
		String ch7 = scanner.next();
		vowelByScannerClass.decideVowel(ch7);
		String ch8 = scanner.next();
		vowelByScannerClass.decideVowel(ch8);
		String ch9 = scanner.next();
		vowelByScannerClass.decideVowel(ch9);
		String ch10 = scanner.next();
		vowelByScannerClass.decideVowel(ch10);
		scanner.close();
	}

}
