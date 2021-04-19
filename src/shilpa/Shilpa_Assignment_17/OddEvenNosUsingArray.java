/*Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
*/

package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class OddEvenNosUsingArray {
	int evencnt;
	int oddcnt;

	void getCntOfOddEvenNos(int[] numbers) {

		for (int index = 0; index < numbers.length; index++) {

			if (numbers[index] % 2 == 0)
				evencnt++;
			else
				oddcnt++;
		}
		System.out.println("Even Numbers:-" + evencnt);
		System.out.println("Odd Numbers:-" + oddcnt);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] input1 = new int[5];
		OddEvenNosUsingArray oddEvenNosUsingArray = new OddEvenNosUsingArray();
		System.out.println("Enter Numbers");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextInt();
		}
		oddEvenNosUsingArray.getCntOfOddEvenNos(input1);
		scanner.close();

	}
}
