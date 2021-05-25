/*
 Programming Test - 8 :
Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
 */
package priyanka_Panat.coding_exam_8;

public class UniqueElements {

	int[] printUniqueElements(int[] arr) {
		int[] outputArray = new int[arr.length];
		int count = 0;
		boolean isUnique;
		for (int index = 0; index < arr.length; index++) {
			isUnique = false;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					isUnique = true;
				}
			}
			if (!isUnique) {
				outputArray[count] = arr[index];
				count++;
			}

		}
		return outputArray;
	}

	public static void main(String[] args) {
		int arrayWithDuplicates[] = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output = new UniqueElements().printUniqueElements(arrayWithDuplicates);
		for (int index = 0; index < output.length && output[index] != 0; index++)
		System.out.println(output[index]);

	}

}
