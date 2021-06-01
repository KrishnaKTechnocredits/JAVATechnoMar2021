/*Assignment 21:  14th April'2021

WAP to print the below statement without character method.package assignment_21_withoutCharClass;

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53

*/
package ami.Assignment_22;

public class SumDigitChar {
	int digits;
	int sum, num;

	int sumStringreturn(String str) {
		for (int index = 0; index < str.length(); index++) {
			int ascii = str.charAt(index);
			if (ascii >= 48 && ascii <= 57) {
				num = Character.getNumericValue(ascii);
				sum = sum + num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		SumDigitChar sumDigitChar = new SumDigitChar();
		String str = "J7yu9y8h1h8j4b7j3jjb6";
		int totalSum = sumDigitChar.sumStringreturn(str);
		System.out.println("Total Sum: " + totalSum);
	}
}
