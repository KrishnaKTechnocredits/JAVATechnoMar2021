/*
 4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 

 */

package ami.Assignment_23;

public class sumOfAllPrimeNum {
	int count = 0;
	int sum = 0;

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
				sum = sum + index;
			}
		}

		System.out.println("total sum of all prime number " + firstIndex + " to " + lastIndex + " : " + sum);
	}

	public static void main(String[] a) {
		sumOfAllPrimeNum rp = new sumOfAllPrimeNum();
		rp.numInRange(2, 100);
	}

}
