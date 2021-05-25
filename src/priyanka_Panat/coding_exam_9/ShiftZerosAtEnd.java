
/*
Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
*/

package priyanka_Panat.coding_exam_9;

public class ShiftZerosAtEnd {

	int[] shiftZero(int[] input) {
		int count = 0;
		int[] output = new int[input.length];
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ShiftZerosAtEnd shiftZerosAtEnd = new ShiftZerosAtEnd();
		int[] inputArr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] result = shiftZerosAtEnd.shiftZero(inputArr);
		for (int index = 0; index < result.length; index++)
		System.out.println(result[index]);
	}
}
