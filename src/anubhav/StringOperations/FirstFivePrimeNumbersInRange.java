package anubhav.StringOperations;

import java.util.Scanner;

/*Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
		Output : 11 13 17 19 23
 */

public class FirstFivePrimeNumbersInRange {

	int[] outputValue = new int[5];

	int[] range(int lowerRange, int upperRange) {

		int count = 0;
		boolean isPrime = true;
		for (int number = lowerRange; number <= upperRange; number++) {
			for (int divisor = 2; divisor < number / 2; divisor++) {
				if (number % divisor == 0) {
					isPrime = false;
					break;
				} else
					isPrime = true;
			}
			if (isPrime == true && count != 5) {
				outputValue[count] = number;
				count++;
			}
		}
		return outputValue;
	}

	public static void main(String[] args) {
		FirstFivePrimeNumbersInRange firstFivePrimeNumbersInRange = new FirstFivePrimeNumbersInRange();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Lower range : ");
		int lowerRange = scanner.nextInt();
		System.out.println("Enter Upper range : ");
		int upperRange = scanner.nextInt();
		firstFivePrimeNumbersInRange.range(lowerRange, upperRange);
		int[] op = firstFivePrimeNumbersInRange.outputValue;
		for (int l = 0; l < 5; l++) {
			System.out.print(op[l] + " ");
		}
		scanner.close();
	}
}
