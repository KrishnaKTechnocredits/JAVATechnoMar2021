package monika.Array_Coding_Exam;

import java.util.Arrays;

/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
		[0,0,0,0,0,0,0,0,0,0];
output :[1,3,3,6,9,23,45,0,0,0]*/
public class Practice_ShiftZerosAtEnd_Test9 {
	public int count = 0;

	boolean isNumPresentInArr(int[] output, int input) {
		for (int i = 0; i <= count; i++) {
			if (output[i] == input && input == 0)
				return true;
		}
		return false;
	}

	public int[] getOutputArr(int[] arr) {
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			int input = arr[index];
			boolean b = isNumPresentInArr(output, input);
			if (b == false) {
				output[count] = arr[index];
				count++;
			}
		}
		return output;
	}

	/*
	 * static long fact(int n) { if(n ==1 ) return 1; return n* fact(n-1);
	 * 
	 * }
	 */

	public static void main(String[] args) {
		Practice_ShiftZerosAtEnd_Test9 obj = new Practice_ShiftZerosAtEnd_Test9();
		int[] arr = { 1, 3, 0, 1, 3, 0, 6, 0, 9, 0, 23, 45 };
		System.out.println(Arrays.toString(obj.getOutputArr(arr)));
		// System.out.println(fact(5));
	}

}
