package renuka.assignment23;

import java.util.Scanner;

/*1) validate whether given number is prime or not.*/

public class PrimeNum {
	
	boolean verifyPrimeNum(int num) {
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
		PrimeNum primeNum = new PrimeNum();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number:");
		int num = scanner.nextInt();

		if (primeNum.verifyPrimeNum(num)) {
			System.out.println(num + " is a prime number");
		} else {
			System.out.println(num + " is not a prime number");
		}
		scanner.close();
	}

}
