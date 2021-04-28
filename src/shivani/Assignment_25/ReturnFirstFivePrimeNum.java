package shivani.Assignment_25;
/*Write a method which will return first 5 prime numberfrom given range.main method should return the output
		input 10-50
		output: 11 13 17 19 23*/

import java.util.Scanner;

public class ReturnFirstFivePrimeNum {
	int sum = 0;
	static int count = 0;

	boolean isPrime(int number) {
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {

			if (number % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag) {
			System.out.println(number + " is a prime number.");
			for (count = 0; count < 5; count++) {
				break;
			}
		}
		return flag;

	}

	int printPrimeNumberWithInRange(int statIndex, int endIndex) {

		for (int i = statIndex; i <= endIndex; i++) {

			if (i == 1) {
				int sum = 0;
			} else {
				if (isPrime(i)) {
					sum = sum + i;
					count++;
					if (count == 5) {
						break;
					}
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		ReturnFirstFivePrimeNum returnFirstFivePrimeNum = new ReturnFirstFivePrimeNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the range you want check prime number");
		int statIndex = sc.nextInt();
		int endindex = sc.nextInt();
		returnFirstFivePrimeNum.printPrimeNumberWithInRange(statIndex, endindex);

	}
}
