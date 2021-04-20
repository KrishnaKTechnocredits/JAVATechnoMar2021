package dhanshri.Assignment_23;

public class PrimeNumSumCountAvg {

	int count=0;
	int sum;

	void singleNumPrime(int target) {
		boolean isPrime = true;
		for (int num = 2; num <= target / 2; num++) {
			if (target % num == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true) {
			System.out.println(target + " is prime number");
		} else
			System.out.println(target + " is not prime number");

	}

	void primeNumRange(int start, int end) {
		for (int index = start; index <= end; index++) {
			singleNumPrime(index);
		}
	}

	void countPrimeNum(int start, int end) {
		for (int index = start; index <= end; index++) {
			boolean primeN = true;
			for (int num = 2; num <= index / 2; num++) {
				if (index % num == 0) {
					primeN = false;
					break;
				}
			}
			if (primeN == true) {
				count++;
				sum = sum + index;
			}

		}
		System.out.println("Count of  all prime number  form given range is " + count);		
		System.out.println("Sum of all prime numbers between 2 to 100 is " + sum);
		System.out.println("Average of all the prime numbers between 2 to 100 is  " + sum / count);
	}

	public static void main(String[] args) {
		PrimeNumSumCountAvg primeNumSumCountAvg = new PrimeNumSumCountAvg();
		primeNumSumCountAvg.singleNumPrime(20);
		primeNumSumCountAvg.primeNumRange(40, 100);
		primeNumSumCountAvg.countPrimeNum(2, 100);
	}
}
