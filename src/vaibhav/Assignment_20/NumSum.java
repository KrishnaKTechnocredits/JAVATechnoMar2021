/*Java Assignment 20:  14th April'2021

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

*/

package vaibhav.Assignment_20;

public class NumSum {

	int sum;

	int getSum(String str) {

		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sum = sum + Character.getNumericValue(ch);
		}
		return sum;
	}

	public static void main(String[] args) {
		NumSum numSum = new NumSum();
		System.out.println("Input string is : J7yu9y8h1h8j4b7j3jjb6");
		System.out.println("Sum of all digits in String is : " + numSum.getSum("J7yu9y8h1h8j4b7j3jjb6"));

	}

}
