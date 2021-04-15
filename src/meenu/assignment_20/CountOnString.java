package meenu.assignment_20;

/*Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
*/

import java.util.Scanner;

public class CountOnString {

	void StringCount(String word) {
		int lowerCaseCount = 0;
		int upperCaseCount = 0;
		int lettersCount = 0;
		int digitCount = 0;
		int specialCharCount = 0;
		
		for (int index = 0;index<word.length();index++) {
			if(Character.isUpperCase(word.charAt(index))) {
				upperCaseCount++;
				lettersCount++;
			}else if (Character.isLowerCase(word.charAt(index))) {
				lowerCaseCount++;
			    lettersCount++;
			}else if (Character.isDigit(word.charAt(index)))
			    digitCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total digit count : " + digitCount);
		System.out.println("Total letters count : " + lettersCount);
		System.out.println("Total Uppercase count: " + upperCaseCount);
		System.out.println("Total Lowercase count: " + lowerCaseCount);
		System.out.println("Total Special characters count: " + specialCharCount);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word = scanner.next();
		CountOnString countOnString = new CountOnString();
		countOnString.StringCount(word);
		
		

	}

}
