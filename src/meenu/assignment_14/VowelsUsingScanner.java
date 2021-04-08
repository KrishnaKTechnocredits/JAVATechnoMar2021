package meenu.assignment_14;

import java.util.Scanner;

public class VowelsUsingScanner {
	
	void checkVowels(char ch) {
		ch = Character.toUpperCase(ch);
		switch(ch){
		case'A':
		case'E':
		case'I':
		case'O':
		case'U':
			System.out.println(ch+" is a vowel");
			break;
		default:
			System.out.println(ch+" is not a vowel");		
		}
	}

	public static void main(String[] args) {
		VowelsUsingScanner vowelsUsingScanner = new VowelsUsingScanner();
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter the character : ");
		String input = scanner.next();
		char ch = input.charAt(0);
		vowelsUsingScanner.checkVowels(ch);
	}

}
