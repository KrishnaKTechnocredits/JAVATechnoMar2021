package priyanka_Panat.assignment21;

import java.util.Scanner;

public class CountNumOfDigitLetters {
		void countNumOfChar(String input) {
			int upperCaseCount = 0;
			int lowerCaseCount = 0;
			int digit = 0;
			int lettersCount = 0;
			int specialChar = 0;
			for (int i = 0; i < input.length(); i++) {
				int asciiValue = input.charAt(i);
				if (asciiValue >= 65 && asciiValue <= 90) {
					upperCaseCount++;
					lettersCount++;
				} else if (asciiValue >= 97 && asciiValue <= 122) {
					lowerCaseCount++;
					lettersCount++;
				} else if (asciiValue >= 48 && asciiValue <= 57) {
					digit++;
				} else {
					specialChar++;
				}

			}
			System.out.println("Total no of Digits in given string is : " + digit);
			System.out.println("Total no of Letters in given string is : " + lettersCount);
			System.out.println("Total no of UpperCase characters in given string is : " + upperCaseCount);
			System.out.println("Total no of LowerCase characters in given string is: " + lowerCaseCount);
			System.out.println("Total no of Special characters in given string is : " + specialChar);

		}

		public static void main(String[] args) {
			CountNumOfDigitLetters countNumOfDigitLetters= new CountNumOfDigitLetters();
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the String : ");
			String str = sc.next();
			countNumOfDigitLetters.countNumOfChar(str);
			sc.close();
		}
	}

