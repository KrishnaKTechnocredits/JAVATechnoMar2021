//Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

package krati_Shukla.ScannerClass;

import java.util.Scanner;

public class ReadingString {
	
	void ReadTotal(String input) {
		
		int countUpper=0;
		int countLower=0;
		int countDigit=0;
		int countSpecial=0;
		int length = input.length();
		
		for(int index=0; index<length; index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch))
				countUpper++;
			else if(Character.isLowerCase(ch))
				countLower++;
			else if(Character.isDigit(ch))
				countDigit++;
			else
				countSpecial++;
		}
		System.out.println("Uppercase count :" +countUpper);
		System.out.println("Lowercase count :" +countLower); 
		System.out.println("Letters count :" +(countLower+countUpper)); 
		System.out.println("Digit count :" +countDigit);
		System.out.println("Special character count :" +countSpecial);
	}

	public static void main(String[] a) {
		ReadingString readingString = new ReadingString();
		System.out.println("Enter the string :");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		readingString.ReadTotal(input);
	}
}
