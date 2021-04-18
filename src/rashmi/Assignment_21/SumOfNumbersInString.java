/*Assignment 21: 14th April'2021 

Assignment 20 (both program) without using Character class method.

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package rashmi.Assignment_21;

public class SumOfNumbersInString {

	void findSumOfDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 48 && ch <= 57)
				sum = sum + Integer.parseInt(String.valueOf(ch));
			// sum = sum +Integer.parseInt(str.valueOf(str.charAt(i)));
		}
		System.out.println("Sum of all digits in String is: " + sum);
	}

	public static void main(String[] args) {
		new SumOfNumbersInString().findSumOfDigits("J7yu9y8h1h8j4b7j3jjb6");
	}
}
