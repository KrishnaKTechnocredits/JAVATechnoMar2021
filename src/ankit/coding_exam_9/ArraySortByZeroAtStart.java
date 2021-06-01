/*
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
 */

package ankit.coding_exam_9;

public class ArraySortByZeroAtStart {

	static int[] zeroAtStart(int[] input) {
		int[] output = new int[input.length];
		int countOfZero = 0;
		for(int index = 0; index < input.length ; index++) {
			if(input[index]==0) {
				countOfZero++;
			}
		}
		for(int index = 0; index < input.length ; index++) {
			if(input[index] !=0 ) {
				output[countOfZero] = input[index];
				countOfZero++;
			}
		}
		return output;
	}

	static void diaplayAnswer(int[] output) {
		for(int indexO = 0 ; indexO < output.length ; indexO++) {
			System.out.print(output[indexO] + " ");	
		}
	}

	public static void main(String[] args) {
		int[] input = {1,3,0,3,0,6,0,9,23,45};
		int[] output = zeroAtStart(input);
		diaplayAnswer(output);
	}
}
