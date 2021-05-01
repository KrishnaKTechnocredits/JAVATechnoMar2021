/*Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23*/

package krati_Jain.Assignment_25;

import java.util.Scanner;

public class First5PrimeNumbers {

	public static void main(String[] args) {

		First5PrimeNumbers first5PrimeNums = new First5PrimeNumbers();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Start index of the range for prime numbers: ");
		int startIndex = scan.nextInt();
		System.out.println("Enter the End index of the range for prime numbers: ");
		int endIndex = scan.nextInt();

		int[] primeNumArr = first5PrimeNums.getPrimeNumbers(startIndex, endIndex);

		System.out.println("First 5 Prime numbers between " + startIndex + " and " + endIndex + " are : ");

		for (int index = 0; index < primeNumArr.length; index++) {
			if (primeNumArr[index] != 0)
				System.out.println(primeNumArr[index]);
		}

	}

	int[] getPrimeNumbers(int startIndex, int endIndex) {
		int count = 0;
		int primeIndex = 0;
		int[] primeNumArr = new int[5];
		for (int index = startIndex; index < endIndex; index++) {
			boolean primeFlag = true;
			for (int innnerind = 2; innnerind < index / 2; innnerind++) {
				if (index % innnerind == 0) {
					primeFlag = false;
					break;
				}
			}

			if (primeFlag == true) {
				primeNumArr[primeIndex] = index;
				// System.out.println(primeNumArr[primeIndex] + " is a Prime number printed in
				// Array at index : " + primeIndex);
				primeIndex++;
			}

			if (primeIndex == 5)
				break;

		}
		return primeNumArr;
	}
}
