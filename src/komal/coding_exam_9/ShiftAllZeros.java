package komal.coding_exam_9;

/*Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/
public class ShiftAllZeros {
	int[] shiftZerosToEnd(int[] arr) {
		int outputIndex = 0;
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] != 0) {
				output[outputIndex] = arr[index];
				outputIndex++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ShiftAllZeros shiftAllZeros = new ShiftAllZeros();
		int[] arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = shiftAllZeros.shiftZerosToEnd(arr);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}

}