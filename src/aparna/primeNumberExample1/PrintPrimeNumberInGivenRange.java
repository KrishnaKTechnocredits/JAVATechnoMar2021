/*Assignment 23
 * 2) print all the prime numbers given range.
 * input : 40 to 100
 */
package aparna.primeNumberExample1;

public class PrintPrimeNumberInGivenRange {

	void validateNumberIsPrimeInGivenrange(int startRange, int endRange) {
		System.out.println(
				"All prime Numbers in given range from " + startRange + " and " + endRange + " are as follows:");
		int count = 0;

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
				System.out.println(range);
			}
		}
	}

	public static void main(String[] args) {
		PrintPrimeNumberInGivenRange printPrimeNumberInGivenRange = new PrintPrimeNumberInGivenRange();
		printPrimeNumberInGivenRange.validateNumberIsPrimeInGivenrange(40, 100);
	}

}
