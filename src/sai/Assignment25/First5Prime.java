package sai.Assignment25;

/*
 * Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23

 */

import java.util.Scanner;

public class First5Prime {

	int[] getPrime(int startIndex, int endIndex) {
		int count = 0;
		int countOfPrime = 0;
		int[] arr = new int[5];
		for (int index = startIndex; index < endIndex; index++) {
			boolean primeFlag = true;
			for (int innnerind = 2; innnerind < index / 2; innnerind++) {
				if (index % innnerind == 0) {
					primeFlag = false;
					break;
				}
			}

			if (primeFlag == true) {
				arr[countOfPrime] = index;
				countOfPrime++;
			}

			if (countOfPrime == 5)
				break;

		}
		return arr;
	}

	public static void main(String[] args) {

		First5Prime first5Prime = new First5Prime();
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Start number for prime numbers: ");
		int startNum = scan.nextInt();
		System.out.println("Enter the End number for prime numbers: ");
		int endNum = scan.nextInt();
		int[] arr = first5Prime.getPrime(startNum, endNum);
		System.out.println("First 5 Prime numbers between " + startNum + " and " + endNum + " are : ");
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0)
				System.out.println(arr[index]);
		}

	}
}
