package meenu.exam_8;

import java.util.Arrays;

/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
*/

public class UniqueElements {
	
	int[] getUniqueNum(int[] arr) {
		int[] outputArray = new int[5];
		int outputIndex = 0;
		for(int index = 0;index < arr.length; index++) {
			int innerIndex;
			for(innerIndex = 0;innerIndex<index;innerIndex++) {
				if(arr[index]== arr[innerIndex])
					break;
			}
			if(index == innerIndex) {
				outputArray[outputIndex]=arr[index];
				outputIndex++;
			}	
		}		
		return outputArray;
	}

	public static void main(String[] args) {
		int[] arr = {10,2,3,10,3,55,61,2};
		UniqueElements uniqueElements = new UniqueElements();
		System.out.println(Arrays.toString(uniqueElements.getUniqueNum(arr)));
	}
}
