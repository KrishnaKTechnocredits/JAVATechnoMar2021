package komal.Assignment_23;

import java.util.Scanner;

/*Write a program with different method to satisfy following requirement. 
 1) validate whether given number is prime or not.*/

public class ValidatePrimeNumber {

	boolean validatePrimeNum(int num) {
		boolean isPrime = true;
		if (num == 0 || num == 1) {
			isPrime = false;
		} else {
			for (int index = 2; index < num; index++) {
				if ((num - (num / index) * index) == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		ValidatePrimeNumber PrimeNumber = new ValidatePrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number:");
		int num = scanner.nextInt();

		if (PrimeNumber.validatePrimeNum(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		scanner.close();
	}
}
