//Shift all Zero's at the end.

package krati_Shukla.Exam9;

public class AllZeroSort {

	int[] getFinal(int[] input) {
		int oldLength = input.length;
		int count = 0;
		int[] output = new int[oldLength];

		for (int index = 0; index < oldLength; index++) {
			if (input[index] != 0) {
				output[count] = input[index];
				System.out.println(output[count]);
				count++;
			}
		}
		int newLength = oldLength - count;
		for (int newIndex = 0; newIndex < newLength; newIndex++) {
			output[count] = 0;
			System.out.println(output[count]);
			count++;
		}
		return output;
	}

	public static void main(String[] a) {
		AllZeroSort allZeroSort = new AllZeroSort();
		int[] arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] output = allZeroSort.getFinal(arr);
		for (int index=0; index<output.length; index++)
			System.out.println(output[index]);
	}

}
