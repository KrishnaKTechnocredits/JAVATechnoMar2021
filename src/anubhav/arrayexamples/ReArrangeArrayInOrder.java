package anubhav.arrayexamples;

/*Shift all Zero's at the end.
 		input : [1,3,0,3,0,6,0,9,23,45];
		output : [1,3,3,6,9,23,45,0,0,0] */

public class ReArrangeArrayInOrder {

	int[] arrangeArrayElements(int[] input) {

		int[] output = new int[input.length];
		int count = 0;

		for (int index = 0; index < input.length; index++) { // 1
			boolean isZero = false;
			if (input[index] == 0) {
				isZero = true;
			}
			if (!isZero) {
				output[count] = input[index];
				count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ReArrangeArrayInOrder reArrangeArrayInOrder = new ReArrangeArrayInOrder();
		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		reArrangeArrayInOrder.arrangeArrayElements(input);
		int[] output = reArrangeArrayInOrder.arrangeArrayElements(input);
		for (int index = 0; index < output.length; index++) {
			System.out.print(output[index] + " ");
		}
	}
}
