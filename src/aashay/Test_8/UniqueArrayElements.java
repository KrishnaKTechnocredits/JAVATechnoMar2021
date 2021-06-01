package aashay.Test_8;
/*
 * Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
 */

public class UniqueArrayElements {

	private int[] uniqueArrayElement(int[] input) {
		int[] output = new int[input.length];
		//output[0] = input[0];
		int outputIndex=0;
		for (int index = 0; index < input.length; index++) {
			int tempNumber = input[index];
			boolean isNumberpresent = false;
			for (int innerIndex = 0; innerIndex < index; innerIndex++) {
				if (output[innerIndex] == tempNumber) {
					isNumberpresent = true;
					break;
				}
			}
			if (isNumberpresent == false) {
				output[outputIndex] = tempNumber;
				outputIndex++;
			}
		}
		return output;

	}

	public static void main(String[] args) {
		UniqueArrayElements uniqueArrayElements = new UniqueArrayElements();
		int[] input = new int[] { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output = uniqueArrayElements.uniqueArrayElement(input);
		for (int index = 0; index < output.length; index++) {
			System.out.print(" "+output[index]);
		}
	}

}
