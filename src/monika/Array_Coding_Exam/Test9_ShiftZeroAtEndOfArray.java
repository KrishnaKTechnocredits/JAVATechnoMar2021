package monika.Array_Coding_Exam;

import java.util.Arrays;

/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
		[0,0,0,0,0,0,0,0,0,0];
output :[1,3,3,6,9,23,45,0,0,0]*/
public class Test9_ShiftZeroAtEndOfArray {
	int[] getNewArrWithZeroAtEnd(int[] inputArr) {
		int[] outputArr = new int[inputArr.length];
		int count = 0;
		for (int index = 0; index < inputArr.length; index++) {
			if (inputArr[index] != 0) {
				outputArr[count] = inputArr[index];
				count++;
			}
		}
		return outputArr;
	}

	public static void main(String[] args) {
		Test9_ShiftZeroAtEndOfArray obj = new Test9_ShiftZeroAtEndOfArray();
		int[] inputArr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		System.out.println(Arrays.toString(obj.getNewArrWithZeroAtEnd(inputArr)));
	}
	
}
