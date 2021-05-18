/*Assignment 20:-
 * 2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */
package aparna.charMethodExamples3;

import java.util.Scanner;

public class DigitCountOfString {

	void digitCountOfCharNum(String inputName) {

		int sumofCharDigit = 0;
		for (int index = 0; index < inputName.length(); index++) {
			char saveEachChar = inputName.charAt(index);
			if (Character.isDigit(saveEachChar)) {
				sumofCharDigit = sumofCharDigit + Character.getNumericValue(saveEachChar);
			}

		}
		System.out.println("Sum of all Char digits in String is: " + sumofCharDigit);
	}

	public static void main(String[] args) {
		DigitCountOfString digitCountOfString = new DigitCountOfString();
		// digitCountOfString.digitCountOfCharNum("J7yu9y8h1h8j4b7j3jjb6");

		// Through Scanner Class:-
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Input Name: ");

		String inputStringName = scanner.next();
		digitCountOfString.digitCountOfCharNum(inputStringName);
		scanner.close();

	}

}
