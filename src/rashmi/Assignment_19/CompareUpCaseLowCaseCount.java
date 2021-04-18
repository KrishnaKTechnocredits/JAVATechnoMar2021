/*Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/

package rashmi.Assignment_19;

public class CompareUpCaseLowCaseCount {

	String upperLowerCase(String str) {
		int upperCaseCnt = 0, lowerCaseCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {

				upperCaseCnt++;
			} else {
				lowerCaseCnt++;
			}
		}
		if (upperCaseCnt > lowerCaseCnt) {
			return "Techno";
		} else {
			return "Credits";
		}
	}

	String upperLowerCase_1(String str) {
		int upperCaseCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isUpperCase(str.charAt(i))) {
				upperCaseCnt++;
			}
		}
		if (upperCaseCnt > (str.length() - upperCaseCnt)) {
			return "Techno";
		} else {
			return "Credits";

		}
	}

	public static void main(String[] args) {
		CompareUpCaseLowCaseCount compareUpCaseLowCaseCount = new CompareUpCaseLowCaseCount();
		String str = compareUpCaseLowCaseCount.upperLowerCase("TeCHnoSessionS");
		String str1 = compareUpCaseLowCaseCount.upperLowerCase("FANon");
		String str2 = compareUpCaseLowCaseCount.upperLowerCase_1("LIFEisbeautiful");
		String str3 = compareUpCaseLowCaseCount.upperLowerCase_1("PLEASANTlife");
		System.out.println(str);
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
