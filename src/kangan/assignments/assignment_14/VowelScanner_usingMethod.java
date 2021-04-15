package kangan.assignments.assignment_14;

import java.util.Scanner;

public class VowelScanner_usingMethod {
	
	public void isVowel(char X) {
		switch(X) {
		case 'A':
		case 'a':
			System.out.println(X + " is a Vowel");
			break;
		case 'E':
		case 'e':
			System.out.println(X + " is a Vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(X + " is a Vowel");
			break;
		case 'O':
		case 'o':
			System.out.println(X + " is a Vowel");
			break;
		case 'U':
		case 'u':
			System.out.println(X + " is a Vowel");
			break;
		default:
			System.out.println(X + " is not a Vowel");
			break;
		}
	}
	 
	
  public static void main(String[] args) {
	  
	  VowelScanner_usingMethod vowelScanner = new VowelScanner_usingMethod();
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Enter the alphabet");
	  String input = scanner.nextLine();
	  char ch = input.charAt(0);
	  vowelScanner.isVowel(ch);
  }
}



