 /*
 Programming Test - 8 :

Program 1: Return Unique elements from given array. [30 mins max]
input : {10,2,3,10,3,55,61,2};
Ouput : {10,2,3,55,61}
Hint : create new array Called output, insert eligible numbers and return output array.
Hint : Method should take int array as parameter and return an array.

Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13
 */
 
package upasana.coding_exam_8;

public class UniqueElementsArray {
	int[] uniqueElements(int[] input) {

		int index1 = 0;
		int[] arrDup = new int[input.length];
		int[] output = new int[input.length];

		for (int index = 0; index < input.length - 1; index++) {
			if (arrDup[index] == 1) {
				continue;
			}
			boolean flag = false; 
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					flag = true;
					arrDup[innerIndex] = 1;
					break;
				}
			}
			if (flag == false) {
				output[index1] = input[index];
				index1++;

			}
		}

		return output;
	}
	public static void main(String[] args) {

		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		UniqueElementsArray obj = new UniqueElementsArray();
		int[] output = obj.uniqueElements(input);
		for (int index = 0; index < output.length; index++) {
			if (output[index] != 0)
				System.out.print(output[index]+" ");
		}

	}
}
