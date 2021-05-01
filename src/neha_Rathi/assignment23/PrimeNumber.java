//Assignment23 Prime Number operation
package neha_Rathi.assignment23;

public class PrimeNumber {
	int count = 0;
	double sum = 0;
	double avg = 0;

	void primeNum(int start) {
		boolean isPrime = true;

		for (int index = 2; index <= start/2; index++) {
			if (start % index == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			sum = sum + start;
			count++;
			avg = sum / count;
			System.out.println(start + " Number Is Prime");
		}
	}

	void validatePrime(int start, int end) {
		for (int index = start; index < end; index++) {
			primeNum(index);
		}
		System.out.println("Total Count of prime number is " + count);
		System.out.println("Total sum of prime number is " + sum);
		System.out.println("Avg of prime number is " + avg);
	}

	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		//primeNumber.primeNum(2); this is for single number
		primeNumber.validatePrime(40, 100);
	}
}
