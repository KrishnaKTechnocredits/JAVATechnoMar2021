package krishna.Assignment_23;

import java.util.Scanner;

public class PrimeNumbers {
	boolean isPrimeNumber(int number) {
		boolean isPrimeFlag = true;
		for (int num = 2; num <= number / 2; num++) {
			if (number % num == 0) {
				isPrimeFlag = false;
				break;
			}
		}
		return isPrimeFlag;
	}

	void primeNumberRange() {
		boolean primeFlag;
		System.out.println("Prime numbers between given range 40 to 100 are : ");
		for (int index = 40; index <= 100; index++) {
			primeFlag = isPrimeNumber(index);
			if (primeFlag == true) {
				System.out.print(index+", ");
			}
		}
	}

	void primeCntSumAvg() {
		int count = 0, sum = 0, avg;
		boolean primeFlag;

		for (int index = 2; index <= 100; index++) {
			primeFlag = isPrimeNumber(index);
			if (primeFlag == true) {
				count++;
				sum = sum + index;
			}
		}
		avg = sum / count;
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("Count of Prime numbers between 2 to 100 is : " + count);
		System.out.println("Sum of Prime numbers between 2 to 100 is : " + sum);
		System.out.println("Average of Prime numbers between 2 to 100 is : " + avg);
	}

	public static void main(String[] args) {
		PrimeNumbers primenumbers = new PrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to find prime :");
		int number = scanner.nextInt();
		boolean primeFlag = primenumbers.isPrimeNumber(number);
		if (primeFlag == true) {
			System.out.println("Given number " + number + " is prime");
			System.out.println("---------------------------------");
		} else {
			System.out.println("Given number " + number + " is not prime");
			System.out.println("---------------------------------");
		}

		primenumbers.primeNumberRange();
		
		primenumbers.primeCntSumAvg();

	}

}
