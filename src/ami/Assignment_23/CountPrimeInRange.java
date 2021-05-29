/*
 3) count all the prime numbers given range.
   input : 2 to 100
   output : 

 */

package ami.Assignment_23;

public class CountPrimeInRange {
	int count = 0;

	boolean isNumPrime(int targetNum) {
		boolean isPrime = true;
		for (int num = 2; num <= targetNum / 2; num++) {
			if (targetNum % num == 0) {
				isPrime = false;
				break;
			}

		}
		return isPrime;
	}

	void numInRange(int firstIndex, int lastIndex) {
		for (int index = firstIndex; index <= lastIndex; index++) {
			if (isNumPrime(index)) {
				count++;
			}
		}
		System.out.println("prime number count :" + count);
	}

	public static void main(String[] a) {
		CountPrimeInRange cp = new CountPrimeInRange();
		cp.numInRange(2, 100);
	}
}
