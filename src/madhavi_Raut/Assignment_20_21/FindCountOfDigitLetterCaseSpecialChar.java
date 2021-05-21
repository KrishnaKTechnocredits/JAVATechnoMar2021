package madhavi_Raut.Assignment_20_21;
/*Assignment 20: 14th April'2021
1) Count Digits,Letters, UpperCase characters, LowerCase characters, special characters from predefined string.
Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class FindCountOfDigitLetterCaseSpecialChar {

	void displayCountOfDigitLetterCaseSpecialChar(String str) {
		int digitCount = 0, uppercaseCount = 0, lowercaseCount = 0, specialCharCount = 0;
		for (int index = 0; index < str.length(); index++) {
			if (Character.isDigit(str.charAt(index)))
				digitCount++;
			else if (Character.isUpperCase(str.charAt(index)))
				uppercaseCount++;
			else if (Character.isLowerCase(str.charAt(index)))
				lowercaseCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total digit: " + digitCount + "\nTotal Letters: " + (uppercaseCount + lowercaseCount)
				+ "\nTotal UpperCase: " + uppercaseCount + "\nTotal LowerCase: " + lowercaseCount
				+ "\nTotal Special Character: " + specialCharCount);
	}

	public static void main(String[] args) {
		new FindCountOfDigitLetterCaseSpecialChar().displayCountOfDigitLetterCaseSpecialChar("1rRpd3F9#K(E");
	}
}
