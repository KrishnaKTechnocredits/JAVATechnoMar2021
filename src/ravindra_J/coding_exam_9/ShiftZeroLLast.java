/*
 Programming Test - 9 [15 mins]
Shift all Zero's at the end.
input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
 */
package ravindra_J.coding_exam_9;

public class ShiftZeroLLast {
	void shiftZeroFromArray(int arr[]) {
		int[] output = new int[arr.length];
		int i = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean flag = false;
			if (arr[index] == 0) {
				flag = true;
			} else if (flag == false) {
				output[i] = arr[index];
				i++;
			}
		}
		System.out.print("Output : [");
		for (int j = 0; j < output.length; j++) {
			System.out.print(output[j] + " ");
		}
		System.out.print("]");
	}

	public static void main(String[] args) {
		ShiftZeroLLast shiftzerolast = new ShiftZeroLLast();
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		shiftzerolast.shiftZeroFromArray(input);
	}

}
