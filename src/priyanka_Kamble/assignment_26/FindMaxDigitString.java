package priyanka_Kamble.assignment_26;

import java.util.Arrays;

/*Assignment - 26 : 19th April'2021
Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
*/
public class FindMaxDigitString {

	String maxDigitString(String[] input) {

		int maxCount = 0;
		String MaxDigitName = input[0];

		for (int index = 0; index < input.length; index++) {
			int digitCount = 0;

			for (int innerIndex = 0; innerIndex < input[index].length(); innerIndex++) {
				char ch = input[index].charAt(innerIndex);
				if (Character.isDigit(ch))
					digitCount++;
			}

			if (digitCount > maxCount) {
				maxCount = digitCount;
				MaxDigitName = input[index];
			}
		}

		return MaxDigitName;
	}

	public static void main(String[] args) {
		//new FindMaxDigitString();
		String[] input = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		System.out.println("Input Array - " + Arrays.asList(input));
		System.out.println("String Containing max digit is - " +new FindMaxDigitString().maxDigitString(input) );
	}
}
