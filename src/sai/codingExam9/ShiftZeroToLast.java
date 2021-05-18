package sai.codingExam9;

public class ShiftZeroToLast {

	static int[] shiftZeros(int[] arr) {
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
		ShiftZeroToLast shiftZeroToLast = new ShiftZeroToLast();
		int[] arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = ShiftZeroToLast.shiftZeros(arr);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}
}
