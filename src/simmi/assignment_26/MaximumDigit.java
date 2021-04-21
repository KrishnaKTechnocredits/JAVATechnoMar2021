/*Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/

package simmi.assignment_26;

public class MaximumDigit {
	public static void main(String[] args) {
		String[] input = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String output = new MaximumDigit().maximum(input);
		System.out.println(output);
	}

	String maximum(String[] arr) {
		String maxDigits = null;
		String[] output = new String[arr.length];
		int[] outputCount = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			String target = arr[index];
			int count = 0;
			for (int innerIndex = 0; innerIndex < target.length(); innerIndex++) {
				if (target.charAt(innerIndex) >= 48 && target.charAt(innerIndex) <= 57) {
					count++;
				}
				output[index] = target;
				outputCount[index] = count;
			}
		}
		int max = outputCount[0];
		for (int index = 0; index < outputCount.length; index++) {
			if (max < outputCount[index]) {
				max = outputCount[index];
				maxDigits = output[index];
			}
		}

		return maxDigits;
	}
}