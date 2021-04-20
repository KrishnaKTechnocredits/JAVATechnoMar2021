package sai.Assignment23;

/*
 * 1) validate whether given number is prime or not.
 */

public class PrimeNum {

	public static void main(String[] args) {
		PrimeNum primeNum = new PrimeNum();
		primeNum.prime(11);
		primeNum.prime(9);
		primeNum.prime(4);

	}

	void prime(int number) {
		int count = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				count = 1;
				break;
			}
		}
		if (count == 1)
			System.out.println(number + " is not prime");
		else
			System.out.println(number + " is prime");
	}
}
