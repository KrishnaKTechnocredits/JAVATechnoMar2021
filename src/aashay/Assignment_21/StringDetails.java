package aashay.Assignment_21;
/*
 * Assignment 20: 14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

 without using Character class method.
 */

public class StringDetails {

	void charDetails(String input) {

		int digitCount=0,lettersCount=0,upperCaseCharactersCount=0,lowerCaseCharactersCount=0,specialCharactersCount=0;
		for(int i=0; i <= input.length()-1;i++ ) {
			char c = input.charAt(i);
			if(c >= '0' && c <= '9') {
				digitCount++;
			} else if (c >= 'A' && c <= 'Z') {
				upperCaseCharactersCount++;
			}else if (c >= 'a' && c <= 'z') {
				lowerCaseCharactersCount++;
			}else 
				specialCharactersCount++;

			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
				lettersCount++;
			}

		}
		System.out.println("Total Digit: "+digitCount+"\nTotal Letters: "+lettersCount+"\nTotal Upper Case: "+upperCaseCharactersCount+"\nTotal Lower Case: "+lowerCaseCharactersCount+"\nTotal Special char: "+specialCharactersCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringDetails stringDetails = new StringDetails();
		stringDetails.charDetails("1rRpd3F9#K(E");
	}

}
