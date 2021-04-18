/*1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
*/
package prashant.Assignment_20;

public class CountdigitChar {

	void digitcnt(String str) {
		int digitCnt = 0;
		int uppercaseCnt = 0;
		int lowerCaseCnt = 0;
		int letterCnt = 0;
		int speccharCnt = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch)) {
				digitCnt++;
			} else if (Character.isUpperCase(ch)) {
				uppercaseCnt++;
				letterCnt++;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseCnt++;
				letterCnt++;
			} else
				speccharCnt++;
		}
		System.out.println(
				"Count of Digits,Letters, UpperCase characters, LowerCase characters, Special characters in  " + str);
		System.out.println("Total Digit Count " + digitCnt);
		System.out.println("Total Letter Count " + letterCnt);
		System.out.println("Total UpperCase char Count " + uppercaseCnt);
		System.out.println("Total LowerCase Char Count " + lowerCaseCnt);
		System.out.println("Total Special Char Count " + speccharCnt);
	}

	public static void main(String[] args) {

		CountdigitChar Count = new CountdigitChar();
		String s = "1rRpd3F9#K(E";
		Count.digitcnt(s);

	}
}
