package madhavi_Raut.Assignment_20_21;
/*Assignment 21: 14th April'2021
 Below program without using Character class
1) Count Digits,Letters, UpperCase characters, LowerCase characters, special characters from predefined string.
Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/

public class FindCount {
	void findCount(String str) {
		int digitCount = 0, uppercaseCount = 0, lowercaseCount = 0, specialCharCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 48 && ch <= 57)
				digitCount++;
			else if (ch >= 65 && ch <= 90)
				uppercaseCount++;
			else if (ch >= 97 && ch <= 122)
				lowercaseCount++;
			else
				specialCharCount++;
		}
		System.out.println("Total digit: " + digitCount + "\nTotal Letters: " + (uppercaseCount + lowercaseCount)
				+ "\nTotal UpperCase: " + uppercaseCount + "\nTotal LowerCase: " + lowercaseCount
				+ "\nTotal Special Character: " + specialCharCount);
	}

	public static void main(String[] args) {
		new FindCount().findCount("1rRpd3F9#K(E");
	}
}
