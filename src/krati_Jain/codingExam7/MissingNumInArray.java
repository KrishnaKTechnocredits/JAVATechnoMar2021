/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21*/

package krati_Jain.codingExam7;

public class MissingNumInArray {
	public static void main(String[] args) {
		MissingNumInArray missingNumInArray = new MissingNumInArray();
		int[] inputArr = { 1, 3, 4, 7, 9, 10 };
		System.out.println("Sum of all missing numbers in the array is :" + missingNumInArray.getMissingNum(inputArr));
	}

	int getMissingNum(int[] inputArr) {
		int sum = 0;
		int numCompare = inputArr[0];
		for (int index = 1; index <= 10; index++) { // 5
			boolean numFlag = false;
			for (int innerIndex = 0; innerIndex < inputArr.length; innerIndex++) {
				if (index == inputArr[innerIndex]) { // 0123456
					numFlag = true;
					break;
				}
			}
			if (!numFlag)
				sum += index; // 2
		}
		return sum;
	}

}
