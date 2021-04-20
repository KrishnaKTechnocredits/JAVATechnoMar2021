package priyanka_Panat.assignment23;

import java.util.Scanner;

public class PrimeNumSumAvg {

	int count = 0;
	int sum = 0;

	void findPrimeNo(int startRange, int endRange) {
		for (int index = startRange; index <= endRange; index++) {
			boolean isPrimeNumber = true;
			for (int innerIndex = 2; innerIndex < index; innerIndex++) {
				if (index % innerIndex == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber && index >= 2) {
				System.out.println(index + " ");
				count++;
				sum += index;

			}

		}
		System.out.println("-----------------------------------------------------------");
		System.out.println("Total num of prime numbers between " + startRange + " and " + endRange + " is :" + count);
		System.out.println("-----------------------------------------------------------");
		System.out.println("Sum of all prime numbers between " + startRange + " and " + endRange + " is :" + sum);
		System.out.println("-----------------------------------------------------------");
		System.out.println("Average of prime numbers : " + (sum / count));

	}

	public static void main(String[] args) {
		PrimeNumSumAvg primeNumSumAvg = new PrimeNumSumAvg();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the start number ");
		int num1 = scanner.nextInt();
		System.out.println("Enter the end number ");
		int num2 = scanner.nextInt();
		System.out.println("Prime numbers between " + num1 + " and " + num2 + " are : ");
		primeNumSumAvg.findPrimeNo(num1, num2);
		scanner.close();

	}
}
