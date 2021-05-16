package madhavi_Raut.CodingExam.Exam_07;

import java.util.Arrays;
/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21

2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8*/

public class FindMissingNumbers {

	int findSumOfMissingNumbers(int[] arr) {
		int[] originalArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int arrSum = 0;
		int originalArrSum = ((originalArr[(originalArr.length) - 1]) * (originalArr[originalArr.length - 1] + 1)) / 2;
		for (int index = 0; index < arr.length; index++) {
			arrSum += arr[index];
		}
		return originalArrSum - arrSum;
	}

	int findMaxMissingNumber(int[] arr) {
		int[] originalArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int maxVar = originalArr[0];
		int[] missingArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		Arrays.sort(missingArr);
		for (int index = missingArr.length - 1; index > 0; index--) {
			boolean flag = false;
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if (missingArr[index] == arr[innerIndex]) {
					flag = true;
					break;
				}
			}
			if (flag == false) {
				maxVar = missingArr[index];
				break;
			}
		}
		return maxVar;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		FindMissingNumbers findMissingNumbers = new FindMissingNumbers();
		System.out.println("Below is the sum of missing numbers:");
		System.out.println(findMissingNumbers.findSumOfMissingNumbers(arr));
		System.out.println("Below is the max missing number:");
		System.out.println(findMissingNumbers.findMaxMissingNumber(arr));
	}
}
