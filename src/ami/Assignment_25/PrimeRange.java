/*
 Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23

 */

package ami.Assignment_25;

public class PrimeRange {

	int[] getFirstFivePrime(int start, int end) {
		int outputIndex = 0;
		int[] output = new int[5];
		for (int index = start; index <= end; index++) {
			boolean flag = true;
			for (int num = 2; num <= index / 2; num++) {
				if (index % num == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				// System.out.println("Prime numbers in given range are : " + index);
				output[outputIndex] = index;
				outputIndex++;
			}
			if (outputIndex == 5)
				break;
		}
		return output;

	}

	public static void main(String[] args) {
		PrimeRange primeRange = new PrimeRange();
		int[] numbers = primeRange.getFirstFivePrime(2, 20);
		// System.out.println(numbers);
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] != 0)
				System.out.println(numbers[index]);
		}
	}
}