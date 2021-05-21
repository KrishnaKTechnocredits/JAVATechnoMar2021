/*Assignment - 25 : 18th April'2021

Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 */

package aparna.primeNumberExample1;

public class PrintFirstFewPrimeNumberInGivenRange {

	int arrayCount = 0;

	int[] printFirstFewPrimeNumbers(int startRange, int endRange, int outputSize) {
		System.out.println("First " + outputSize + " Prime Numbers in Given range " + startRange + " and " + endRange
				+ " are as follows:");
		int[] firstFewPrimeNumArr = new int[outputSize];
		for (int index = startRange; index <= endRange; index++) {
			boolean flag = true;
			for (int number = 2; number <= index / 2; number++) {
				if (index % number == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				if (arrayCount >= outputSize) {
					break;
				}
				firstFewPrimeNumArr[arrayCount] = index;
				arrayCount++;

			}

		}

		return firstFewPrimeNumArr;
	}

	public static void main(String[] args) {
		PrintFirstFewPrimeNumberInGivenRange printFirstFewPrimeNumberInGivenRange = new PrintFirstFewPrimeNumberInGivenRange();
		int[] primeNumArr = printFirstFewPrimeNumberInGivenRange.printFirstFewPrimeNumbers(10, 50, 5);
		for (int index = 0; index < primeNumArr.length; index++) {
			System.out.println(primeNumArr[index]);
		}

	}

}
