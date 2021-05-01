package aashay.Assignment_26;
/*
 * 
Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */

public class MaximumDigitInString {

	String maxDigitString(String[] names) {
		String maxDigitString = null;
		int maxCnt = 0;

		for (int index = 0; index < names.length; index++) {
			int cnt = 0;
			cnt = maxDigit(names[index]);
			if (maxCnt < cnt) {
				maxCnt = cnt;
				maxDigitString = names[index];
			}
		}
		return maxDigitString;
	}

	int maxDigit(String names) {
		int cnt = 0;
		for (int index = 0; index < names.length(); index++) {
			char ch = names.charAt(index);
			if (Character.isDigit(ch)) {
				cnt++;
			}
		}
		return cnt;
	}

	void display(String maxDigit) {
		System.out.println("String having maximum digit is: " + maxDigit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaximumDigitInString maximumDigitInString = new MaximumDigitInString();
		String[] names = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String maxDigit = maximumDigitInString.maxDigitString(names);
		maximumDigitInString.display(maxDigit);
	}

}
