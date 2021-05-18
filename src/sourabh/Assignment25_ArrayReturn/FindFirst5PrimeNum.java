/*Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 */

package sourabh.Assignment25_ArrayReturn;

public class FindFirst5PrimeNum {
	int[] getFirst5PrimeNumFrmRange(int startRange, int endRange) {
		int[] outputPrime = new int[5];
		int primeIndex = 0;
		for (int index = startRange; index <= endRange; index++) {
			boolean isPrimeFlag = true;
			for (int index1 = 2; index1 <= index / 2; index1++) {
				if (index % index1 == 0) {
					isPrimeFlag = false;
					break;
				}
			}
			if (isPrimeFlag) {
				if (primeIndex < 5)
					outputPrime[primeIndex] = index;
				primeIndex++;
			}
		}
		return outputPrime;

	}

	public static void main(String[] args) {
		FindFirst5PrimeNum findFirst5PrimeNum = new FindFirst5PrimeNum();
		int[] outputPrime = findFirst5PrimeNum.getFirst5PrimeNumFrmRange(10, 50);
		for (int index = 0; index < outputPrime.length; index++) {
			if (outputPrime[index] != 0)
				System.out.println(outputPrime[index]);
		}
	}
}
