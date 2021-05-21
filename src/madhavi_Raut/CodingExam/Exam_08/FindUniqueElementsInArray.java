package madhavi_Raut.CodingExam.Exam_08;

import java.util.Arrays;

/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.*/

public class FindUniqueElementsInArray {

	int[] getUniqueElementsInArray(int[] arr) {
		int[] newArr = new int[arr.length - 1];
		Arrays.sort(arr);
		newArr[0] = arr[0];
		int newArrIndex = 1;
		for (int index = 1; index < arr.length; index++) {
			if (!(arr[index - 1] == arr[index])) {
				newArr[newArrIndex] = arr[index];
				newArrIndex++;
			}
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] newArr = new FindUniqueElementsInArray().getUniqueElementsInArray(arr);
		System.out.println("Below is the array with unique values:");
		for (int index = 0; index < newArr.length; index++) {
			if (!(newArr[index] == 0))
				System.out.println(newArr[index]);
		}
	}
}
