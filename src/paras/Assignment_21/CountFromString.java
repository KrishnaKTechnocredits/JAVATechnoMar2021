/*
 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

Note :- Without using Character method.
 */

package paras.Assignment_21;

import java.util.Scanner;

public class CountFromString {
	 
	int digitCount = 0;
	int letterCount = 0;
	int upperCaseCount = 0;
	int lowerCaseCount = 0;
	int specialCharCount = 0;
	
	void count(String input) {
		for(int index = 0; index < input.length(); index++) {
			if(input.charAt(index) >= 65 && input.charAt(index) <=90)
				upperCaseCount++;
			else if(input.charAt(index) >= 97 && input.charAt(index) <=122)
				lowerCaseCount++;
			else if(input.charAt(index) >= 48 && input.charAt(index) <=57)
				digitCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total Digits: " + digitCount);
		System.out.println("Total UpperCase: " + upperCaseCount);
		System.out.println("Total LowerCase: " + lowerCaseCount);
		System.out.println("Total Special Char: " + specialCharCount);
		System.out.println("Total Letters: " + (upperCaseCount+lowerCaseCount));
	}
	
	public static void main(String[] args) {
		CountFromString countFromString = new CountFromString();
		System.out.println("Please Enter String: ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		countFromString.count(input);
	}
}
