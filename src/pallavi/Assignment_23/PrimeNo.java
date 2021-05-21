package pallavi.Assignment_23;

import java.util.Scanner;

/*Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output :*/

public class PrimeNo {
	static int count = 0, sum = 0;

	boolean isPrimeNo(int number) {
		boolean isFlag = false;
		for (int index = 2; index <= number / 2; index++) {
			if (number % index == 0) {
				isFlag = true;
				break;
			}
		}
		return isFlag;

	}

	void checkPrimeBtwRange(int firstRange, int lastRange) {
		for (int num = firstRange; num <= lastRange; num++) {
			boolean chkPrimeFlagBtwRange = isPrimeNo(num);
			if (chkPrimeFlagBtwRange) {
				System.out.println("Given number " + num + " is not prime");
			} else
				System.out.println("Given number " + num + " is prime number");

		}
	}

	int countOfPrimeNumber(int firstRange, int lastRange) {

		for (int num = firstRange; num <= lastRange; num++) {
			boolean chkPrimeFlagBtwRange = isPrimeNo(num);
			if (chkPrimeFlagBtwRange == false) {
				count++;

			}
		}
		return count;

	}

	int sumOfPrime(int firstRange, int lastRange) {
		for (int num = firstRange; num <= lastRange; num++) {
			boolean chkPrimeFlagBtwRange = isPrimeNo(num);
			if (chkPrimeFlagBtwRange == false) {
				sum = sum + num;
			}
		}
		return sum;
	}

	int averageOfprimeNo(int firstRange, int lastRange) {
		int count = countOfPrimeNumber(firstRange, lastRange);
		int sum = sumOfPrime(firstRange, lastRange);
		int average = sum / count;
		return average;

	}

	public static void main(String[] args) {
		PrimeNo primeNo = new PrimeNo();
		int num = 25;
		int firstTarget = 2, EndTarget = 100;
		boolean flagCheck = primeNo.isPrimeNo(15);
		if (flagCheck) {
			System.out.println("Given number " + num + " is not prime");
		} else {
			System.out.println("Given number " + num + " is prime number");

		}
		primeNo.checkPrimeBtwRange(20, 40);

		int countOfPrime = primeNo.countOfPrimeNumber(firstTarget, EndTarget);
		System.out.println("Total Count between " + firstTarget + " & " + EndTarget + ": " + countOfPrime);
		int totalSum = primeNo.sumOfPrime(firstTarget, EndTarget);
		System.out.println("Total Sum between " + firstTarget + " & " + EndTarget + ": " + sum);
		int average = primeNo.averageOfprimeNo(firstTarget, EndTarget);
		System.out.println("Average is between  " + firstTarget + " & " + EndTarget + " :" + average);

	}

}
