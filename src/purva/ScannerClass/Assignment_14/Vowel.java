package purva.ScannerClass.Assignment_14;

import java.util.Scanner;

public class Vowel {
	
	void findVowel(char ch) {
		
		switch(ch) {
		   case 'A':
		   case 'a':
		   case 'E':
		   case 'e':
		   case 'I':
		   case 'i':
		   case 'O':
		   case 'o':
		   case 'U':
		   case 'u':
			   System.out.println(ch +" is a vowel");
		       break;
		   
		   default:
			   System.out.println(ch + " is a consonant");
			   break;
		   
		}	 
	}
	public static void main ( String [] args) {	
		Vowel vowel = new Vowel();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a alphabet  ");
		String input = scanner.next();
		char ch = input.charAt(0);
		vowel.findVowel(ch);
		
	}
}


