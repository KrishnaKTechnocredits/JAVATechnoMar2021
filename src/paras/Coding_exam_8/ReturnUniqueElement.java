/*
Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.
 */
package paras.Coding_exam_8;

public class ReturnUniqueElement {

	int[] uniqueElement(int[] arr) {
		int[] output = new int[arr.length];
		int length = 0;
		boolean isExist = false;
		for (int index = 0; index < arr.length; index++) {
			isExist = false;
			for (int innerindex = index + 1; innerindex < arr.length; innerindex++) {
				if (arr[index] == arr[innerindex]) {
					isExist = true;
					// break;
				}
			}
			if (isExist == false) {
				if (length < arr.length) {
					output[length] = arr[index];
					length++;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnUniqueElement returnUniqueElement = new ReturnUniqueElement();
		int[] arr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output = returnUniqueElement.uniqueElement(arr);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0) {
				System.out.println(output[index]);
			}
		}
	}
}
