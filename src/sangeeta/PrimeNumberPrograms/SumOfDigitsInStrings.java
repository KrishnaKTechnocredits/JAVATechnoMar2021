/*Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4*/

package sangeeta.PrimeNumberPrograms;

import java.util.Scanner;

public class SumOfDigitsInStrings {

	int getStringSum(String str) {
		int sum = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch)) {
				String temp = str.substring(index, index + 1);
				sum = sum + Integer.parseInt(temp);
			}
		}
		return sum;
	}

	int[] getStringArray(String[] str) {
		int[] output = new int[str.length];
		int index = 0;
		for (int i = 0; i < str.length; i++) {
			int sum = getStringSum(str[i]);
			if (sum >= 0) {
				output[index] = sum;
				index++;
			}

		}
		return output;
	}

	public static void main(String[] a) {
		SumOfDigitsInStrings sumOfDigitsInStrings = new SumOfDigitsInStrings();
		String[] names = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		int[] output = sumOfDigitsInStrings.getStringArray(names);
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}
	}

}
