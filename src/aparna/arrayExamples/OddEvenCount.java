/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
 */

package aparna.arrayExamples;

import java.util.Scanner;

public class OddEvenCount {

	void totalCountOfEvenNOdd(int[] inputNumber) {
		int evenCount = 0;
		for (int index = 0; index < inputNumber.length; index++) {
			if (inputNumber[index] % 2 == 0) {
				evenCount++;
			}
		}
		System.out.println("total Count of Even Numbers are: " + evenCount);
		System.out.println("total Count of Odd Numbers are: " + ((inputNumber.length) - evenCount));
	}

	public static void main(String[] args) {

		OddEvenCount oddEvenCount = new OddEvenCount();
		// int[] inputNumber1 = { 10,23,26,27,88,87,65 };
		// evenOddCount.totalCountOfEvenNOdd(inputNumber1);
		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:- ");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index <= inputNumber.length - 1; index++) {
			System.out.println("Enter Numbers " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		oddEvenCount.totalCountOfEvenNOdd(inputNumber);
		scanner.close();

	}

}
