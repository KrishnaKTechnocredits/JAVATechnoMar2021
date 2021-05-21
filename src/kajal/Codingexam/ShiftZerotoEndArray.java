/*
Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
*/
package kajal.Codingexam;

public class ShiftZerotoEndArray {

	int[] shiftZerotoEnd(int[] input) {
		int[] output = new int[input.length];
		int outputIndex = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[outputIndex] = input[index];
				outputIndex++;
			}

		}

		return output;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = new ShiftZerotoEndArray().shiftZerotoEnd(input);
		for (int index = 0; index < input.length; index++) {
			System.out.println(output[index] + " ");
		}
	}
}
