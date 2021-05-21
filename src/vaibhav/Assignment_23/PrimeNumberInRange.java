/*Java Assignment 23:  18th April 2021

2.	Print all the prime numbers given range.
Input: 40 to 100
Output:

*/

package vaibhav.Assignment_23;

import java.util.Scanner;

public class PrimeNumberInRange {
	static int startNum, endNum;

	void defineRange(int num1, int num2) {
		if (num1 > 0 && num2 > 0) {
			if (num1 > num2) {
				startNum = num2;
				endNum = num1;
			} else if (num2 > num1) {
				startNum = num1;
				endNum = num2;
			} else
				System.out.println("Please enter valid range to find prime number");
		} else
			System.out.println("Please enter numbers greater than zero to define range");
	}

	void isNumberPrime(int targetNum) {
		int count = 0;
		for (int index = 2; index <= targetNum / 2; index++) {
			if (targetNum % index == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0)
			System.out.print(" " + targetNum + " ");
	}

	void getPrimeNumberInRange(int startNum, int endNum) {
		System.out.println("Prime numbers in a given range " + startNum + " to " + endNum + " are : ");
		for (int index = startNum; index <= endNum; index++) {
			isNumberPrime(index);
		}
	}

	public static void main(String[] args) {
		PrimeNumberInRange primeNumberInRange = new PrimeNumberInRange();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter range to find prime number : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		primeNumberInRange.defineRange(num1, num2);
		primeNumberInRange.getPrimeNumberInRange(startNum, endNum);

		scanner.close();
	}
}
