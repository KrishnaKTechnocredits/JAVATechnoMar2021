/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/

package simmi.exam9;

public class ShiftArray {
	int[] shift(int[] input) {

		int[] temp = new int[input.length];
		int countIndex = 0;

		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				temp[countIndex] = input[index];
				countIndex++;
			}
		}
		return temp;
	}

	public static void main(String[] args) {

		int[] input = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		ShiftArray shiftArray = new ShiftArray();
		int[] output = shiftArray.shift(input);
		for (int i = 0; i < output.length; i++) {			
				System.out.print(" " + output[i]);
		}
	}
}
