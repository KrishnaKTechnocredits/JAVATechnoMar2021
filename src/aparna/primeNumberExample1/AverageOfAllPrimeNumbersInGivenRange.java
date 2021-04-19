/*Assignment 23
 * 5) Average of all the prime numbers given range.
   input : 2 to 10
   output : 4
 */
package aparna.primeNumberExample1;

public class AverageOfAllPrimeNumbersInGivenRange {

	double primeNumberAverageInGivenrange(int startRange, int endRange) {
		System.out.println(
				"All prime Numbers Average is in given range from " + startRange + " and " + endRange + " are:");
		int count = 0;
		int totalCount = 0;
		int sumAllPrime = 0;
		double averageOfAllPrime = 0;
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
				totalCount++;
				sumAllPrime = sumAllPrime + range;
				averageOfAllPrime = (sumAllPrime / totalCount);
			}
		}
		return averageOfAllPrime;
	}

	public static void main(String[] args) {
		AverageOfAllPrimeNumbersInGivenRange averageOfAllPrimeNumbersInGivenRange = new AverageOfAllPrimeNumbersInGivenRange();
		double averageOfAllPrime = averageOfAllPrimeNumbersInGivenRange.primeNumberAverageInGivenrange(2, 10);
		System.out.println(averageOfAllPrime);
	}

}
