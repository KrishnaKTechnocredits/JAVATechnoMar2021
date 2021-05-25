package shashank.coding_exam_9;

import java.util.Arrays;

/*Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
*/
public class ShiftZeroInEnd {
	int count = 0;

	public int[] shiftZeroInLeft(int[] array) {
		int output[] = new int[array.length];
		for (int index = 0; index < array.length; index++) {
			if (array[index] != 0)
				output[count++] = array[index];
		}
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShiftZeroInEnd shiftZeroInLeft = new ShiftZeroInEnd();
		int[] arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int output[] = shiftZeroInLeft.shiftZeroInLeft(arr);
		System.out.println("Output array is " + Arrays.toString(output));
	}

}
