/*Java Assignment 20:  14th April'2021

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

package vaibhav.Assignment_20;

public class CharCont {

	int digitCnt;
	int letterCnt, uCaseCnt, lCaseCnt;
	int spCharCnt;

	void countChMethod(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);

			if (Character.isDigit(ch))
				digitCnt++;
			else if (Character.isUpperCase(ch))
				uCaseCnt++;
			else if (Character.isLowerCase(ch))
				lCaseCnt++;
			else
				spCharCnt++;
		}
		letterCnt = uCaseCnt + lCaseCnt;
	}

	public static void main(String[] args) {

		CharCont charCont = new CharCont();
		String str = "1rRpd3F9#K(E";
		System.out.println("Given predefined string is : " + str);

		charCont.countChMethod(str);
		
		System.out.println("");
		System.out.println("Output is as below :");
		System.out.println("Total digits 			: " + charCont.digitCnt);
		System.out.println("Total Letters	 		: " + (charCont.letterCnt));
		System.out.println("Total Uppercase 		: " + charCont.uCaseCnt);
		System.out.println("Total Lowercase 		: " + charCont.lCaseCnt);
		System.out.println("Total Special Characters	: " + (charCont.spCharCnt));

	}

}
