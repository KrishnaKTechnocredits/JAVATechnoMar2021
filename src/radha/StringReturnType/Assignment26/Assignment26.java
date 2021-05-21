/*
Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */

package radha.StringReturnType.Assignment26;

public class Assignment26 {

	String findStringWithMaxNumbers(String[] str) {
		int maxCount = 0;
		String maxDigitStr = "";
		for (int index = 0; index < str.length; index++) {
			int count = 0;
			for (int strIndex = 0; strIndex < str[index].length(); strIndex++) {
				char letter = str[index].charAt(strIndex);
				if (Character.isDigit(letter)) {
					count++;
				}
			}
			if(maxCount< count) {
				maxCount=count;
				maxDigitStr= str[index];
			}
		}
		return maxDigitStr;
	}

	public static void main(String[] args) {
		Assignment26 assignment26 = new Assignment26();
		String[] words = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String maxString = assignment26.findStringWithMaxNumbers(words);
		System.out.println("String having digits is \n"+maxString);
	}
}
