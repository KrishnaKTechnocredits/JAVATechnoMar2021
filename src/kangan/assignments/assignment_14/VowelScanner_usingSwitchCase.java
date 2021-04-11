package kangan.assignments.assignment_14;

import java.util.Scanner;

public class VowelScanner_usingSwitchCase {

	 public static void main(String[] args) {
		  
		  Scanner scanner = new Scanner(System.in);
		  System.out.println("Enter the alphabet");
		  String input = scanner.nextLine();
		  char ch = input.charAt(0);
		 
		  switch(ch) {
	  case 'A':
		case 'a':
			System.out.println("is a Vowel");
			break;
		case 'E':
		case 'e':
			System.out.println("is a Vowel");
			break;
		case 'I':
		case 'i':
			System.out.println(" is a Vowel");
			break;
		case 'O':
		case 'o':
			System.out.println("is a Vowel");
			break;
		case 'U':
		case 'u':
			System.out.println("is a Vowel");
			break;
		default:
			System.out.println("is not a Vowel");
			break;
		  }
		 
	  }}
		 


