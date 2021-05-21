/*Java Assignment 26:  19th April'2021

1.	Program 1: Write a method which will return a string containing maximum digits.
		
Input: {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output: 4M4a5d5h1v1i93

*/

package vaibhav.Assignment_26;

public class StringWithMaxDigits {

	int numCount(String str) {
		int numCount = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				numCount++;
		}
		return numCount;
	}

	int[] countArr(String[] str) {
		int[] outCountArr = new int[str.length];

		for (int index = 0; index < str.length; index++) {
			outCountArr[index] = numCount(str[index]);
		}
		return outCountArr;
	}

	int getMaxNumIndex(int[] numArr) {

		int maxIndex = 0;
		int maxNum = numArr[0];

		for (int index = 1; index < numArr.length; index++) {
			if (maxNum < numArr[index]) {
				maxNum = numArr[index];
				maxIndex = index;
			}
		}
		return maxIndex;
	}

	public static void main(String[] args) {
		StringWithMaxDigits stringWithMaxDigits = new StringWithMaxDigits();

		String[] inputStr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };

		int[] countArr = stringWithMaxDigits.countArr(inputStr);
		int maxNumindex = stringWithMaxDigits.getMaxNumIndex(countArr);

		System.out.println("String containing maximum digits in a given string array is : ");
		System.out.println("");
		System.out.println("Output --> " + inputStr[maxNumindex]);
	}
}
