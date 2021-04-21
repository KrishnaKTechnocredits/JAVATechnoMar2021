/*-------------------------------------------------------------------
Assignment 20: 14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
package kapil.CharMethod;

public class CountCase {

	void getCount(String str) {
		int cntDigit = 0;
		int cntUpperCase = 0;
		int cntLowerCase = 0;
		int cntSplChar = 0;
		int length = str.length();

		for (int index = 0; index < length; index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				cntDigit++;
			} else if (Character.isUpperCase(ch))
				cntUpperCase++;
			else if (Character.isLowerCase(ch))
				cntLowerCase++;
			else
				cntSplChar++;
		}
		System.out.println("Total digits count :" + cntDigit);
		System.out.println("Total uppercase count : " + cntUpperCase);
		System.out.println("Total lowercase count : " + cntLowerCase);
		System.out.println("Total letters count : " + (cntLowerCase + cntUpperCase));
		System.out.println("Total spcl character count : " + cntSplChar);
	}

	public static void main(String[] args) {
		CountCase countcase = new CountCase();
		countcase.getCount("1rRpd3F9#K(E");
	}
}
