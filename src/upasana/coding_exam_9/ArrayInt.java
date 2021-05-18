/*
 Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
 */

package upasana.coding_exam_9;

import java.util.Arrays;

public class ArrayInt {

	int[] getOutput(int[] input) {

		int count = 0;
		int[] output = new int[input.length];

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0)
				output[count++] = input[index];
		}

		return output;
	}

	public static void main(String[] args) {
		ArrayInt arrayInt = new ArrayInt();
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = arrayInt.getOutput(input);
		System.out.println(Arrays.toString(output));

	}

}
