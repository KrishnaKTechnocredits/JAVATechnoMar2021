/*Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package rashmi.Assignment_20;

public class FindCountWithCharacterMethods {

	void findCountOfDigitLetterUpLowCaseSpecialChar(String str) {
		int digCnt = 0, upperCaseCnt = 0, lowerCaseCnt = 0, specialCharCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i)))
				digCnt++;
			else if (Character.isUpperCase(str.charAt(i)))
				upperCaseCnt++;
			else if (Character.isLowerCase(str.charAt(i)))
				lowerCaseCnt++;
			else
				specialCharCnt++;
		}
		System.out.println("Total Digit: " + digCnt + "\nTotal Letters: " + (upperCaseCnt + lowerCaseCnt)
				+ "\nTotal Uppercase: " + upperCaseCnt + "\nTotal Lowercase: " + lowerCaseCnt + "\nTotal Special char: "
				+ specialCharCnt);
	}

	public static void main(String[] args) {
		new FindCountWithCharacterMethods().findCountOfDigitLetterUpLowCaseSpecialChar("1rRpd3F9#K(E");
	}
}
