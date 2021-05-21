/*Assignment 21: 14th April'2021 

Assignment 20 (both program) without using Character class method.

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

package rashmi.Assignment_21;

public class CountDigLetterUpperLowCaseSpecialChar {

	int digitCnt = 0, upperCaseCnt = 0, lowerCaseCnt = 0, specialCharCnt = 0;

	void findDigitLetterUpperLowerCaseSpecialChar(String str) {

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57)
				digitCnt++;
			else if (ch >= 65 && ch <= 90)
				upperCaseCnt++;
			else if (ch >= 97 && ch <= 122)
				lowerCaseCnt++;
			else
				specialCharCnt++;
		}
		System.out.println("Total digit: " + digitCnt + "\nTotal Letters: " + (upperCaseCnt + lowerCaseCnt)
				+ "\nTotal Uppercase :" + upperCaseCnt + "\nTotal LowerCase: " + lowerCaseCnt + "\nTotal Special char:"
				+ specialCharCnt);
	}

	public static void main(String[] args) {
		new CountDigLetterUpperLowCaseSpecialChar().findDigitLetterUpperLowerCaseSpecialChar("1rRpd3F9#K(E");
	}
}
