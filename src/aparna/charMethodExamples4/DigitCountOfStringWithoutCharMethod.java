/*/*Assignment 21:-
 * 2) WAP to sum all the numbers in given string without using Character Class Method..
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */
package aparna.charMethodExamples4;

import java.util.Scanner;

public class DigitCountOfStringWithoutCharMethod {

	void digitCountOfCharNum(String inputName) {

		int sumofCharDigit = 0;
		for (int index = 0; index < inputName.length(); index++) {
			char saveEachChar = inputName.charAt(index);
			if (saveEachChar >= 48 && saveEachChar <= 57) {
				// sumofCharDigit = sumofCharDigit +
				// Integer.parseInt(inputName.valueOf(saveEachChar));//String Class method is
				// 'valueOf'
				sumofCharDigit = sumofCharDigit + Integer.parseInt(String.valueOf(saveEachChar));// valueOf method is
																									// static method of
																									// String Class so
																									// should be
																									// accessed in
																									// Static way

			}

		}
		System.out.println("Sum of all Char digits in Input String is: " + sumofCharDigit);
	}

	public static void main(String[] args) {
		DigitCountOfStringWithoutCharMethod digitCountOfStringWithoutCharMethod = new DigitCountOfStringWithoutCharMethod();
		// digitCountOfStringWithoutCharMethod.digitCountOfCharNum("J7yu9y8h1h8j4b7j3jjb6");

		// Through Scanner Class:-
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please Enter Input Name: ");

		String inputStringName = scanner.next();
		digitCountOfStringWithoutCharMethod.digitCountOfCharNum(inputStringName);
		scanner.close();
	}

}
