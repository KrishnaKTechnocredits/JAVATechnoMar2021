package pallavi.Assignment_26;

/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/

public class MaxDigitString {

	int countDigit(String name) {
		int count = 0;
		for (int index = 0; index < name.length(); index++) {
			char ch = name.charAt(index);
			if (Character.isDigit(ch)) {
				count++;
			}
		}
		return count;
	}

	String nameArray(String[] arr) {
		String maxDigitName = " ";
		int max = 0;
		for (int index = 0; index < arr.length; index++) {
			int countOfDigit = countDigit(arr[index]);
			if (max < countOfDigit) {
				max = countOfDigit;
				maxDigitName = arr[index];
			}

		}
		return maxDigitName;

	}

	public static void main(String[] args) {
		String[] name = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String output = new MaxDigitString().nameArray(name);
		System.out.println(output);
	}

}
