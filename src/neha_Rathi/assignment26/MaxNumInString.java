//Assignment - 26 : 19th April'2021
//Program 1: Write a method which will return a string containing maximum digits.

package neha_Rathi.assignment26;

public class MaxNumInString {

	int maxNumString(String input) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (Character.isDigit(ch))
				count++;
		}
		return count;
	}

	String maxString(String[] input) {
		String res = "";
		int temp = 0;
		for (int index = 0; index < input.length; index++) {
			if (temp < maxNumString(input[index])) {
				temp = maxNumString(input[index]);
				res = input[index];
			}
		}
		return res;
	}

	public static void main(String[] args) {
		MaxNumInString maxNumInString = new MaxNumInString();
		String[] input = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "4M4a5d5h1v1i93", "1K2r3ati" };
		System.out.println(maxNumInString.maxString(input));
	}
}
