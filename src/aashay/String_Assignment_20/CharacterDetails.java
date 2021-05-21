package aashay.String_Assignment_20;
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

 */

public class CharacterDetails {
	
	void charDetails(String input) {
		
		int digitCount=0,lettersCount=0,upperCaseCharactersCount=0,lowerCaseCharactersCount=0,specialCharactersCount=0;
		for(int i=0; i <= input.length()-1;i++ ) {
			 
			if(Character.isDigit(input.charAt(i))) {
				digitCount++;
			} else if (Character.isUpperCase(input.charAt(i))) {
				upperCaseCharactersCount++;
			}else if (Character.isLowerCase(input.charAt(i))) {
				lowerCaseCharactersCount++;
			}else 
				specialCharactersCount++;
			
			if (Character.isLetter(input.charAt(i))) {
				lettersCount++;
			}
	
		}
		System.out.println("Total Digit: "+digitCount+"\nTotal Letters: "+lettersCount+"\nTotal Upper Case: "+upperCaseCharactersCount+"\nTotal Lower Case: "+lowerCaseCharactersCount+"\nTotal Special char: "+specialCharactersCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharacterDetails characterDetails = new CharacterDetails();
		characterDetails.charDetails("1rRpd3F9#K(E");
	}

}
