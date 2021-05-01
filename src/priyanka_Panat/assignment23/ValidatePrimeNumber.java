package priyanka_Panat.assignment23;

import java.util.Scanner;

public class ValidatePrimeNumber {

	void validatePrimeNo(int targetNum) {
		boolean isPrimeNumber = true;
		for (int index = 2; index <= (targetNum / 2) + 1; index++) {
			if (targetNum % index == 0) {
				isPrimeNumber = false;
				break;
			}
		}

		if (isPrimeNumber && targetNum >= 2) {
			System.out.println("Given num " + targetNum + " is Prime ");
		} else {
			System.out.println("Given num " + targetNum + " is not Prime ");
		}
	}

	public static void main(String[] args) {
		ValidatePrimeNumber validatePrimeNumber = new ValidatePrimeNumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to validate whether it is prime or not ");
		int num1 = scanner.nextInt();
		validatePrimeNumber.validatePrimeNo(num1);
		scanner.close();
	}
}
