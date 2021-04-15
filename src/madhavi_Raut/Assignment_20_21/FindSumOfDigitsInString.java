package madhavi_Raut.Assignment_20_21;
/*Assignment 20: 
 Program 02- WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Output: Sum of all digits in String is: 53 */

public class FindSumOfDigitsInString {

	void findSumOfDigitsInString(String str) {
		int sumOfDigits = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				sumOfDigits += Character.getNumericValue(ch);
		}
		System.out.println("Sum of all digits in String is: " + sumOfDigits);
	}

	public static void main(String[] args) {
		new FindSumOfDigitsInString().findSumOfDigitsInString("J7yu9y8h1h8j4b7j3jjb6");
	}
}
