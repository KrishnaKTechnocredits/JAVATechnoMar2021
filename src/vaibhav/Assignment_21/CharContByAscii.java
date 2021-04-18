/*Java Assignment 21:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from
predefined string.

Input: 1rRpd3F9#K(E

Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4+
Total Lowercase: 3
Total Special char: 2
*/

package vaibhav.Assignment_21;

public class CharContByAscii {
	int digitCnt;
	int letterCnt, uCaseCnt, lCaseCnt;
	int spCharCnt;

	void countCh(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (ch >= 48 && ch <= 57)
				digitCnt++;
			else if (ch >= 65 && ch <= 90)
				uCaseCnt++;
			else if (ch >= 97 && ch <= 122)
				lCaseCnt++;
			else if ((ch >= 33 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96) || (ch >= 123 && ch <= 126))
				spCharCnt++;
		}
		letterCnt = uCaseCnt + lCaseCnt;
	}

	public static void main(String[] args) {
		CharContByAscii charContByAscii = new CharContByAscii();
		String str = "1rRpd3F9#K(E";

		System.out.println("Given predefined string is : " + str);

		charContByAscii.countCh(str);

		System.out.println("");
		System.out.println("Output is as below :");
		System.out.println("Total digits 			: " + charContByAscii.digitCnt);
		System.out.println("Total Letters	 		: " + (charContByAscii.letterCnt));
		System.out.println("Total Uppercase 		: " + charContByAscii.uCaseCnt);
		System.out.println("Total Lowercase 		: " + charContByAscii.lCaseCnt);
		System.out.println("Total Special Characters	: " + (charContByAscii.spCharCnt));

	}
}
