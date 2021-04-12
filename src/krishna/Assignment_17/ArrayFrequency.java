package krishna.Assignment_17;

import java.util.Scanner;

/*
Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq. of 23 is 5

 */

public class ArrayFrequency {
	int freqCount;

	void countFreq(int[] number, int targetNumber) {

		for (int index = 0; index < number.length; index++) {
			if (targetNumber == number[index]) {
				freqCount++;
			}

		}
		System.out.println("Frequency of target number is  :"+freqCount);
	}

	public static void main(String[] args) {
		ArrayFrequency arrayFrequency = new ArrayFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many numbers you want to give :");
		int count = scanner.nextInt();
		int[] number = new int[count];

		System.out.println("Enter the target number :");
		int targetNum = scanner.nextInt();

		for (int index = 0; index < count; index++) {
			System.out.println("Enter the number :");
			number[index] = scanner.nextInt();
		}
		arrayFrequency.countFreq(number, targetNum);
	}

}
