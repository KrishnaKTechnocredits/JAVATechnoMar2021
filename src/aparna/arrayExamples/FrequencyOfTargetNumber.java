/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 5
 */
package aparna.arrayExamples;

import java.util.Scanner;

public class FrequencyOfTargetNumber {

	int numberFrequency(int[] inputNumber, int targetNumber) {
		int targetNumberCount = 0;
		for (int index = 0; index < inputNumber.length; index++) {
			if (inputNumber[index] == targetNumber) {
				targetNumberCount++;
			}
		}
		return targetNumberCount;
	}

	public static void main(String[] args) {
		FrequencyOfTargetNumber frequencyOfTargetNumber = new FrequencyOfTargetNumber();
		// int[] inputNumber1 = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		// int targetNumber1 = 23;
		// int targetNumCount1 = frequencyOfTargetNumber.numberFrequency(inputNumber1,
		// targetNumber1);
		// System.out
		// .println("Target Number is: " + targetNumber1 + " \nFrequency of Target
		// Number is : " + targetNumCount1);

		Scanner scanner = new Scanner(System.in);
		System.out.println("How Many Numbers You want to Enter:- ");
		int size = scanner.nextInt();
		int[] inputNumber = new int[size];

		for (int index = 0; index < inputNumber.length; index++) {
			System.out.println("Enter Numbers " + (index + 1));
			inputNumber[index] = scanner.nextInt();
		}
		System.out.println("Enter Target Number:- ");
		int targetNumber = scanner.nextInt();
		int targetNumCount = frequencyOfTargetNumber.numberFrequency(inputNumber, targetNumber);
		System.out
				.println("Target Number is: " + targetNumber + " \nFrequency of Target Number is : " + targetNumCount);

		scanner.close();

	}

}
