/*WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53*/

package krati_Jain.Assignment_20;

public class SumNumInString {

	static int index = 0;
	static int sumDigit = 0;

	public static void main(String[] args) {
		String inputStr = "J7yu9y8h1h8j4b7j3jjb6#K(E";
		SumNumInString sumNum = new SumNumInString();
		sumNum.readingString(inputStr);
		System.out.println("Sum of all digits in String is: " + sumDigit);
	}

	void readingString(String inputStr) {

		for (index = 0; index < inputStr.length(); index++) {
			char stringToChar = inputStr.charAt(index);
			if (Character.isDigit(stringToChar)) {
				// System.out.println(stringToChar);
				int intToHoldchar = Character.getNumericValue(stringToChar);
				sumDigit = sumDigit + intToHoldchar;

			}

		}
	}

}
