package anubhav.StringOperations;

import java.util.Scanner;

/*Count of types of characters in a string without using character functions*/

public class CountOfAllTypeOfCharactersUsingASCII {

	void inputString(String input) {
		int digitCount       =0;
		int characterCount   =0;
		int upperCaseCount   =0;
		int lowerCaseCount   =0;
		int length= input.length();
		int ascii;
		
		for (int index=0; index<length; index++) {
			char ch = input.charAt(index);
			ascii= (int)ch;
			if (ascii>=65 && ascii<=90)
				upperCaseCount++;
			else if (ascii>=97 && ascii<=122)
				lowerCaseCount++;
			else if (ascii>=48 && ascii<=57)
				digitCount++;
			else 
				characterCount++;
		}
		System.out.println("Total digit count in the string is                :" + digitCount);
		System.out.println("Total letters count in the string is              :" + (upperCaseCount + lowerCaseCount));
		System.out.println("Total upper case character count in the string is :" + upperCaseCount);
		System.out.println("Total lower case character count in the string is :" + lowerCaseCount);
		System.out.println("Total special character count in the string is    :" + characterCount);
	}
		
	public static void main (String[] args) {
		CountOfAllTypeOfCharactersUsingASCII countOfAllTypeOfCharactersUsingASCII= new CountOfAllTypeOfCharactersUsingASCII();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter input string with mixed character types :");
		String input =scanner.nextLine();
		countOfAllTypeOfCharactersUsingASCII.inputString(input);		
		scanner.close();	
	}
}
