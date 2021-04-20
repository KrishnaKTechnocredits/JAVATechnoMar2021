/*
 Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
  */

package upasana.assignment_25;

public class PrimeFirstFiveRange {
	int count = 0;

	int[] prime(int sIndex, int eIndex) {

		int[] output = new int[5];
		for (int target = sIndex; target <= eIndex; target++) {
			boolean flag = true;
			for (int num = 2; num <= target / 2; num++) {
				if (target % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
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
		int[] output = new PrimeFirstFiveRange().prime(10, 50);
		System.out.println("First 5 prime numbers from given range 10 to 50 are ");
		for (int index = 0; index < output.length; index++)
			System.out.println(output[index]);
	}
}
