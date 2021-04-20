/*Java Assignment 23:  18th April 2021

1.	Validate whether given number is prime or not.

*/

package vaibhav.Assignment_23;

import java.util.Scanner;

public class PrimeNumber {

	/*
	 * void validateNumberIsPrimeInitial(int targetNum) { int index = 2; for (;
	 * index <= targetNum / 2; index++) { if (targetNum % index == 0) { break; } }
	 * if ((targetNum / 2 + 1) == index) System.out.println("Given number " +
	 * targetNum + " is a prime number"); else System.out.println("Given number " +
	 * targetNum + " is not a prime number"); }
	 * 
	 * void validateNumberIsPrimeWithBoolean(int targetNum) { boolean isPrimeFlag =
	 * true; for (int index = 2; index <= targetNum / 2; index++) { if (targetNum %
	 * index == 0) { isPrimeFlag = false; break; } } if (isPrimeFlag)
	 * System.out.println("Given number " + targetNum + " is a prime number"); else
	 * System.out.println("Given number " + targetNum + " is not a prime number"); }
	 */

	void validateNumberIsPrime(int targetNum) {
		int count = 0;
		for (int index = 2; index <= targetNum / 2; index++) {
			if (targetNum % index == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0)
			System.out.println("Given number " + targetNum + " is a prime number");
		else
			System.out.println("Given number " + targetNum + " is not a prime number");

	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter number to check given number is prime or not : ");
		int targetNum = scanner.nextInt();

		primeNumber.validateNumberIsPrime(targetNum);
		scanner.close();
	}

}
