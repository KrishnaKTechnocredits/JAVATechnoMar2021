package madhavi_Raut.CodingExam.Exam_09;
/*Programming Test - 9 [15 mins]
	 Shift all Zero's at the end.
	input : [1,3,0,3,0,6,0,9,23,45];
	output : [1,3,3,6,9,23,45,0,0,0]*/

import java.util.Arrays;

public class ArrayRearrangement {

	int[] getArrayReaaranged(int[] arr, int num) {
		int[] newArr = new int[arr.length];
		int newArrIndex = 0;
		for (int index = 0; index < arr.length; index++) {
			if (!(arr[index] == num)) {
				newArr[newArrIndex] = arr[index];
				newArrIndex++;
			}
		}
		for (int index = newArrIndex; index < newArr.length; index++) {
			newArr[index] = num;
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] newArr = new ArrayRearrangement().getArrayReaaranged(arr, 0);
		System.out.println("Rearranged array:");
		System.out.println(Arrays.toString(newArr));
	}
}
