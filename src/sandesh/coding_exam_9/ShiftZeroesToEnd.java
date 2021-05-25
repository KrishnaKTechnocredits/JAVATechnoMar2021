/*
Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
*/

package sandesh.coding_exam_9;

import java.util.Arrays;

public class ShiftZeroesToEnd {

	private int[] getIndividualElement(int[] inputArr) {
		int[] outputArr = new int[inputArr.length];
		int count = 0;
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] != 0) {
				outputArr[count] = inputArr[index];
				count++;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = new ShiftZeroesToEnd().getIndividualElement(input);
		System.out.println(Arrays.toString(output));

	}
}
