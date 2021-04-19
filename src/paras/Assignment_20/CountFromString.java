/*
 Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/

package paras.Assignment_20;

import java.util.Scanner;

public class CountFromString {
	
	void count(String input) {
		int digitCount = 0;
		int letterCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int specialCharCount = 0;
		
		for(int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if(Character.isUpperCase(ch))
				upperCaseCount++;
			else if(Character.isLowerCase(ch))
				lowerCaseCount++;
//			else if(Character.isLetter(ch))
//				letterCount++;
			else if(Character.isDigit(ch))
				digitCount++;
			else 
				specialCharCount++;
		}
		
		System.out.println("Total Digit: " + digitCount);
		System.out.println("Total Letters: " + (upperCaseCount+lowerCaseCount));
		System.out.println("Total UpperCase: " + upperCaseCount);
		System.out.println("Total LowerCase: " + lowerCaseCount);
		System.out.println("Total Special Char: " + specialCharCount);
	}
	
	public static void main(String[] args) {
		CountFromString countFromString = new CountFromString();
		System.out.println("Please Enter the String");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		countFromString.count(input);
	}
}
