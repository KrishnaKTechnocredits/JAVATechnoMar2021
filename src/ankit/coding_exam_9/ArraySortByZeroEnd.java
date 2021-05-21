/*
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
 */

package ankit.coding_exam_9;

public class ArraySortByZeroEnd {
	
	static int[] zeroAtEnd(int[] arr){
		int outputIndex = 0;
		int[] output = new int[arr.length];
		
		for(int index = 0; index < arr.length ; index++) {
			if(arr[index] != 0){
				output[outputIndex] = arr[index];
				outputIndex++;
			}
		}		
		return output;
	}
	
	static void displayAnswer(int[] arrOut) {
		for(int i =0 ; i < arrOut.length ;i++) {
			System.out.print(arrOut[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] input = {1,3,0,3,0,6,0,9,23,45};
		int[] output = zeroAtEnd(input);
		displayAnswer(output);
		}
}
