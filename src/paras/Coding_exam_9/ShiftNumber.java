/*
Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
 */
package paras.Coding_exam_9;

public class ShiftNumber {

	int[] shiftZero(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ShiftNumber shiftNumber = new ShiftNumber();
		int arr[] = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = shiftNumber.shiftZero(arr);
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}

	}
}
