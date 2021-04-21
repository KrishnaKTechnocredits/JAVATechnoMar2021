package sai.Assignment23;

/*
 * 2) print all the prime numbers given range.
   input : 40 to 100
   output : 

 */

public class PrintPrime {

	public static void main(String[] args) {
		PrintPrime printPrime = new PrintPrime();
		printPrime.primeRange(40, 100);

	}

	void prime(int number) {
		int count = 0;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				count = 1;
				break;
			}
		}

		if (count != 1) {
			System.out.println(number + " is prime");
		}

	}

	void primeRange(int startNum, int endNum) {
		for (; startNum <= endNum; startNum++) {
			prime(startNum);
		}

	}

}
