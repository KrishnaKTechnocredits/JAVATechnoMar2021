/*16th May'2021 : Test - 7 [30 mins]

1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/

package sandesh.coding_exam_7;

import java.util.*;

public class ArrayMissingManipulations {

	private int returnHighestMissingNumber(int[] inputArray, int startPoint, int endPoint) {
		int count = 0;
		int[] missingNumArray = new int[((endPoint - startPoint) + 1) - inputArray.length];
		for (int index = startPoint; index <= endPoint; index++) {
			boolean isMissing = true;
			for (int num = 0; num < inputArray.length; num++) {
				if (index == inputArray[num]) {
					isMissing = false;
					break;
				}
			}
			if (isMissing == true) {
				missingNumArray[count] = index;
				count++;
			}
		}
		Arrays.sort(missingNumArray);
		return missingNumArray[missingNumArray.length - 1];
	}

	private int returnsSumMissingNumber(int[] inputArray, int startPoint, int endPoint) {
		int sum = 0;
		for (int index = startPoint; index <= endPoint; index++) {
			boolean isMissing = true;
			for (int num = 0; num < inputArray.length; num++) {
				if (index == inputArray[num]) {
					isMissing = false;
					break;
				}
			}
			if (isMissing == true) {
				sum += index;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 4, 7, 9, 10 };
		int startPoint = 1;
		int endPoint = 10;
		int highestMissingNumArray = new ArrayMissingManipulations().returnHighestMissingNumber(input, startPoint,
				endPoint);
		int sumMissingNumbers = new ArrayMissingManipulations().returnsSumMissingNumber(input, startPoint, endPoint);
		System.out.println("The highest missing number from given array is - " + highestMissingNumArray);
		System.out.println("Sum of missing numbers from given array is - " + sumMissingNumbers);

	}
}