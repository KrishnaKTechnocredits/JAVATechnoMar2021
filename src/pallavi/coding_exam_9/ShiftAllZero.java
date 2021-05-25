package pallavi.coding_exam_9;

/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/

public class ShiftAllZero {

	int[] zeroAtLast(int[] arr) {
		int[] output = new int[arr.length];
		int index1 = 0;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > 0) {
				output[index1] = arr[index];
				index1++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = new ShiftAllZero().zeroAtLast(input);
		for (int index1 = 0; index1 < output.length; index1++) {
			System.out.print(output[index1] + " ");
		}
	}

}
