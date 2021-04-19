package mayur.assignment23;

import java.util.Scanner;

public class PrimeNumbers {
	void isNumberPrime(int targetNumber) {
		int num = 2;
		for (num = 2; num < targetNumber; num++) {
			if (targetNumber % num == 0) {
				break;
			}
		}
		if ((targetNumber) == num)
			System.out.println(targetNumber + " is prime");
		else
			System.out.println(targetNumber + " is not prime");

	}

	public static void main(String[] args) {
		PrimeNumbers prime = new PrimeNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = scanner.nextInt();
		prime.isNumberPrime(num);
		System.out.println("Enter the Number:");
		int num1 = scanner.nextInt();
		prime.isNumberPrime(num1);
		scanner.close();
	}
}
