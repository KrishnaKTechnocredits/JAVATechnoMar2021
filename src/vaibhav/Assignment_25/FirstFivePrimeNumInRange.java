/*Java Assignment 25:  18th April'2021

1.	Program 1: Write a method which will return first 5 prime numbers from given range.
	Main method should print the output.
Input: Start Index -> 10
End Index -> 50
Output: 11 13 17 19 23

*/
package vaibhav.Assignment_25;

import java.util.Scanner;

public class FirstFivePrimeNumInRange {

	static int startNum;
	static int endNum;

	// *************************************************************************//
	// ----defineRange is a method which set the values startNum, endNum and ---//
	// ---- returns the flag for correct define which is used to display -------//
	// -----------------------the output of the program ------------------------//
	// *************************************************************************//

	boolean defineRange(int num1, int num2) {
		boolean rangeFlag = true;
		if (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				startNum = num2;
				endNum = num1;
			} else if (num2 > num1) {
				startNum = num1;
				endNum = num2;
			} else if (num1 == num2) {
				System.out.println("Please enter two different numbers to define range");
				rangeFlag = false;
			}
		} else {
			System.out.println("Please enter positive numbers to define range");
			rangeFlag = false;
		}
		return rangeFlag;
	}

	// *************************************************************************//
	// ----isPrimeNumber is a method which takes the input parameter as a ------//
	// ---- number and returns the true flag if targetNum is prime number ------//
	// *************************************************************************//

	boolean isPrimeNumber(int targetNum) {
		boolean primeFlag = true;

		for (int index = 2; index <= targetNum / 2; index++) {
			if (targetNum % index == 0)
				primeFlag = false;
		}
		return primeFlag;
	}

	// *************************************************************************//
	// ----firstFivePrimeNumebersInRange is a method which takes the input------//
	// ---- parameter as two numbers and returns the array of first five -------//
	// -------------- prime numbers in a given range ---------------------------//
	// *************************************************************************//

	int[] firstFivePrimeNumebersInRange(int startNum, int endNum) {
		int countIndex = 0;
		int[] targetArr = new int[5];

		for (int index = startNum; index <= endNum; index++) {
			if (isPrimeNumber(index)) {
				targetArr[countIndex] = index;
				countIndex++;
				if (countIndex == 5)
					break;
			}
		}
		return targetArr;
	}

	// *************************************************************************//
	// ---- displayFirstFivePrime is a method takes the input value as ---------//
	// ---- targetArr and flag value form defineRange method and which is ------//
	// ----------used to display first five prime numbers from array------------//
	// *************************************************************************//

	void displayFirstFivePrime(int[] targetArr, boolean flag) {
		if (flag) {
			System.out.println("First five prime numbers in a given range are : ");
			for (int index = 0; index < targetArr.length; index++) {
				System.out.print(targetArr[index] + " ");
			}
		} else
			System.out.println("Defined range is not correct");
	}

	// *************************************************************************//
	// ----------------------------main method----------------------------------//
	// *************************************************************************//

	public static void main(String[] args) {

		FirstFivePrimeNumInRange fivePrimeNumInRange = new FirstFivePrimeNumInRange();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please define the range by start number and end number : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.close();

		boolean displayFlag = fivePrimeNumInRange.defineRange(num1, num2);
		int[] targetArr = fivePrimeNumInRange.firstFivePrimeNumebersInRange(startNum, endNum);
		fivePrimeNumInRange.displayFirstFivePrime(targetArr, displayFlag);

	}
}
