package krati_Jain.Assignment_14;

import java.util.Scanner;

public class VowelCheckUserInput {

	void setInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a String to check vowels in that-");
		String input = scan.next();
		input = input.toLowerCase();
		int inputlength=input.length();
		
		for(int i = 0; i<inputlength; i++) {
			char ch = input.charAt(i);
			
			if ((ch == 'a') ||(ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u'))
				System.out.println(ch + " is a vowel");
			else
				System.out.println(ch + " is not a vowel");
		}		
	}
	
	public static void main(String[] args) {
		VowelCheckUserInput vowelCheck = new VowelCheckUserInput();
		vowelCheck.setInput();
	}
}
