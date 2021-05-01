//Write a method which will return a string containing maximum digits.

package krati_Shukla.Assignment26;

public class MaxDigit {

	int HasMaxDigit(String[] input) {

		int length = input.length;
		int[] output = new int[length];
		for (int index = 0; index < length; index++) {
			String newInput = input[index];
			int count = 0;
			int newlength = newInput.length();
			for (int newIndex = 0; newIndex < newlength; newIndex++) {
				char ch = newInput.charAt(newIndex);
				if (Character.isDigit(ch)) {
					count++;
					output[index] = count;
				}
			}
		}
		int position = FindMax(output);
		return position;
	}

	int FindMax(int[] output) {

		int length = output.length;
		int max = output[0];
		int position = 0;
		for (int i = 0; i < length; i++) {
			if (max < output[i])
				position = i;
			max = output[i];
		}
		return position;
	}

	public static void main(String[] a) {
		MaxDigit maxDigit = new MaxDigit();
		String[] str = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K999966552r3ati", "4M4a5d5h1v1i93" };
		int maxString = maxDigit.HasMaxDigit(str);
		System.out.println(str[maxString]);
	}
}
