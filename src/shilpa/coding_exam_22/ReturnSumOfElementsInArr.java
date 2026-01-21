/*WAP to return the sum of all elements of an array, except ignore sections of numbers starting with 6 and extending to the next 9. Return 0 for No numbers.
	input 1: [1,3,5]
	output 1: 9
	input 2 : [4,5,6,12,2,9,1,3]
	output 2: 13
	input 3 : [2,1,6,9,11,6,19,12,9,2]
	output 3: 16
	input 4 : [6,1,4,5,9]
	output 4 : 0*/
package shilpa.coding_exam_22;

public class ReturnSumOfElementsInArr {

	int getSumOfElementsInArr(int[] arr) {

		int sumOfElements = 0;
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] != 6) {
				sumOfElements += arr[index];
			} else if (arr[index] == 6) {
				while (arr[index] != 9 && index < arr.length) {
					index++;

				}
			}
		}
		return sumOfElements;
	}

	public static void main(String[] args) {
		ReturnSumOfElementsInArr findSumOfArray = new ReturnSumOfElementsInArr();
		System.out.println("input - [2,1,6,9,11,6,19,12,9,2] - "
				+ findSumOfArray.getSumOfElementsInArr(new int[] { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 }));

	}

}
