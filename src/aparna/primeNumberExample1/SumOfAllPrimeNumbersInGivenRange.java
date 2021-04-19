/*Assignment 23
 * 4) sum of all the prime numbers given range.
   input : 2 to 10
   output : 17
 */
package aparna.primeNumberExample1;

public class SumOfAllPrimeNumbersInGivenRange {

	int primeNumberSumInGivenrange(int startRange, int endRange) {
		System.out.println("All prime Numbers Sum is in given range from " + startRange + " and " + endRange + " are:");
		int count = 0;
		// int totalCount = 0;
		int sumAllPrime = 0;
		for (int range = startRange; range <= endRange; range++) {
			for (int number = 2; number <= range / 2; number++) {
				if (range % number == 0) {
					count = 1;
					break;
				} else {
					count = 0;
				}
			}
			if (count == 0) {
				sumAllPrime = sumAllPrime + range;
			}
		}
		return sumAllPrime;
	}

	public static void main(String[] args) {
		SumOfAllPrimeNumbersInGivenRange sumOfAllPrimeNumbersInGivenRange = new SumOfAllPrimeNumbersInGivenRange();
		int sumAllPrime = sumOfAllPrimeNumbersInGivenRange.primeNumberSumInGivenrange(2, 10);
		System.out.println(sumAllPrime);
	}

}
