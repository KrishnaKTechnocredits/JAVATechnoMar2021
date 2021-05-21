/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.
input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/

package krati_Jain.codingExam9;

import java.util.Arrays;

public class ShiftAllZerosArray {

	public static void main(String[] args) {
		int[] numArr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		ShiftAllZerosArray shiftAllZerosArray = new ShiftAllZerosArray();
		System.out.println(Arrays.toString(shiftAllZerosArray.shiftZeros(numArr)));
	}

	int[] shiftZeros(int[] numArr) {
		int count = 0;
		int[] oArr = new int[numArr.length];
		for (int index = 0; index < oArr.length; index++) {
			if (numArr[index] != 0) {
				oArr[count] = numArr[index];
				count++;
			}
		}
		return oArr;
	}
}
