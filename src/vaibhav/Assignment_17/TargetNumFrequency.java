/*Java Assignment 17: 10th April 2021

Program 4: From given numbers, return the frequency of target number.
		
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 5*/

package vaibhav.Assignment_17;

import java.util.Scanner;

public class TargetNumFrequency {

	int freqCount;
	int tNum;

	void toGetFreqOfTargetNum(int[] Arr) {

		for (int index = 0; index < Arr.length; index++) {
			if (tNum == Arr[index]) {
				freqCount++;
			}
		}
		System.out.println("Frequency of " + tNum + " in a given set of Number is " + freqCount);
	}

	public static void main(String[] args) {

		int[] numArr = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };

		TargetNumFrequency targetNumFrequency = new TargetNumFrequency();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the targeted number to check its frequency in given set of numbers : ");

		targetNumFrequency.tNum = scanner.nextInt();
		scanner.close();

		targetNumFrequency.toGetFreqOfTargetNum(numArr);
		
	}
}
