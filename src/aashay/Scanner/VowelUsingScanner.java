package aashay.Scanner;

import java.util.Scanner;

public class VowelUsingScanner {

	void vowel(String c) {
		
		switch (c) {
		case "a":
			System.out.println("a is a vowel");
			break;
		case "e":
			System.out.println("e is a vowel");
			break;
		case "i":
			System.out.println("i is a vowel");
			break;
		case "o":
			System.out.println("o is a vowel");
			break;
		case "u":
			System.out.println("u is a vowel");
			break;
		default:
			System.out.println(c+" is not a vowel");
			
	}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VowelUsingScanner vowelscanner = new VowelUsingScanner();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the character:");
		String c = scan.next();
		vowelscanner.vowel(c);
		
	}

}
