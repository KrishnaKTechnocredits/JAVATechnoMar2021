package komal.Assignment_23;
/*3) count all the prime numbers given range.
   input : 2 to 100
   output : */

public class CountPrimeNumber {

	int cntPrimeNum(int startRange, int endRange) {
		int cntPrime = 0;
		for (int index = startRange; index < endRange; index++) {
			if (validatePrimeNum(index)) {
				cntPrime++;
			}
		}
		return cntPrime;
	}

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
		CountPrimeNumber countPrimeNumber = new CountPrimeNumber();
		int intCnt = countPrimeNumber.cntPrimeNum(2, 100);
		System.out.println("Total " + intCnt + " prime numbers between 2 and 100.");
	}

}
