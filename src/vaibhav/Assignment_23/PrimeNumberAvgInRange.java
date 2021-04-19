/*Java Assignment 23:  18th April 2021

5.	Average of all the prime numbers given range.
Input: 2 to 100
Output:

*/

package vaibhav.Assignment_23;

import java.util.Scanner;

public class PrimeNumberAvgInRange {

	static int startNum, endNum;
	double sum;
	int count;
	double average;
	
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

	boolean isNumberPrime(int targetNum) {
		boolean primeFlag = true;
		for (int index = 2; index <= targetNum / 2; index++) {
			if (targetNum % index == 0) {
				primeFlag = false;
				break;
			}
		}
		return primeFlag;
	}

	void getAvgInRange(int startNum, int endNum) {
		
		for (int index = startNum; index <= endNum; index++) {

			// ------Added this as 1 is not a prime number-------//

			if (index == 1) {
				sum = 0;
			} else {
				if (isNumberPrime(index)) {
					sum = sum + index;
					count++;
				}
			}
		}
		average = sum/count;
		System.out.println(
				"Average all prime numbers in a given range '" + startNum + " to " + endNum + "' is " + average);

	}

	public static void main(String[] args) {
		PrimeNumberAvgInRange primeNumberAvgInRange = new PrimeNumberAvgInRange();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter range to find prime number : ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();

		primeNumberAvgInRange.defineRange(num1, num2);
		primeNumberAvgInRange.getAvgInRange(startNum, endNum);

		scanner.close();
	}

}
