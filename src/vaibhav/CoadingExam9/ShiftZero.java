/*Coding Exam - 9 : 13th May'2021 [15 min]

Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]

*/

package vaibhav.CoadingExam9;

import java.util.Arrays;

public class ShiftZero {

	public static void main(String[] args) {

		int input[] = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int output[] = new int[input.length];

		int count = 0;
		for (int index = 0; index < input.length; index++) {
			int num = input[index];
			if (num != 0) {
				output[count] = num;
				count++;
			}
		}
		System.out.println("Input Array           : " + Arrays.toString(input));
		System.out.println("Expected output array : " + Arrays.toString(output));
	}
}
