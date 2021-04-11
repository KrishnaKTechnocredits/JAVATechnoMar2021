/*Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
 */

package aparna.arrayExamples;

import java.util.Scanner;

public class MaxNumberFromArray {

	int maxNumberFound(int[] inputNumber) {
		int maxNumber = inputNumber[0];
		for (int index = 1; index < inputNumber.length; index++) {
			if (maxNumber < inputNumber[index])
				maxNumber = inputNumber[index];
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		MaxNumberFromArray maxNumberFromArray = new MaxNumberFromArray();
		// int[] inputNumber1 = { 22, 35, 65, 88, 11, 23, 45, 100 };
		// int maxNumber = maxNumberFromArray.maxNumberFound(inputNumber1);
		// System.out.println("Max Number in the Given Array is: " + maxNumber);

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:-");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index < inputNumber.length; index++) {
			System.out.println("Enter Number " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		int maxNumber = maxNumberFromArray.maxNumberFound(inputNumber);
		System.out.println("Max Number in the Given Array is: " + maxNumber);
		scanner.close();
	}

}
