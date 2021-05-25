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
package paras.Coding_exam_7;

public class FindMissingNumber {

	int sumOfMissingNumber(int[] arr) {
		int sum = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissingNumber = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index])
					isMissingNumber = true;
			}
			if (isMissingNumber == false)
				sum = sum + num;
		}
		return sum;
	}

	int maxMissingNumber(int[] arr) {
		int maxNumber = 0;
		for (int num = 1; num <= 10; num++) {
			boolean isMissingNumber = false;
			for (int index = 0; index < arr.length; index++) {
				if (num == arr[index])
					isMissingNumber = true;
			}
			if (isMissingNumber == false)
				if (maxNumber < num) {
					maxNumber = num;
				}
		}
		return maxNumber;
	}

	public static void main(String[] args) {
		FindMissingNumber findMissingNumber = new FindMissingNumber();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		int sum = findMissingNumber.sumOfMissingNumber(arr);
		System.out.println("Sum of all missing numbers from given array is: " + sum);
		int maxNumber = findMissingNumber.maxMissingNumber(arr);
		System.out.println("Highest missing number from given array: " + maxNumber);
	}
}
