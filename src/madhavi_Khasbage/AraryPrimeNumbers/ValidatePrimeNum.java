package madhavi_Khasbage.AraryPrimeNumbers;

import java.util.Scanner;

/*1) validate whether given number is prime or not.*/

public class ValidatePrimeNum {

	boolean validatePrimeNum(int num) {
		boolean isPrime = true;
		if (num == 0 || num == 1) {
			isPrime = false;
		} else {
			for (int index = 2; index < num; index++) {
				if ((num-(num/index)*index) == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		ValidatePrimeNum valNum = new ValidatePrimeNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number:");
		int num = scanner.nextInt();

		if (valNum.validatePrimeNum(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		scanner.close();
	}
}
