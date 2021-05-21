/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/

package krati_Jain.codingExam8;

public class UniqueElementsFromArray {
	public static void main(String[] args) {
		int[] inputArr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] outArr = new int[inputArr.length];
		UniqueElementsFromArray uniqueElementsFromArray = new UniqueElementsFromArray();
		outArr = uniqueElementsFromArray.getUniqueArr(inputArr);
		System.out.println("Unique Elements from the provided Array are as follows - ");
		for (int index = 0; index < outArr.length; index++) {
			if (outArr[index] != 0)
				System.out.println(outArr[index]);
		}
	}

	int[] getUniqueArr(int[] inputArr) {
		int count = 0;
		int tempCount = 1;
		boolean isNumPresent = false;
		int[] tempNum = new int[inputArr.length];
		tempNum[0] = inputArr[0];
		for (int index = 1; index < inputArr.length; index++) { // { 10, 2, 3, 10, 3, 55, 61, 2 };
			for (int innerIndex = 0; innerIndex < tempNum.length; innerIndex++) {
				isNumPresent = false;
				if (inputArr[index] == tempNum[innerIndex]) {
					isNumPresent = true;
					break;
				}
			}
			if (!isNumPresent) {
				tempNum[tempCount] = inputArr[index];
				// System.out.println(tempCount + ": " + tempNum[tempCount]);
				tempCount++;
			}
		}
		return tempNum;
	}
}
