package krishna.Assignment_17;

import java.util.Scanner;

/*
 Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output: negative -> 3
 positive -> 4
 */

public class PositiveNegative {
	int positiveCount;
	int negativeCount;
	void posNegNum(int[] number) {

		for (int index = 0; index < number.length; index++) {
			if (number[index] >= 0) {
				positiveCount++;
			} else {
				negativeCount = number.length - positiveCount;
			}
		}
		System.out.println("Count of positive number is:" + positiveCount);
		System.out.println("Count of negative number is:" + negativeCount);
	}

	public static void main(String[] args) {
		PositiveNegative positiveNegative = new PositiveNegative();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to give :");
		int count = scanner.nextInt();
		int[] number = new int[count];
		for (int index = 0; index < count; index++) {
			System.out.println("Enter the number :");
			number[index] = scanner.nextInt();
		}
		positiveNegative.posNegNum(number);

	}

}
