package renuka.assignment23;

/*4) sum of all the prime numbers given range.
   input : 2 to 100
   output : */

public class SumOfPrimeNum {
	
	int sumOfPrimeNum(int startRange, int endRange) {
		int sumPrime = 0;
		for (int index = startRange; index < endRange; index++) {
			if (verifyPrimeNum(index)) {
				sumPrime += index;
			}
		}
		return sumPrime;
	}

	boolean verifyPrimeNum(int num) {
		boolean isPrime = true;
		if (num == 0 || num == 1) {
			isPrime = false;
		} else {
			for (int index = 2; index < num; index++) {
				if (num % index == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		SumOfPrimeNum smPrime = new SumOfPrimeNum();
		System.out.println("Sum of prime numbers between 2 and 100 is:" + smPrime.sumOfPrimeNum(2, 100));
	}



}
