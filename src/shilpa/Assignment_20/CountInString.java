/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
package shilpa.Assignment_20;

public class CountInString {
	void getcntOfLettesDigitsSpChar(String str) {
		int digit = 0;
		int Ucase = 0;
		int Lcase = 0;
		int spChar = 0;

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				digit++;
			else if (Character.isUpperCase(ch))
				Ucase++;
			else if (Character.isLowerCase(ch))

				Lcase++;
			else
				spChar++;
		}
		System.out.println("Total Digit: " + digit);
		System.out.println("Total Letters: " + (Ucase + Lcase));
		System.out.println("Tota Upper Case: " + Ucase);
		System.out.println("Total Lower Case: " + Lcase);
		System.out.println("Total Special Characters " + spChar);
	}

	public static void main(String[] args) {
		CountInString countInString = new CountInString();
		countInString.getcntOfLettesDigitsSpChar("1rRpd3F9#K(E");
	}

}
