/*Programming Test - 8 :


Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
 * 
 */

package sourabh.CodingExam_8;

public class FindUniqueElementsFromArray {
	int[] getUniqueElementsFromArray(int[] arrInput) {
		int[] output = new int[10];
		int uniqueNumIndex = 0;
		for (int index = 0; index < arrInput.length; index++) {
			boolean isNumPresent = false;
			for (int innerIndex = index + 1; innerIndex < arrInput.length; innerIndex++) {
				if (arrInput[index] == arrInput[innerIndex]) {
					isNumPresent = true;
					break;
				}
			}
			if (isNumPresent == false)
				output[uniqueNumIndex] = arrInput[index];
			uniqueNumIndex++;
		}
		return output;
	}

	public static void main(String[] args) {
		FindUniqueElementsFromArray findUniqueElementsFromArray = new FindUniqueElementsFromArray();
		int[] arrInput = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] arrOutput = findUniqueElementsFromArray.getUniqueElementsFromArray(arrInput);
		for (int index = 0; index < arrOutput.length; index++) {
			if (arrOutput[index] != 0)
				System.out.print(arrOutput[index]+" ");
		}
	}
}
