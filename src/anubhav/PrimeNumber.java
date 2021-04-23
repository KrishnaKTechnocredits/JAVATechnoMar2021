package anubhav;

// Check if a number is prime 

public class PrimeNumber {

	void primeCheck(int targetNumber) {
		boolean isPrime = true;
		for (int num = 2; num < targetNumber / 2; num++) {
			if (targetNumber % num == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println("The entered number " + targetNumber + " is Prime");
		} else {
			System.out.println("The entered number " + targetNumber + " is Not Prime");
		}
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		System.out.println("----Output----");
		primeNumber.primeCheck(10);
		primeNumber.primeCheck(43);
		primeNumber.primeCheck(37);
		primeNumber.primeCheck(13);
	}
}