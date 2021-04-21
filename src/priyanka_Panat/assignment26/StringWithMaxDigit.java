/*
	 Assignment - 26 : 19th April'2021

	Program 1: Write a method which will return a string containing maximum digits.
	Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
	Output : 4M4a5d5h1v1i93

	 */

package priyanka_Panat.assignment26;

public class StringWithMaxDigit {

	String printStringWithMaxDigit(String[] str) {
		int max = 0;
		String maxDigitString = "";
		for (int index = 0; index < str.length; index++) {
			int count = 0;
			for (int index1 = 0; index1 < str[index].length(); index1++) {
				if (Character.isDigit(str[index].charAt(index))) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				maxDigitString = str[index];
			}
		}
		return maxDigitString;
	}

	public static void main(String[] args) {
		StringWithMaxDigit stringWithMaxDigit = new StringWithMaxDigit();
		String[] arr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String result = stringWithMaxDigit.printStringWithMaxDigit(arr);
		System.out.println("String containing maximum digits from given array is : " + result);
	}
}
