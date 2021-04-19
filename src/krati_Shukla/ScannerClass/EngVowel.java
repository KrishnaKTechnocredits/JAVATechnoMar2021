package krati_Shukla.ScannerClass;

import java.util.Scanner;

public class EngVowel {
	void checkVowel(char letter) {
		switch(letter) {
			case 'A':
			case 'a':
				System.out.println(letter+" is Vowel");
				break;
			case 'E':
			case 'e':
				System.out.println(letter+" is Vowel");
				break;
			case 'I':
			case 'i':
				System.out.println(letter+" is Vowel");
				break;
			case 'O':
			case 'o':
				System.out.println(letter+" is Vowel");
				break;
			case 'U':
			case 'u':
				System.out.println(letter+" is Vowel");
				break;
			default:
				System.out.println(letter+ " is not Vowel");
		}
		
	}
	
	
	public static void main(String[] a) {
		EngVowel engVowel = new EngVowel();
		Scanner scanner = new Scanner(System.in);
		int index2 = 0;
		char ch;
		
		System.out.println("Enter Name");
		String input = scanner.next();
		int length = input.length();
				
		do {
			ch = input.charAt(index2);
			System.out.println("Value of CH is " +ch);
			engVowel.checkVowel(ch);
			index2++;
		}while(index2 != length);
	}

}
