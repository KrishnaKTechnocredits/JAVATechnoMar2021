package ankit.coding_exam_9;

import java.util.Arrays;



public class ArraySortNegativeFirst {

	static int[] arraySortnegPos(int[] input) {
		int[] output = new int[input.length];
		int indexO=0;
		int index = 0;

		for(index = 0 ; index < input.length ; index++) {
			if(input[index] < 0) {
				output[indexO] = input[index];
				indexO++;
			}	
		}
		for(int indexI = 0 ; indexI < input.length ; indexI++) {
			if(input[indexI] > 0) {
				output[indexO] = input[indexI];
				indexO++;
			}	
		}
		return output;
	}

	public static void main(String[] args) {
		int[] input = {-1,3,4,5,-6,-7,6,-7,8,7} ;
		System.out.println(Arrays.toString(arraySortnegPos(input)));
	}

}
