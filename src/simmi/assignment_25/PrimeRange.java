/*Assignment - 25 : 18th April'2021

Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
*/
package simmi.assignment_25;

public class PrimeRange {

	int[] rangePrime(int startIndex, int endIndex) {
		int count = 0;
		int[] output = new int[5];
		for (int target = startIndex; target <= endIndex; target++) {
			boolean isPrime = true;
			for (int innerIndex = 2; innerIndex <= target / 2; innerIndex++) {
				if (target % innerIndex == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				if (count >= 5) {
					break;
				}
				output[count] = target;
				count++;
			}
		}
		return output;

	}

	public static void main(String[] args) {
		int[] arr = new PrimeRange().rangePrime(10, 50);
		System.out.println("First five prime numbers between 10 to 50 are ");
		for (int num = 0; num < arr.length; num++) {
			System.out.println(arr[num]);
		}
	}

}
