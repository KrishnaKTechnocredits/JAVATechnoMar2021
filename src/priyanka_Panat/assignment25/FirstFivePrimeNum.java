/*
	 Assignment - 25 : 18th April'2021

	Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
	Input : Start Index -> 10
	        End Index -> 50
	Output : 11 13 17 19 23
	 
	 */

package priyanka_Panat.assignment25;

import java.util.Scanner;

public class FirstFivePrimeNum {

	int[] getPrime(int startRange, int endRange) {
		int count = 0;
		int[] primeNum = new int[5];
		for (int index = startRange; index <= endRange; index++) {
			boolean isPrimeNumber = true;

			for (int innerIndex = 2; innerIndex < index; innerIndex++) {
				if (index % innerIndex == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				primeNum[count] = index;
				count++;
				if (count == 5)
					break;
			}
		}
		return primeNum;
	}

	public static void main(String[] args) {
		FirstFivePrimeNum firstFivePrimeNum = new FirstFivePrimeNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int num1 = sc.nextInt();
		System.out.println("Enter the end number ");
		int num2 = sc.nextInt();

		int[] primeNum = firstFivePrimeNum.getPrime(num1, num2);
		for (int i = 0; i < primeNum.length; i++) {
			if (primeNum[i] != 0)
				System.out.println(primeNum[i]);

		}
		sc.close();
	}
}
