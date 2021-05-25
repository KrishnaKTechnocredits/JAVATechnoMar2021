//Program 1: Return Unique elements from given array.

package krati_Shukla.Exam8;

public class UniqueArray {
	
	void getUnique(int[] input) {
		int length = input.length;
		int count=0;
		int[] output = new int[length];
		for (int index=0; index<length; index++) { //10,2,3,10,3,55,61,2
			boolean isDuplicate = false;
			for (int innerIndex=index+1; innerIndex<length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				output[count] = input[index];
				System.out.println(output[count]);
				count++;
			}
		}
		
	}
	
	public static void main(String[] a) {
		UniqueArray uniqueArray = new UniqueArray();
		int[] arr = {10,2,3,10,3,0,55,61,2};
		uniqueArray.getUnique(arr);
	}

}
