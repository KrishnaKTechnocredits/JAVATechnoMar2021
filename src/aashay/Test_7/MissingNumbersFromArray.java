package aashay.Test_7;
/*
 * 16th May'2021 : Test - 7 [30 mins]
1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21
2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
 */

import java.util.Arrays;

public class MissingNumbersFromArray {

	private int minRange(int[] input) {
		int minRange = input[0];
		for (int index = 1; index < input.length; index++) {
			if (minRange > input[index])
				minRange = input[index];
		}
		return minRange;
	}

	private int maxRange(int[] input) {
		int maxRange = input[0];
		for (int index = 1; index < input.length; index++) {
			if (maxRange < input[index])
				maxRange = input[index];
		}
		return maxRange;
	}

	public int sumOfMissingNum(int[] input) {
		int sumOfMissingNum = 0;
 		int minRange = minRange(input);
		int maxRange = maxRange(input);

		for (int number = minRange; number <= maxRange; number++) {
			boolean isNumberPresent = false;
			for (int index = 0; index < input.length; index++) {
				if (number == input[index]) {
					isNumberPresent = true;
				}
			}
			if (isNumberPresent == false) {
				sumOfMissingNum += number;
			}
		}
		return sumOfMissingNum;

	}

	public int highestMissingNumber(int[] input) {
		int maxMissingNum = 0;
		int minMissingNum = 0;
		int minRange = minRange(input);
		int maxRange = maxRange(input);

		for (int number = minRange; number <= maxRange; number++) {
			boolean isNumberPresent = false;
			for (int index = 0; index < input.length; index++) {
				if (number == input[index]) {
					isNumberPresent = true;
				}
			}
			if (isNumberPresent == false) {
				minMissingNum = number;
				if (maxMissingNum < minMissingNum) {
					maxMissingNum = minMissingNum;
				}
			}
		}
		return maxMissingNum;
	}

	public static void main(String[] args) {
		MissingNumbersFromArray missingNumbersFromArray = new MissingNumbersFromArray();
		int[] input = new int[] { 1, 3, 4, 7, 9, 10 };

		int sumOfMissingNum = missingNumbersFromArray.sumOfMissingNum(input);
		System.out.println("Sum of missing number is:" + sumOfMissingNum);

		int maxMissingNum = missingNumbersFromArray.highestMissingNumber(input);
		System.out.println("Highest number missing from Array is:" + maxMissingNum);
	}

}
