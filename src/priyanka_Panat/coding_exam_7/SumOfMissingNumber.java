/*
16th May'2021 : Test - 7 [30 mins]

1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
 */

package priyanka_Panat.coding_exam_7;

public class SumOfMissingNumber {
	int printSumOfMissingNum(int[] inputArr) {
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissingNum = false;
			for (int index = 0; index < inputArr.length; index++) {
				if (num == inputArr[index]) {
					isMissingNum = true;
					break;
				}
			}
			if (!isMissingNum) {
				sum = sum + num;
			}
		}
		return sum;
	}

	int printMaxFromMissingNum(int[] inputArr) {
		int maxNum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissingNum = false;
			for (int index = 0; index < inputArr.length; index++) {
				if (num == inputArr[index]) {
					isMissingNum = true;
					break;
				}
			}
			if (!isMissingNum) {
				if (num > maxNum) {
					maxNum = num;
				}
			}
		}
		return maxNum;
	}

	public static void main(String[] args) {
		SumOfMissingNumber sumOfMissingNumber = new SumOfMissingNumber();
		int[] input = { 1, 3, 4, 7, 9, 10 };
		int sumOfMissingNum = sumOfMissingNumber.printSumOfMissingNum(input);
		int highestMissingNum = sumOfMissingNumber.printMaxFromMissingNum(input);
		System.out.println("Sum of all missing numbers from given array is : " + sumOfMissingNum);
		System.out.println("Highest missing number from given array is : " + highestMissingNum);
	}
}


