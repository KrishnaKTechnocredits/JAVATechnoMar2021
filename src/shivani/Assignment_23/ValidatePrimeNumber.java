package shivani.Assignment_23;

import java.util.Scanner;

/*1) validate whether given number is prime or not.
print all the prime numbers given range.
2) print all the prime numbers given range.
input : 40 to 100
output : 
3) count all the prime numbers given range.
input : 2 to 100
output : 25
4) sum of all the prime numbers given range.
input : 2 to 100
output : 
5) Average of all the prime numbers given range.
input : 2 to 100
output :*/
public class ValidatePrimeNumber {
	int sum = 0;
	int count = 0;
	int avg = 0;

	boolean validteNumber(int number) {
		boolean flag = false;
		for (int i = 2; i <= number / 2; ++i) {

			if (number % i == 0) {
				flag = true;
				break;
			}
		}

		if (!flag)
			System.out.println(number + " is a prime number.");
		else
			System.out.println(number + " is not a prime number.");
		return flag;
	}

	void printPrimeNumberWithInRange(int statIndex, int endIndex) {

		for (int i = statIndex; i <= endIndex; i++) {

			if (i == 1) {
				int sum = 0;
			} else {
				if (validteNumber(i)) {
					sum = sum + i;
					count++;
				}
			}
		}
		avg = sum / count;
		System.out.println(
				"Average all prime numbers in a given range '" + statIndex + " to " + endIndex + "' is " + avg);

	}

	public static void main(String[] args) {
		ValidatePrimeNumber validatePrimeNumber = new ValidatePrimeNumber();
		System.out.println("Please enter a number to check  itwether prime or not");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		validatePrimeNumber.validteNumber(num);
		System.out.println("please enter the range you want check prime number");
		int statIndex = sc.nextInt();
		int endindex = sc.nextInt();
		validatePrimeNumber.printPrimeNumberWithInRange(statIndex, endindex);

	}

}
