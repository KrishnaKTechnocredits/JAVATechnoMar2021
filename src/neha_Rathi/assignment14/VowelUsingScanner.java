/*
Assignment - 14 : 7th April'2021
WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel
sample input3 : i
sample output3 : i is a vowel 
 */
package neha_Rathi.assignment14;

import java.util.Scanner;

public class VowelUsingScanner {

	void vowelCheck(char ch) {
		ch = Character.toUpperCase(ch);
		switch (ch) {
		case 'A':
			System.out.println(ch + " is vowel");
			break;
		case 'E':
			System.out.println(ch + " is vowel");
			break;
		case 'I':
			System.out.println(ch + " is vowel");
			break;
		case 'O':
			System.out.println(ch + " is vowel");
			break;
		case 'U':
			System.out.println(ch + " is vowel");
			break;
		default:
			System.out.println(ch + " is not vowel");
		}
	}

	public static void main(String[] args) {
		VowelUsingScanner vowelUsingScanner = new VowelUsingScanner();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		String letter = sc.next();
		char ch = letter.charAt(0);
		vowelUsingScanner.vowelCheck(ch);
	}
}
