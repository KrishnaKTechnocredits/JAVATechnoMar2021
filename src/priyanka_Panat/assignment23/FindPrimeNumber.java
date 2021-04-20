package priyanka_Panat.assignment23;

import java.util.Scanner;

public class FindPrimeNumber {

	void findPrime(int startRange, int endRange) {
		for (int index = startRange; index <= endRange; index++) {
			boolean isPrimeNumber = true;

			for (int innerIndex = 2; innerIndex < index; innerIndex++) {
				if (index % innerIndex == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				System.out.println(index + " ");
			}

		}

	}

	public static void main(String[] args) {
		FindPrimeNumber findPrimeNumber = new FindPrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the end number ");
		int num2 = scanner.nextInt();
		System.out.println("Prime numbers between " + num1 + " and " + num2 + " are : ");
		findPrimeNumber.findPrime(num1, num2);
		scanner.close();

	}
}
