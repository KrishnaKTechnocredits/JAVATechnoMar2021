package aashay.Test_9;
/*
 * Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]
 */

public class ShiftZerosAtEnd {
	
	int [] shiftZerosAtEnd(int[] input) {
		int [] output = new int[input.length];
		int count = 0;
		for(int index =0; index< input.length;index++) {
			if(input[index] !=0) {
				output[count]= input[index];
				count++;
			}
		}
		return output;
			
	}
	
	public static void main(String[] args) {
		ShiftZerosAtEnd shiftZerosAtEnd = new ShiftZerosAtEnd();
		int [] input = new int [] {1,3,0,3,0,6,0,9,23,45};
		int [] output =  shiftZerosAtEnd.shiftZerosAtEnd(input);
		for(int index = 0; index < output.length; index++) {
			System.out.print(output[index]+",");
		}
	}
}
