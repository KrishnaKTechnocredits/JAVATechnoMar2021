/*Assignment 23
 * 3.) count all the prime numbers in given range.
   input : 2 to 100
   output : 25
 */
package aparna.primeNumberExample1;

public class CountAllPrimeInGivenRange {

	int primeNumberCountInGivenRange(int startRange, int endRange) {
		System.out.println(
				"All prime Numbers Total Count in given range from " + startRange + " and " + endRange + " are:");
		int count = 0;
		int totalCount = 0;
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
			}
		}
		return totalCount;
	}

	public static void main(String[] args) {
		CountAllPrimeInGivenRange countAllPrimeInGivenRange = new CountAllPrimeInGivenRange();
		int totalCount = countAllPrimeInGivenRange.primeNumberCountInGivenRange(2, 100);
		System.out.println(totalCount);
	}

}
