/*Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}*/

package krishna_CodingTest_8;

public class ReturnUniqueElements {
	int[] returnUniqueNum(int[] arr) {
		int[] output = new int[8];
		int uniqueNum = 0;
		for (int index = 0; index < arr.length; index++) {
			boolean isNumPresent = false;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					isNumPresent = true;
					break;
				}
			}
			if (isNumPresent == false)
				output[uniqueNum] = arr[index];
			uniqueNum++;
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnUniqueElements returnUniqueElements = new ReturnUniqueElements();
		int[] givenArr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] arrOutput = returnUniqueElements.returnUniqueNum(givenArr);
		System.out.print("Unique output from given array is :");
		for (int index = 0; index < arrOutput.length; index++) {
			if (arrOutput[index] != 0)
				System.out.print(arrOutput[index] + " ");
		}
	}
}
