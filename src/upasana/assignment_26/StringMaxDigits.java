/*
Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */

package upasana.assignment_26;

public class StringMaxDigits {

	String maxDigits(String[] str) {
		String stringMaxDigits = null;
		int[] outputCount = new int[str.length];
		String[] outputString = new String[str.length];
		for (int index = 0; index < str.length; index++) {
			String target = str[index];
			int count = 0;
			for (int innerIndex = 0; innerIndex < target.length(); innerIndex++) {
				if (target.charAt(innerIndex) >= 48 && target.charAt(innerIndex) <= 57) {
					count++;
				}
				outputString[index] = target;
				outputCount[index] = count;
			}

		}
		int max = outputCount[0];
		for (int index1 = 0; index1 < outputCount.length; index1++) {
			if (max < outputCount[index1]) {
				max = outputCount[index1];
				stringMaxDigits = outputString[index1];
			}
		}
		return stringMaxDigits;

	}

	public static void main(String[] args) {
		String[] str = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String output = new StringMaxDigits().maxDigits(str);
		System.out.println(output);

	}
}
