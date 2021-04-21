package madhavi_Khasbage.CharacterPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Assignment 20:  14th April'2021
1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*
*/
public class FindDifferentCharCount {

	int digitCnt, lettersCnt, upperCaseCnt, lowerCaseCnt, specialCharCnt;

	void getCount(String my_str) {
		for (int index = 0; index < my_str.length(); index++) {
			int asciiVal = my_str.charAt(index);			
			if (asciiVal >= 48 && asciiVal <= 57) {
				digitCnt++;
			} else if ((asciiVal >= 65 && asciiVal <= 90) || (asciiVal >= 97 && asciiVal <= 122)) {
				lettersCnt++;
				if (asciiVal >= 65 && asciiVal <= 90) {
					upperCaseCnt++;
				} else if (asciiVal >= 97 && asciiVal <= 122) {
					lowerCaseCnt++;
				}
			} else {
				specialCharCnt++;
			}
		}
	}

	public static void main(String[] args) {
		FindDifferentCharCount findCnt = new FindDifferentCharCount();
		String str = "1rRpd3F9#K(E";
		findCnt.getCount(str);
		System.out.println("Input :" + str);
		System.out.println("Total digit:" + findCnt.digitCnt);
		System.out.println("Total letters:" + findCnt.lettersCnt);
		System.out.println("Total upper case:" + findCnt.upperCaseCnt);
		System.out.println("Total lower case:" + findCnt.lowerCaseCnt);
		System.out.println("Total special char:" + findCnt.specialCharCnt);
	}
}
