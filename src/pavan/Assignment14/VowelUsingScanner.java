package pavan.Assignment14;

import java.util.Scanner;

import pavan.Assignment13.IdentificationUsingSwitch;

public class VowelUsingScanner {

	void printvovels(String charactor) {
		switch (charactor) {

			case"A":
			case"a":
				System.out.println(charactor+ " is vowel");
			break;
			case"E":
			case"e":
				System.out.println(charactor +" is vowel");
			break;
			case"I":
			case"i":
				System.out.println(charactor+" is vowel");
				break;
			case"O":
			case"o":
				System.out.println(charactor+" is vowel");
				break;
			case"U":
			case"u":
				System.out.println(charactor+" is vowel");
				break;
			default:
				System.out.println(charactor+" is not vowel");
				break;
		}
	}
	public static void main(String[] args) {
		VowelUsingScanner m1= new VowelUsingScanner();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the charactor");
		String char1=scanner.next();
		
		m1. printvovels(char1);
	}
}