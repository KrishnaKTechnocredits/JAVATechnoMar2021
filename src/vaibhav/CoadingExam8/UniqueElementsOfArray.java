/*Coding Exam - 8 : 17th May'2021

Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Output : {10,2,3,55,61}

Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.

*/

package vaibhav.CoadingExam8;

import java.util.Arrays;

public class UniqueElementsOfArray {

	int[] output(int[] input) { // {10,2,3,10,3,55,61,2}

		int tempOutput[] = new int[input.length];

		boolean flag = false;
		int count = 0;

		for (int index = 0; index < input.length; index++) {
			int num = input[index]; // 10

			for (int innerIndex = 0; innerIndex <= index; innerIndex++) {
				if (num != tempOutput[innerIndex]) // 0
					flag = true;
				if (num == tempOutput[innerIndex]) {
					flag = false;
					break;
				}
			}
			if (flag) {
				tempOutput[count] = num;
				count++;
			}
		}

		int outputArr[] = new int[count];

		for (int index = 0; index < count; index++) {
			outputArr[index] = tempOutput[index];
		}

		return outputArr;
	}

	public static void main(String[] args) {

		UniqueElementsOfArray uniqueElementsOfArray = new UniqueElementsOfArray();

		int[] inputArr = { 10, 2, 3, 10, 3, 55, 61, 2 };

		int outputArr[] = new int[inputArr.length];

		outputArr = uniqueElementsOfArray.output(inputArr);

		System.out.print("Expected output array is : " + Arrays.toString(outputArr));

	}

}
