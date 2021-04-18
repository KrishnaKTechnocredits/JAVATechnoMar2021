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
package priyanka_Panat.assignment20;


import java.util.Scanner;

public class CountDigitsLetters {

	void countCharachters(String input) {
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		int digit = 0;
		int lettersCount = 0;
		int specialChar = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (Character.isUpperCase(ch)) {
				upperCaseCount++;
				lettersCount++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCount++;
				lettersCount++;
			} else if (Character.isDigit(ch)) {
				digit++;
			} else {
				specialChar++;
			}
		}
		System.out.println("Total Digits : " + digit);
		System.out.println("Total Letters : " + lettersCount);
		System.out.println("Total UpperCase : " + upperCaseCount);
		System.out.println("Total LowerCase : " + lowerCaseCount);
		System.out.println("Total Special characters : " + specialChar);

	}

	public static void main(String[] args) {
		CountDigitsLetters countDigitsLetters = new CountDigitsLetters();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.next();
		countDigitsLetters.countCharachters(str);
		sc.close();
	}
}
