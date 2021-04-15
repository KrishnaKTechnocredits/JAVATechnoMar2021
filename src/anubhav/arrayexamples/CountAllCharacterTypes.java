package anubhav.arrayexamples;

import java.util.Scanner;

/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class CountAllCharacterTypes {
	
	void countCharType (String input) {
		int specialCharCount= 0;
		int digitCount=       0;
		int upperCaseCount=   0;
		int lowerCaseCount=   0;
		int length= input.length();
		
		for (int index=0; index < length; index++) {
			char ch= input.charAt(index);
			if (Character.isUpperCase(ch)) 
				upperCaseCount++;
			else if (Character.isLowerCase(ch)) 
				lowerCaseCount++;
			else if (Character.isDigit(ch))
				digitCount++;
			else
				specialCharCount= (length- upperCaseCount - lowerCaseCount - digitCount);
			}
			System.out.println("Total digits                :" + digitCount);
			System.out.println("Total letters               :" + (upperCaseCount+lowerCaseCount));
			System.out.println("Total upper case characters :" + upperCaseCount);
			System.out.println("Total lower case characters :" + lowerCaseCount);
			System.out.println("Total special characters    :" + specialCharCount);		
		}
	
	public static void main (String[] args) {
		CountAllCharacterTypes countAllCharacterTypes= new CountAllCharacterTypes();
		Scanner scanner= new Scanner(System.in);
			System.out.println("Enter the string of mixed character types :");
			String input= scanner.next(); 
			countAllCharacterTypes.countCharType(input);
			scanner.close();
	}
}
