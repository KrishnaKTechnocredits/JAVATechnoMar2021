package monika.Practise1.Revision;

import java.util.Arrays;

import aashay.Test;

/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
		[0,0,0,0,0,0,0,0,0,0];
output :[1,3,3,6,9,23,45,0,0,0]*/
public class Test9_PracticeVersion {

	int[] getOutput(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index] != 0) {
				output[count] = arr[index];
				count++;
			}
		}return output;
	}

	
	public static void main(String[] args) {
		Test9_PracticeVersion obj = new Test9_PracticeVersion();
		int[] arr = {1,2,3,0,4,0,5,1,0,0,3};
		System.out.println(Arrays.toString(obj.getOutput(arr)));
	
	
	}
}
