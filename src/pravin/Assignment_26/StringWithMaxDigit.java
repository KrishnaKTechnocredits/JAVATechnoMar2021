/*Assignment - 26 : 19th April'2021
Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93 */
package pravin.Assignment_26;

public class StringWithMaxDigit {

	String getStringWithMaxDigit(String[] names) {
		int maxDigitCount = 0;
		String maxDigitName = names[0];
		for (int index = 0; index < names.length; index++) {
			int digitCount = 0;
			for (int innerIndex = 0; innerIndex < names[index].length(); innerIndex++) {
				char ch = names[index].charAt(innerIndex);
				if (Character.isDigit(ch))
					digitCount++;
			}
			if (digitCount > maxDigitCount) {
				maxDigitCount = digitCount;
				maxDigitName = names[index];
			}
		}
		return maxDigitName;
	}

	public static void main(String[] args) {
		System.out.print("String containing max digit is ");
		System.out.println(new StringWithMaxDigit().getStringWithMaxDigit(
				new String[] { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" }));
	}
}
