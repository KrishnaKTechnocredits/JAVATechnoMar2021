/*Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93
 */

package aparna.stringExample2;

public class StringWithMaxDigits {

	String maxDigitString(String[] inputNames) {

		String maxDigitsString = null;

		int[] outputCount = new int[inputNames.length];
		String[] outputString = new String[inputNames.length];
		int maxNum = 0;
		for (int index = 0; index < inputNames.length; index++) {
			String targetNames = inputNames[index];
			int count = 0;
			for (int innerIndex = 0; innerIndex < targetNames.length(); innerIndex++) {
				if (targetNames.charAt(innerIndex) >= 48 && targetNames.charAt(innerIndex) <= 57) {
					count++;
				}
				outputString[index] = targetNames;
				outputCount[index] = count;
			}

		}
		maxNum = outputCount[0];
		for (int numIndex = 0; numIndex < outputCount.length; numIndex++) {
			if (maxNum < outputCount[numIndex]) {
				maxNum = outputCount[numIndex];
				maxDigitsString = outputString[numIndex];
			}
		}
		return maxDigitsString;

	}

	public static void main(String[] args) {
		StringWithMaxDigits stringWithMaxDigits = new StringWithMaxDigits();

		String[] inputNames = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String result = stringWithMaxDigits.maxDigitString(inputNames);
		System.out.println("string containing maximum digits: "+result);

	}
}
